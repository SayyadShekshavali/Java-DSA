//! Inheritance :
//  It is used to inherit attributes and methods from one class to another
// subclass (child) - the class that inherits from another class
// superclass (parent) - the class being inherited from
// To inherit from a class, use the extends keyword.
//If we don't want other classes to inherit from a class, use the final keyword:
class Car{
    public void drive(){
        System.out.println("Drive me ");
    }
}
class  Ship extends Car{
    public void seal(){
        System.out.println("Seal the Ship");
    }
}
public class Inheritance extends Ship {
    public static void main(String[] args) {
        Inheritance Obj=new Inheritance();
        Obj.drive();
        Obj.seal();
        
    }
}
