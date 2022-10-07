package TASK2;

import java.util.ArrayList;

public class Building {

    final ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;


    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    //getter

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }


    //setter
    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setOfficeBuilding(boolean officeBuilding) {
        isOfficeBuilding = officeBuilding;
    }
}
