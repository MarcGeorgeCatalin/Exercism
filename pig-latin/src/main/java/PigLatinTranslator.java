import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PigLatinTranslator {

    final static ArrayList<String> VOWELS = new ArrayList<String>(){{add("a"); add("e"); add("i"); add("o"); add("u");}};
    final static String XR = "xr";
    final static String YT = "yt";

    String translate(String word) {
        List<String> splited = Arrays.asList(word.split("\\s+"));
        for( String s : splited){
          word = word.replace(s, translateWord(s));
        }
        return word;
        }


    String translateWord(String word) {
        if ( VOWELS.contains(word.substring(0, 1)) ) {
            return  word + "ay";
        }else{
            int i = 0;
            switch (word.substring(0,2)){
                case XR: return word + "ay";
                case YT: return word + "ay";
                default:break;
            }
            while (  i < word.length() ) {
                if ( !VOWELS.contains(String.valueOf(word.charAt(i))) ){
                    if ( word.length() > i+2 && word.substring(i,i+2).equals("qu") ){
                        return word.substring(i+2, word.length()) + word.substring(0, i+2) + "ay";
                    }
                    if ( word.charAt(i) == 'y' ){
                        return word.substring(i, word.length()) + word.substring(0, i) + "ay";
                    }
                    i++;
                } else {
                    break;
                }
            }
            return word.substring(i, word.length()) + word.substring(0, i) + "ay";
        }

    }
}
