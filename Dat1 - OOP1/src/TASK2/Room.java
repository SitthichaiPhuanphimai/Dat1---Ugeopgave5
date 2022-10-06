package TASK2;

public class Room {

    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    Room(int doors, int lamps, int windows){

        this.numberOfDoors = doors;
        this.numberOfLamps = lamps;
        this.numberOfWindows = windows;

    }

    //getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }


    //setters
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
