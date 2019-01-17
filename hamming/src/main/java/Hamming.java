import java.util.stream.IntStream;

class Hamming {
    public static final String EMPTY_STRING = "";
    String leftStrand;
    String rightStrand;


    Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        return (int) IntStream.range(0, rightStrand.length())
                .filter(i -> rightStrand.charAt(i) !=(leftStrand.charAt(i)))
                .count();
    }

}
