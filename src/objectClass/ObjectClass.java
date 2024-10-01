package objectClass;

public class ObjectClass {

    // every class inherit from this by default
    // it let us have access to methods like equals(), toString(), hasCode()
    // we can overwrite a method
    String name;

    public ObjectClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.name;
    }

    public static void main(String[] args) {
        
        ObjectClass test = new ObjectClass("test");
        // instead of print the position on memory of the object
        // it will print the name
        // using the method of the class object will print this
        // name of package.Class@memoryPosition
        System.out.println(test);
    }
}
