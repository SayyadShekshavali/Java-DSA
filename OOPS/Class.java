
//! A Class is like an object constructor, or a "blueprint" for creating objects. 
//-->  variables within a class is called Attribute of the class.

//! An object is an instance of a class. When you create an object, you are creating a real-world entity that uses the structure defined by the class.
 
//! Static vs. Public(Class Methods)
 //-> static  accessed without creating an object of the class
 //-> unlike public, which can only be accessed by objects

public class Class {
    int x=10;
      String color;
    int speed;
    static void print(){
        System.out.println("Static method called directly");
    }
    public static void main(String[] args) {
        Class Obj=new Class();
        Obj.color="Red";
        Obj.speed=100;
        System.out.println(Obj.x+"\n"+Obj.color+"\n"+Obj.speed);
        print();
    }
    
}


//! Acess Modifiers: 
//? public: The code is accessible for all classes
//? private: The code is only accessible within the declared class
//? protected:The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses.