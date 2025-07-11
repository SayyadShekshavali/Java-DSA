import java.util.ArrayList;
import java.util.List;

public class Backtracking {
 
    public static void PrintSubsets(List<Integer> subsets) {
        System.out.print(subsets);
    }
public static void generateSubsets(int[] arr,int i,List<Integer> current){
    if(i==arr.length){
        PrintSubsets(current);
        return;
    }
         //! Include the current element
    current.add(arr[i]);
    generateSubsets(arr, i+1, current);

            //! Exclude the current element
    current.remove(current.size() - 1);
    generateSubsets(arr, i+1, current);

}
    
    public static void main(String[] args) {
        
        int[] arr={1,2,3};
    
        generateSubsets(arr,0,new ArrayList<>());
    }
}
