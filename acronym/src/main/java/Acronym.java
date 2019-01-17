import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Acronym {

    String phrase;

    Acronym(String phrase) {
        StringBuilder acronym = new StringBuilder();
        List<String> words = Arrays.asList(phrase.split("\\s+"));
        for (String p : words){
            acronym.append(String.valueOf(p.charAt(0)).toUpperCase());
        }
        this.phrase = acronym.toString();
    }

    String get() {
        return phrase;
    }

}
