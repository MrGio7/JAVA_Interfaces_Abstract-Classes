package transport;

import java.util.*;

public class Main {
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
    }
}