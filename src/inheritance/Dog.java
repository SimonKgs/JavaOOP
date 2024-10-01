package inheritance;

// to inherit from another class it needs to extend it
public class Dog extends Animal{

    // to overwrite a method it should have the same sign
    // @override to advise that this method is overwriting another
    @Override
    protected void sleep() {
        System.out.println("Dog sleeping...");
        // To use the method from the father could use super
        // this way it will be executed the one here plus the one called
        super.sleep();
    }

    // It is permited change the accessibility of the method
    // but only to make it more accessible never less
    // I can make this method public but not private
    @Override
    protected void makeSound() {
        System.out.println("wauf");
    }
}
