package md.tekoway.methodstask;

public class Customer {
    private String name;
    private String sex;
    private int age;

    public Customer(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        if (age > 127 || age < 1) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setAge(int age) {
        if (age > 127 || age < 1) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
