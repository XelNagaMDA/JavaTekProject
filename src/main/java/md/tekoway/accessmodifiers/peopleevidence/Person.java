package md.tekoway.accessmodifiers.peopleevidence;

public class Person {
    // Class variable
    public static boolean hasBrain = true;
    public static boolean hasLungs;

    // Private - Instance variable because it defines the objects of the Person class
    private long idnp;
    // Default - Instance variable
    String maritalStatus;
    // Protected - Instance variable
    protected String name;
    // Public - Instance variable
    public boolean isRetired;

    public Person() {
        System.out.println("This is a defined constructor without parameters");
    }

    public Person(long idnp, String name) {
        this.idnp = idnp;
        this.name = name;
        System.out.println("This is a defined constructor with 2 paramenters");
    }

    public Person(long idnp, String maritalStatus, String name, boolean isRetired) {
        this.idnp = idnp;
        this.maritalStatus = maritalStatus;
        this.name = name;
        this.isRetired = isRetired;
        System.out.println("This is a constructor with all 4 parameters.");

    }
}
