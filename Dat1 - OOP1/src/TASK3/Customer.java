package TASK3;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int ID;


    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName +","+ " Last name: " + lastName +","+ " Username: " + userName +","+ " User ID: " + ID;
    }


    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getID() {
        return ID;
    }
}
