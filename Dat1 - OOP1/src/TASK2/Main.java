package TASK2;

import java.util.ArrayList;

public class Main {
    static ArrayList<Room> myRooms = new ArrayList<Room>();


    public static void main(String[] args) {

        Room room1 = new Room(3,6,2);
        Room room2 = new Room(4, 8, 3);
        Room room3 = new Room(5,10,4);

        myRooms.add(room1);
        myRooms.add(room2);
        myRooms.add(room3);

        

        Building building1 = new Building(myRooms,14,5,true);
        
        int test = countLampsInBuilding(building1);
        System.out.println(test);

        boolean oddBuilding = isNormal(building1);
        System.out.println(oddBuilding);

    }

    static int countLampsInBuilding(Building x) {

        int totalLamps = 0;
        for (Room i : x.getRooms()) {

            totalLamps += i.getNumberOfLamps();

        }
        return totalLamps;
    }

    static boolean  isNormal(Building x){

        if(x.getNumberOfFloors() > myRooms.size()){

            return true;

        }

        System.out.println("This is an odd building");
        return false;
    }


}
