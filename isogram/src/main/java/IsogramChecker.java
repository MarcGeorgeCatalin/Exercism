import java.util.*;

class IsogramChecker {

    boolean isIsogram(final String phrase) {
        String string = phrase.replace(" ","").replace("-","").toLowerCase();
        Set<String> set = new HashSet<>();
        string.chars().forEach(c -> set.add(String.valueOf(c)));
        return  set.size() == string.length();
    }



}
