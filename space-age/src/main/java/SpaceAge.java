class SpaceAge {

    double seconds;

    final static double EARTH =  365.25;
    final static double MERCURY =  0.2408467;
    final static double VENUS = 0.61519726;
    final static double MARS = 1.8808158;
    final static double JUPITER = 11.862615;
    final static double SATURN = 29.447498;
    final static double URANUS = 84.016846;
    final static double NEPTUN =  164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }


    double onEarth() {
       return seconds/60/60/24/EARTH;
    }

    double onMercury() {
        return onEarth()/MERCURY;
    }

    double onVenus() {
        return onEarth()/VENUS;
    }

    double onMars() {
        return onEarth()/MARS;
    }

    double onJupiter() {
        return onEarth()/JUPITER;
    }

    double onSaturn() {
        return onEarth()/SATURN;
    }

    double onUranus() {
        return onEarth()/URANUS;
    }

    double onNeptune() {
        return onEarth()/NEPTUN;
    }

}
