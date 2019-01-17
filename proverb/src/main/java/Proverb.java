import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Proverb {

    private final static String GENERIC_PHRASE = "For want of a %s the %s was lost.\n";
    private final static String END_PHRASE = "And all for the want of a %s.";
    private final static String EMPTY_STRING = "";

    String [] words;
    StringBuilder proverb ;

    Proverb(String[] words) {
        this.words = words;
        proverb = new StringBuilder();
    }

    String recite() {
        IntStream.range(0, words.length-1).forEach(i -> proverb.append(String.format(GENERIC_PHRASE, words[i], words[i+1])));
        return words.length > 0 ? proverb.append(String.format(END_PHRASE, words[0])).toString() : EMPTY_STRING;
    }

}
