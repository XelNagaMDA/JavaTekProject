package md.tekoway.classesandobjects;

import md.tekoway.classesandobjects.autoservicetask.Car;
import md.tekoway.classesandobjects.autoservicetask.Garage;
import md.tekoway.classesandobjects.autoservicetask.Person;
import md.tekoway.classesandobjects.autoservicetask.Worker;

public class AutoServiceManager {
    public static void main(String[] args) {
        Garage autoDoctor;
        autoDoctor = new Garage();

        autoDoctor.address = "Stefan cel Mare 133";
        autoDoctor.surfaceM2 = 450.3F;

        System.out.println("The object autoDoctor has the following properties" + "  " + autoDoctor.address
                + "  " + autoDoctor.surfaceM2 + "  " + autoDoctor.capacity);

        autoDoctor.capacity = 50;

        System.out.println("The object autoDoctor has the following properties" + "  " + autoDoctor.address
                + "  " + autoDoctor.surfaceM2 + "  " + autoDoctor.capacity);

        Garage garageBotanica = new Garage();

        System.out.println("The object garageBotanica has the following properties" + "  " + garageBotanica.address
                + "  " + garageBotanica.surfaceM2 + "  " + autoDoctor.capacity);

        Worker vasile = new Worker();

        vasile.name = "Vasile";
        vasile.age = 44;

        System.out.println("The object vasile has the name: " + vasile.name + " and the age is: " + vasile.age);

        Worker victor = new Worker();

        System.out.println("The object vasile has the name: " + victor.name + " and the age is: " + victor.age);

        Person client1 = new Person("23452352453453");
        Person client2 = new Person();

        Car mazdaWJW344 = new Car("342342rgerg", "Mazda3", client1);
        Car renaultgbg433 = new Car("3422i94y4", "Clio", new Person("349024309576"));

        System.out.println("The car is: " + renaultgbg433.make + " and can be called at: " + renaultgbg433.owner.phoneNumber);

        System.out.println("The car is: " + mazdaWJW344.make + " and can be called at: " + mazdaWJW344.owner.phoneNumber);

    }
}
