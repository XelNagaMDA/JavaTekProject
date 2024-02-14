package md.tekoway.classesandobjects.autoservicetask;

public class Car {

    public String vinCode;
    public String make;
    public Person owner;

    public Car(String vinCodeInput, String carMake, Person carOwner){

        this.vinCode = vinCodeInput;
        this.make = carMake;
        this.owner = carOwner;
        System.out.println("Now there is a car in the service of type: " + carMake);
    }
}
