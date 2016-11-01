package solutions.session2.classes;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class Dog {
    private String name;
    private int age;
    private String ownerName;

    public Dog(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
    }

    public void bark() {
        System.out.println("I am " + this.name + " and I am barking");
    }
}
