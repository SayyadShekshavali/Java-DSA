
//! 7.5.2024 Wednessday

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Mejorityelement2{
    public static void  main(String[] args) {
        int[] nums={2,1,2};
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> result=new ArrayList<>();
        int thresehold=nums.length/3;
        for(Map.Entry<Integer,Integer> entry :count.entrySet()){
         int element=entry.getKey();
         int value=entry.getValue();
 if(value>thresehold){
    result.add(element);
 }
        }
        System.out.println("Majority Elements: " + result);
    }
}