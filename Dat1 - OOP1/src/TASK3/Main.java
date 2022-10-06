package TASK3;

import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args) {

      Customer customer1 = new Customer("Reece","James", "Reece24");
      Customer customer2 = new Customer("Ben", "Chilwell", "Chilly21");
      Customer customer3 = new Customer("Christian", "Pulisic", "Chris11");
      Customer customer4 = new Customer("Kai", "Havertz", "KingKai");
      Customer customer5 = new Customer("Wesley", "Fofana", "Wes33");
      Customer customer6 = new Customer("Raheem", "Sterling", "RaheemS");

      customers.add(customer1);
      customers.add(customer2);
      customers.add(customer3);
      customers.add(customer4);
      customers.add(customer5);
      customers.add(customer6);

      printCustomers(customers);

    }

    static void printCustomers(ArrayList<Customer> x){

        for (Customer i:customers) {

            System.out.println(i);

        }

    }
}
