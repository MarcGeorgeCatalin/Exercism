import java.util.stream.IntStream;

class LargestSeriesProductCalculator {

    String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        if (!inputNumber.isEmpty() && !inputNumber.matches("(([-+])?[0-9]+(\\.[0-9]+)?)+")){
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
            this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

        if( numberOfDigits > inputNumber.length() ){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        if( numberOfDigits < 0 ){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        return numberOfDigits == 0 ? 1 :
                IntStream.range(numberOfDigits, inputNumber.length()+1)
                .map( i -> inputNumber.substring(i-numberOfDigits, i)
                            .chars()
                            .map(Character::getNumericValue)
                            .reduce((a, b) -> a*b ).getAsInt())
                .max()
                .getAsInt();
    }
}
