// now it is inside a package, to use outside I need to import
// it is needed to have this at the beginning
package arithmetic;

public class Arithmetic {

    // definition of the attributes
    // private prevent its modifications from outside the class
    private int number1, number2;

    // Constructor, automatically Java create an empty constructor for every class
    // this makes reference to the attributes and methods of the class
    public Arithmetic(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    // I also can make more thant one constructor it is called constructor overload
    // Now I can create an object passing only one attribute, to the second will use 5 for the example
    public Arithmetic(int number1){
        this.number1 = number1;
        this.number2 = 5;
    }

    // to access from other packages to the methods must add public
    public void sum() {
        System.out.println(number1 + number2);
    }

    public void extract() {
        System.out.println(number1 - number2);
    }

    // encapsulation
    // setters are used to modify values within a class
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    // getters are for get values of attributes of a class
    public int getNumber1() {
        return this.number1;
    }

    public int getNumber2() {
        return this.number2;
    }
}
