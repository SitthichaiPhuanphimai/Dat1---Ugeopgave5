package TASK1;

public class Main {

    public static void main(String[] args) {

        Driver myDriver = new Driver("Sitthi", 28);
        Car myCar = new Car("BMW", "X5", 2021, "SUV");

        myCar.setDriver(myDriver);

        System.out.println(myCar.toString());
        System.out.println(myDriver.toString());

        Car myCar2 = new Car("Volvo", "XC60", 2022, "SUV");

        myCar.setDriver(myDriver);

        System.out.println(myCar2.toString());
        System.out.println(myDriver.toString());
    }


}
