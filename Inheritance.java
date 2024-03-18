import java.util.Scanner;
class Animal {
    protected String name;
    protected String sound;

    // Constructor to initialize name and sound
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Method to make the animal sound
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}

// Subclass Dog inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name, "Woof");
    }
}

// Subclass Cat inheriting from Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name, "Meow");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the Dog name: ");
        String dogName = scanner.nextLine();
        System.out.print("enter the Cat name: ");
        String catName = scanner.nextLine();
        // Create a Dog object
        Dog dog = new Dog(dogName);
        // Create a Cat object 
        Cat cat = new Cat(catName);
        dog.makeSound();
        cat.makeSound();
        scanner.close();
    }
}
