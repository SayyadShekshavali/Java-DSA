
import java.util.LinkedList;

public class CLL {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addFirst(2);
        list.addLast(9);
        System.out.println(list);
        list.remove(1);
        list.add(6);
        list.add(99);
        System.out.println(list.size());
        
        for (int i =0; i <list.size(); i++) {
         System.out.println(list.get(i));   
        }
    }
}
