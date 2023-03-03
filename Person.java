package java;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(int age) {
        this.name = "Unknown";
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters '
    and setters for name and age

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person(30);
        Person person4 = new Person("Mary", 25);

        System.out.println(person1.getName() + " " + person1.getAge()); // Unknown 0
        System.out.println(person2.getName() + " " + person2.getAge()); // John 0
        System.out.println(person3.getName() + " " + person3.getAge()); // Unknown 30
        System.out.println(person4.getName() + " " + person4.getAge()); // Mary 25
    }
}
