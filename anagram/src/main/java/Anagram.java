import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> list){
        List<String> anagram = new ArrayList<>();
        char [] c = word.toCharArray();
        Arrays.sort(c);
        String wordInOrder = new String(c);
        for ( String s : list) {
            char [] d = s.toCharArray();
            Arrays.sort(d);
            String wordFromList = new String(d);
            if( wordInOrder.equals(wordFromList) ) {
                anagram.add(s);
            }
        }
        return anagram;
    }
}
