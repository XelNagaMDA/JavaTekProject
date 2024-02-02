package md.tekoway.variables;

public class VariablesAndComments {
    public static void main(String[] args) {
        // Declaration of variables
        // Game Consoles

        boolean isNew;
        boolean hasExternalHDD;

        char condition;
        char energyConsumption;

        byte usbSlots;
        byte connectedRemoteControllers;

        short releaseYear;

        int numberOFOwners;
        int releasedConsoles;

        long id;

        float osVersion;

        double price;
        double firmware;

        // Initialize an PS5 console

        isNew = false;
        hasExternalHDD = true;

        condition = 'A';
        energyConsumption = 'A';

        usbSlots = 4;

        releaseYear = 2018;

        releasedConsoles = 40000000;

        id = 454456756563L;

        osVersion = 13.2F;

        firmware = 43242.34523;


        System.out.println("Is the console new? Answer: " + isNew);
        System.out.println("My PS5 has external HDD: " + hasExternalHDD);

        System.out.println("The console is in an " + condition + " condition");
        System.out.println("The energy consumption is of type " + energyConsumption);

        System.out.println("The PS5 has " + usbSlots + " USB slots");

        System.out.println("The release year is: " + releaseYear);

        System.out.println("Till current day there were more than " + releasedConsoles + " released consoles" );

        System.out.println("The id of the console is: " + id + " with the " + osVersion + " os version and " + firmware + " firmware.");




    }
}
