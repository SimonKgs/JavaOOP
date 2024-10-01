package person;

// definition of a class
// in a file only one class can be public
public class Person {

    // static variable it is from the class not from the object created
    // will use it as counter of how many objects were created
    private static int counter = 0;
    private static int id = 0;


    // attributes of a class
    private String name, lastname;
    private final int personId; // final indicates that this will not change

    // constructor
    public Person(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
        // Using the static property
        Person.counter++;
        // using a static property to create unique ids
        this.personId = ++Person.id;
    }

    // method of a class
    public void showPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("Lastname: " + this.lastname);
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public int getPersonId() {
        return personId;
    }

    public static int getCounter() {
        return Person.counter;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // here we are overwriting string method
    // now if we print the object it will print this instead of
    // the position of the object on memory
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", personId=" + personId +
                '}';
    }
}
