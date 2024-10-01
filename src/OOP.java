// importing arithmetic and Person from its packages
import arithmetic.Arithmetic;
import person.Person;

public class OOP {

    public static void main(String[] args) {
        // using the static property
        //System.out.println("How many people = " + Person.getCounter());
        // after make the static property private, it is needed to use a method to access its value
        System.out.println("How many people = " + Person.getCounter());

        // Using person.Person class
        // Now I have a constructor so i can add the attributes on the initialization of the object
        Person pepe = new Person("Pepe", "Suarez");
        // assigning values to attributes, before make them private
        // pepe.name = "Pepe";
        // pepe.lastname = "Suarez";
        // calling a method of the class
        pepe.showPerson();
        // we can create a lot of objects using the class
        // each one has its owns attributes
        Person juan = new Person("Juan", "Alvarez");
        juan.showPerson();
        System.out.println(juan);

        // static property after create some people
        // it is called using the class not the object, Person in this case
        // It can be called through the object, but it is not a good practice
        System.out.println("How many people = " + Person.getCounter());


        // Using arithmetic.Arithmetic class
        // creating the new object
        // now we add the values on the constructor instead of assign later
        Arithmetic operation = new Arithmetic(3, 4);
        // calling the methods
        operation.sum();
        operation.extract();
        // Modify a value having a setter
        operation.setNumber1(12);
        // Now because it is private cannot do this
        // operation.number1 = 2;
        // now it will use the updated value, 12 + 4
        operation.sum();

        // using the overload constructor
        Arithmetic overload = new Arithmetic(7);
        System.out.println(overload.getNumber1());
        System.out.println(overload.getNumber2());
        overload.sum(); // 7 + 5
    }
}
