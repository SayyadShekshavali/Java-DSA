import java.util.*;
public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2, 5);
        list.set(1, 10);
    System.out.println(list);
      System.out.println(  list.remove(3));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        }
    
}
