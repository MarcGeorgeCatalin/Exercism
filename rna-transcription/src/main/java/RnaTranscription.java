class RnaTranscription {

   private final static char [][] COMPLEMENT ={{'G','C'},{'C','G'},{'T','A'},{'A','U'}};

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder(dnaStrand);

       for (int i=0 ; i<dnaStrand.length() ; i++){
           for (int x=0 ; x<COMPLEMENT.length ; x++){
               if(dnaStrand.charAt(i) == COMPLEMENT[x][0]) {
                  rnaStrand.setCharAt(i, COMPLEMENT[x][1]);
               }
           }
       }
       return rnaStrand.toString();
    }

}
