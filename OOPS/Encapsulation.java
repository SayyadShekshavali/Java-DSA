//! Encapsulation :
 //-->Encapsulation is to make sure that "sensitive" data is hidden from    users.
//-->declare class variables/attributes as private
//-->provide public get and set methods to access and update the value of a  private variable

class  Person{
    private  String name;
    private int age;
    public void Setname(String n){
        name=n;
    }
    public String Getname(){
        return name;
    }

     public void Setage(int a){
        age=a;
    }
    public int Getage(){
        return age;
    }

}
public class Encapsulation {
    public static void main(String[] args) {

        Person Obj=new Person();
        Obj.Setname("Ramu");
        Obj.Setage(20);
        System.out.println("Name:"+Obj.Getname()+"\n"+"Age:"+Obj.Getage());
        
    }
}
