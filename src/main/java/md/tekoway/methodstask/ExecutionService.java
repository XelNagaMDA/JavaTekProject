package md.tekoway.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20, 100));
        System.out.println(DataGeneratorUtil.getRandomInt(100, 120));
        System.out.println(DataGeneratorUtil.getRandomInt(150, 100));

        int randomInt = DataGeneratorUtil.getRandomInt(-50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));


        Customer customer1 = new Customer("Batman", "M", 33333);

        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(35);
        System.out.println(customer1.toString());

        customer1.setName("Batman The Knight");
        System.out.println(customer1.toString());

        Customer customer2 = new Customer("Robin", "F", 33);
        System.out.println(customer2.toString());

        System.out.println("The age of Batman is: " + customer1.getAge());
        System.out.println("The new name of Batman is: " + customer1.getName());


    }
}
