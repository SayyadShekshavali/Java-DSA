//! Interface:
//-> An interface is a completely "abstract class" that is used to group related methods with empty bodies:
//? To access the interface methods, the interface must be "implemented"  by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class.
interface Animal {
  public void animalSound(); 
  public void sleep(); 
}

class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    
    System.out.println("Zzz");
  }
}
class Interface {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}


//! Multiple Inheritance :
// class Interface {
//   public static void main(String[] args) {
//     Pig myPig = new Pig();  
//     myPig.animalSound();
//     myPig.sleep();
//   }
// }
 
//  interface FirstInterface {
//   public void myMethod(); 
// }

// interface SecondInterface {
//   public void myOtherMethod(); 
// }

// class DemoClass implements FirstInterface, SecondInterface {
//   public void myMethod() {
//     System.out.println("Some text..");
//   }
//   public void myOtherMethod() {
//     System.out.println("Some other text...");
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     DemoClass myObj = new DemoClass();
//     myObj.myMethod();
//     myObj.myOtherMethod();
//   }
// }
 



