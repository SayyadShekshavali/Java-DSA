//! Thursday


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foursum {
    
    public static void main(String[] args) {
        int [] nums={1,0,-1,0,-2,2};
        List<List<Integer>> result=new ArrayList<>();
        int target=0;
        Arrays.sort(nums);
        int length=nums.length;
        for(int i=1;i<length-3;i++){
            if (i > 0 && nums[i - 1] == nums[i]) 
            continue;
            for(int j=i+1;i<length-2;i++){
                if (j > i+1 && nums[j - 1] == nums[j]) 
                continue;
                
               int l=j+1;
               int r=length-1;
                while(l<r){
                    int sum=nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                       result.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r])); 
                       l++;
                       r--;
                       while (r < l && nums[r - 1] == nums[r]) r++;
                        
                        while (r < l && nums[l + 1] == nums[l]) l--;
                    }
                    else if(sum<target){
                        r++;
                    }
                else{
             l--;
            }
                }
            }
        }
        System.err.println("4 sum:"+result);
    }
}
