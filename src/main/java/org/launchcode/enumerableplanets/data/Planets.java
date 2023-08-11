package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY ("Mercury"),
    VENUS ("Venus"),
    EARTH ("Earth"),
    MARS ("Mars"),
    JUPITER ("Jupiter"),
    SATURN ("Saturn"),
    URANUS ("Uranus"),
    NEPTUNE ("Neptune");

    private final String displayName;

    private final int yearLength;


    Planets(String displayName) {
        this.displayName = displayName;
        //this.yearLength = 0;
        switch(displayName){
            case("Mercury"):
                this.yearLength = 88;
                break;
            case("Venus"):
                this.yearLength = 255;
                break;
            case("Earth"):
                this.yearLength = 365;
                break;
            case("Mars"):
                this.yearLength = 687;
                break;
            case("Jupiter"):
                this.yearLength = 4333;
                break;
            case("Saturn"):
                this.yearLength = 10759;
                break;
            case("Uranus"):
                this.yearLength = 30687;
                break;
            case("Neptune"):
                this.yearLength = 60200;
                break;
            default:
                this.yearLength = 0;
        }
    }

    public String planetName(){
        return this.displayName.toLowerCase();
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getYearLength() {
        return yearLength;
    }
}
