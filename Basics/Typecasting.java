

public class Typecasting {
    public static void main(String[] args) {
        //! Widening Casting: automatically when passing a smaller size type to a larger size type
     int Byte=9;
     double myDouble=Byte;
     System.out.println(Byte);
     System.out.println(myDouble);
        
     //*Narrow casting: manually by placing the type in parentheses () in front of the value *///

     double myDouble1=88.90372;
     int intergers=(int) myDouble1;
     System.out.println(myDouble1);
     System.out.println(intergers);

     // ^ Other types /
     //& String to int and int to string/
       String s = "123";
        int num = Integer.parseInt(s); 
        String nums=String.valueOf(num);
        System.out.println(s+"\n"+num+"\n"+nums);

         //&Chat to int & int to char/
         char a='A';
         int ascii=(int) a;

         int number=99;
         char b=(char) number;
         System.out.println(a+"\n"+ascii+"\n"+number+"\n"+b);
    }
}
