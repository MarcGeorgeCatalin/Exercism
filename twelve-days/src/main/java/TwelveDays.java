import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class TwelveDays {

    final String VERSE = "On the %s day of Christmas my true love gave to me:";

    final Map<Integer, String[]> wordsSong = new HashMap<Integer, String[]>(){{
        put(1, new String[]{"first","a Partridge in a Pear Tree."});
        put(2, new String[]{"second","two Turtle Doves"});
        put(3, new String[]{"third","three French Hens"});
        put(4, new String[]{"fourth","four Calling Birds"});
        put(5, new String[]{"fifth","five Gold Rings"});
        put(6, new String[]{"sixth","six Geese-a-Laying"});
        put(7, new String[]{"seventh","seven Swans-a-Swimming"});
        put(8, new String[]{"eighth","eight Maids-a-Milking"});
        put(9, new String[]{"ninth","nine Ladies Dancing"});
        put(10, new String[]{"tenth","ten Lords-a-Leaping"});
        put(11, new String[]{"eleventh","eleven Pipers Piping"});
        put(12, new String[]{"twelfth","twelve Drummers Drumming"});
    }};

    final int DAY = 0;
    final int GIFT = 1;
    String verse(int verseNumber) {
        StringBuilder line = new StringBuilder(String.format(VERSE, wordsSong.get(verseNumber)[DAY]));
        boolean isTheFirstVerse = verseNumber == 1;
        while ( verseNumber > 0){
            String endPunctation = verseNumber > 1 ? "," : "\n";
            String beginPunctation = verseNumber == 1 && !isTheFirstVerse ? " and " : " ";
            line.append(beginPunctation).append(wordsSong.get(verseNumber)[GIFT]).append(endPunctation);
            verseNumber--;
        }
        return line.toString();
    }

    String verses(int startVerse, int endVerse) {
        return IntStream.rangeClosed(startVerse, endVerse)
                .collect(StringBuilder::new,
                        ((stringBuilder, value) -> stringBuilder.append(verse(value)).append(value == endVerse ? "" : "\n")),
                        StringBuilder::append).toString();
    }
    
    String sing() {
        return verses(1,12);
    }
}
