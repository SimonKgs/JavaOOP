package inheritance;

public class TestInheritance {

    // Polymorphic method
    // uses the base class in the hierarchy to allow
    // any subclass to override and use it
    static void printSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {

        Animal duck = new Animal();
        Dog lassy = new Dog();
        Cat juna = new Cat();

        // duck can access methods from animal
        duck.eat();
        duck.sleep();
        duck.makeSound();
        // dog can access its own methods plus inherited methods
        lassy.eat();
        // since Dog overrides sleep, this calls the Dog version
        lassy.sleep();
        lassy.makeSound();

        // Polymorphism
        // allows using the same method in different classes
        // after overriding makeSound in Cat, it behaves differently from Dog
        juna.makeSound();

        // using the polymorphic method I can pass any object of its own class
        // but also any of the classes who extend from it
        printSound(duck); // animal
        printSound(lassy); // dog
        printSound(juna); // cat

    }

}
