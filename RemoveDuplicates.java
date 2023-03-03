package java;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(4);

        System.out.println("Original ArrayList: " + listWithDuplicates);

        HashSet<Integer> set = new HashSet<>(listWithDuplicates);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("ArrayList without duplicates: " + listWithoutDuplicates);
    }
}class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound(); // The animal makes a sound
        dog.makeSound(); // The dog barks
        cat.makeSound(); // The cat meows
    }
}
