public class PangramChecker {
    protected final static char [] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    static public boolean isPangram(String input) {
        for(int i = 0 ; i<ALPHABET.length ; i++){
            if(input==null || !input.toLowerCase().contains(String.valueOf(ALPHABET[i]))){
                return false;
            }
        }
        return true;
    }
}
