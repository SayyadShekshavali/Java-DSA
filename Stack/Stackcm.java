import  java.util.Stack;
public class Stackcm {
    
     public static void  PushAtButtom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top=s.pop();
        PushAtButtom(data, s);
        s.push(top);
     }

     public static  void revese(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top=s.pop();
        revese(s);
        PushAtButtom(top, s);
       
     }
    public static void main(String[] args) {
         Stack <Integer> s=new Stack<>();
        s.push(3);
        s.push(8);
        s.push(88);
   revese(s);
        System.out.println(s);
    }
}
