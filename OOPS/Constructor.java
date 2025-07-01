//*Constructor: */
//-> A constructor in Java is a special method that is used to initialize objects.
//-> The constructor is called when an object of a class is created.
//-> It can be used to set initial values for object attributes:

public class Constructor {
    int x;
    public  Constructor(){
        x=22;
    }
public static void main(String[] args) {
    Constructor Obj=new Constructor();
    System.out.println(Obj.x);
    
}    
}

//! Why should we use Constructor ?
//?Initialize object	Set default or user-defined values
//? Automatic call	Less code, fewer mistakes
// class Car {
//     Car() {
//         System.out.println("Constructor is called automatically!");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//   
//         Car myCar = new Car();  
//     }
// }
//        output:  Constructor is called here automatically

//?Flexibility	Multiple ways to create an object
//?Cleaner code	Structured and readable
//?Supports encapsulation	Ensures valid object state 

//! Rules:
 //->constructor name must match the class name, and it cannot have a return type (like void).
//-> Also note that the constructor is called when the object is created.