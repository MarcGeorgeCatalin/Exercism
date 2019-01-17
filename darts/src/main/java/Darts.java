class Darts {
    int score ;

    Darts(double x, double y) {

        int distance = (int) Math.sqrt( Math.pow (x, 2)+ Math.pow( y, 2) );

        if ( distance <= 3.33 ){
            this.score = 10;
        }else if ( distance <= 6.33 ){
            this.score = 5;
        }else if ( distance <= 10){
            this.score = 1;
        }else if ( distance > 10 ){
            this.score = 0;
        }
    }

    int score() {
        return score;
    }

}
