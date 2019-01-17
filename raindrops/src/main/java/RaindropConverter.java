class RaindropConverter {
    private static final String [][] factor = {{"3" ,"Pling"},{"5","Plang"},{"7","Plong"}};

    static String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0 ; i < factor.length ; i++){
            if(number%Integer.parseInt(factor[i][0]) == 0 && number !=0){
                stringBuilder.append(factor[i][1]);
                }
            }
        return (!stringBuilder.toString().equals(""))? stringBuilder.toString() : String.valueOf(number);
    }
}
