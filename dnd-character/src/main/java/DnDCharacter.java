import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

class DnDCharacter {
    Random random = new Random();

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    public DnDCharacter() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
    }

    public int ability(){
        return IntStream.of(random.ints(4,1,6 + 1)
                .toArray())
                .sorted()
                .skip(1)
                .sum();
    }

    int modifier(int input) {
        return (int) Math.floor((float) (input - 10) / 2);
    }

    public int getHitpoints() {
        return 10 + modifier(constitution);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }
}
