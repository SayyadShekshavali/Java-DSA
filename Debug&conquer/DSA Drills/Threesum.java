
//! 7.5.2024 Wednessday

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

 class Threesum {
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        int target=0;
        Arrays.sort(nums);
        Set<List<Integer>> unique=new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
              int sum=nums[i]+nums[l]+nums[r];
             if(sum==target){
                result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;
                r--;
              }
              else if(sum<target){
                l++;
              }
              else{
                r--;
              }
            }
        }
        result.addAll(unique);
        System.out.println(" 3 Sums:"+result);

    }
    
}
