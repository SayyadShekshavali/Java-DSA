public class BubbleSort {
   
  void swap(int[] nums,int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
  }

    void bubbleSort(int[] nums,int n){
        for (int i = 0; i < n-1; i++) {
        for(int j=0;j<n-i-1;j++){
            if(nums[j]>nums[j+1]){
                swap(nums,j,j+1);
            }
        }    
        }
    }
        void printSorted(int[] nums,int n){
         for (int i = 0; i < n; i++) {
          System.out.println(nums[i]+" ");   
         }
           
        }
        

    public static void main(String[] args) {
        int [] nums={1,5,4,2,3};
        int n=5;
          BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(nums,n);
        sorter.printSorted(nums,n);
       
    }
}
