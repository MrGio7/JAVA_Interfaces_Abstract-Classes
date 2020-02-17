package transport;

import java.util.*;

public class Main {
    public static ArrayList<AbstractVehicle> filteredList = new ArrayList<AbstractVehicle>();

    public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester) {
        for (AbstractVehicle v : vehicles) {
            if(tester.test(v)) { 
                System.out.println(v.getName() + " " + v.getFuelLevel());
            }
        }
    }
    public static void main(String[] args) {
        
        System.out.println("*** Camels ***");

        Camel granny = new Camel("granny");
        Camel ferb = new Camel("ferb");
        Camel junior = new Camel("Junior");

        granny.eat(5);
        ferb.eat(15);
        for (int i = 0; i < 3; i++) {
            granny.move();
        }

        System.out.println("Granny Fuel Level: " + granny.getFuelLVL());

        System.out.println("\n*** From Abstract Class ***");

        BlueCamel alien = new BlueCamel("terest", 10);
        alien.addFuel(10);
        System.out.println("Alien " + alien.getFuelLevel());

        BlueCamel rane = new BlueCamel("rane");
        System.out.println("rane " + rane.getFuelLevel());

        System.out.println("\n*** Auto ***");
        Auto mazda = new Auto(1, "626", 2000);
        Auto mercedes = new Auto(2, "GL320", 2008);
        Auto vw = new Auto(0, "LT 45", 1983);
        vw.move(5);

        BlueCamel jipsy = new BlueCamel("Jipsy", 5);
        BlueCamel mozy = new BlueCamel("Mozy", 1);
        BlueCamel jona = new BlueCamel("Jona", 3);

        ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
        myList.add(rane);
        myList.add(alien);
        myList.add(mazda);
        myList.add(mercedes);
        myList.add(vw);
        myList.add(jipsy);

        System.out.println("\n*** MyList ***");
        System.out.println(myList.toString());

        printVehicles(myList, v -> v.getFuelLevel() < 0);

        System.out.println("\nCamel with positive fuel");
        printVehicles(myList, v -> (v.getFuelLevel() > 0) && (v instanceof BlueCamel));

        
    }
}