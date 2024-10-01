package inheritance;

public class Animal {

    // protected makes this method accessible only from the children's of this class
    // but not from other packages
    // while public makes the method accessible from everywhere
    // and private cannot be accessed from other classes
    protected void eat(){
        System.out.println("eating...");
    }

    protected void sleep(){
        System.out.println("sleeping...");
    }

    // this will be used to show polymorphism
    protected void makeSound() {
        System.out.println("grrrrrr");
    }

}


