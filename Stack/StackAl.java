import java.util.*;


public class StackAl {
     static class Stack{

        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean  isEmpty(){
            return list.size()==0;
        }

        public static void push(int data){
            list.add(data);
        }
         //! */
        public static int Pop(){
            if (isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
           if( isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack stack1=new  Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(9);

        System.out.println(stack1.peek());
        System.out.println(stack1.Pop());
      stack1.push(854896);
      System.out.println(stack1);
    }
}
