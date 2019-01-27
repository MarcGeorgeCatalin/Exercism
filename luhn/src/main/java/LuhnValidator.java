import java.util.stream.IntStream;

class LuhnValidator {

    boolean isValid(String candidate) {

        String stringToValidate = reverseString(candidate.replaceAll("\\s+",""));

        boolean isValid = false;
        if(isLongEnought(stringToValidate) && areOnlyNumbers(stringToValidate)){
            int sum = 0;
            for (int i=0; i<stringToValidate.length() ; i++){
                int n = Character.getNumericValue(stringToValidate.charAt(i));
                if( i%2 != 0 && i != 0){
                    sum += n*2 <= 9 ? n*2 : n*2 - 9;
                } else {
                    sum += n;
                }
            }
            isValid = sum%10 == 0 ? true : false;
        }
        return isValid;
    }

    boolean isLongEnought(String candidate) {
        return candidate.length() > 1;
    }

    boolean areOnlyNumbers(String candidate){
        try {
            Integer.parseInt(candidate);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    String reverseString(String candidate){
        StringBuilder reverseString= new StringBuilder();
        for(int i=candidate.length()-1 ; i>=0 ; i--){
            reverseString.append(candidate.charAt(i));
        }
        return reverseString.toString();
    }
}
