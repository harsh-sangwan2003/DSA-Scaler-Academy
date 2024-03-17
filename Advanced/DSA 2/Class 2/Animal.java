public class Animal {

    String animal = "Mammal";

    void print() {
        System.out.println("I am an animal");
    }

    static void display() {
        System.out.println("Hello");
    }
}

class Dog extends Animal {

    String name;

    Dog() {

    }

    Dog(String name) {
        this.name = name;
        System.out.println(animal);
        System.out.println(name);
    }

    void print() {
        System.out.println("I am a dog");
    }

    static void display() {
        System.out.println("Hello from dog.");
    }

    public static void main(String[] args) {

        Animal a = new Animal();
        a.print();
        a.display();

        a = new Dog();
        a.print();
        a.display();
    }
}
