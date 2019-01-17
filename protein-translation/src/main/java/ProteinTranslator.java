import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

class ProteinTranslator {
    List<String> translate(String rnaSequence) {
        List<String> s = new ArrayList<>();
        for(int i = 0 ; i < rnaSequence.length()-2 ; i+=3){
            if( !"STOP".equals(Protein.valueOf(rnaSequence.substring(i, i+3)).getS()) ){
                s.add(Protein.valueOf(rnaSequence.substring(i, i+3)).getS());
            }else{
                return s;
            }
        }
        return s;
    }
}