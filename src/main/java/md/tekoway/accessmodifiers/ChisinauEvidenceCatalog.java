package md.tekoway.accessmodifiers;

import md.tekoway.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person cristina = new Person();
        System.out.println(cristina.isRetired);

        cristina.isRetired = true;

        if (cristina.isRetired) {
            System.out.println("Cristina is retired.");
        } else {
            System.out.println("Cristina is not retired.");
        }

        Person eliza = new Person(3423532L, "Married", "Eliza", false);
        System.out.println("Available info about object eliza: " + eliza.isRetired);

        if (eliza.isRetired) {
            System.out.println("Eliza is retired.");
        } else {
            System.out.println("Eliza is not retired.");
        }

        Person marcel = new Person(43543675L, "Marcel");
        System.out.println("Available info about marcel object is: " + marcel.isRetired);

        if (marcel.isRetired) {
            System.out.println("Marcel is retired.");
        } else {
            System.out.println("Marcel is not retired.");
        }
        System.out.println(Person.hasBrain);
        Person.hasLungs = true;
        System.out.println(Person.hasLungs);

    }
}
