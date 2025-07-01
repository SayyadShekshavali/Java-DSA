//!Abstraction :
//--> Data abstraction is the process of hiding certain details and showing only essential information to the user.
//?--> Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//?--> Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

abstract class Men{
  public abstract void work();
  public void sleep() {
    System.out.println("Zzz");
  }
}
class Women extends  Men{

   public void  work(){
        System.out.println("Men should be strong to work");
    }
}
public class Abstraction {
public static void main(String[] args) {
    Women Obj=new Women();
    Obj.work();
    Obj.sleep();
}
    
}
