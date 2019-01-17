import jdk.nashorn.internal.ir.annotations.Ignore;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Yacht {
    private final int LITTLE_STRAIGHT = 1;
    private final int BIG_STRAIGHT = 2;

    int [] dice;
    YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory= yachtCategory;
    }

    public int score() {
        switch (yachtCategory){
            case ONES:
                return computeScore(1);
            case TWOS:
                return computeScore(2);
            case THREES:
                return computeScore(3);
            case FOURS:
                return computeScore(4);
            case FIVES:
                return computeScore(5);
            case SIXES:
                return computeScore(6);
            case LITTLE_STRAIGHT:
                return straight(LITTLE_STRAIGHT);
            case BIG_STRAIGHT:
                return straight(BIG_STRAIGHT);
            case FOUR_OF_A_KIND:
                return fourOfAKind();
            case CHOICE:
                return choice();
            case YACHT:
                return yacht();
            case FULL_HOUSE:
                return full_house();
            default:
                return 0;
        }
    }

    private int choice() {
        int sum = 0;
        for(int i : dice){
            sum += i;
        }
        return sum;
    }

    private int computeScore(int diceFace){
        int sum = 0;
        for(int i=0 ; i<dice.length ; i++){
            if(dice[i] == diceFace){
                sum += diceFace;
            }
        }
        return sum;
    }

    private int fourOfAKind(){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        for (int diceValue : dice){
           Integer value = map.put(diceValue, map.get(diceValue) + 1)+1;
           if(value == 4){
               return 4 * diceValue;
           }
        }
        return 0;
    }

    private int yacht() {
        for (int i = 0; i < dice.length-1; i++) {
            if (dice[i] != dice[i + 1]) {
                return 0;
            }
        }
        return 50;
    }

    private int straight(int straightType) {
        Arrays.sort(dice);
        for (int i = 0; i < dice.length; i++){
            if (dice[i] != i+straightType ) {
                return 0;
            }
        }
        return 30;
    }

    private int full_house(){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};
        int diceOfPairOfTwo = 0;
        int diceOfPairOfThree = 0;

        for (int diceValue : dice){
            map.put(diceValue, map.get(diceValue) + 1);
        }
        if(map.containsValue(2) && map.containsValue(3) ){
            for (int diceValue : dice){
                if( map.get(diceValue) == 3 ){
                    diceOfPairOfThree = diceValue;
                }
                if( map.get(diceValue) == 2 ){
                    diceOfPairOfTwo = diceValue;
                }
            }
            return diceOfPairOfThree * 3 + diceOfPairOfTwo * 2;
        }
        return 0;
    }
}
