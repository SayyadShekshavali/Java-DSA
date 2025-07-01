class Outer{
    public void Print(){
        System.out.println("Iam Outerclass");
    }
    class Inner{
    public void Printi(){
        System.out.println("Iam Innerclass");
    }
}
}


public class Innerclass {
    public static void main(String[] args) {
        Outer Outerclass=new Outer();
        Outer.Inner Innerclass=Outerclass.new Inner();
Outerclass.Print();
Innerclass.Printi();
    }
}
