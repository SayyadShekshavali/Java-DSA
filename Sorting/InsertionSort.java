public class InsertionSort {

   
    void sort(int[] nums, int n) {
        for (int i = 1; i < n; i++) {
            int key = nums[i];      
            int j = i - 1;

          
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

    
            nums[j + 1] = key;
        }
    }

  
    void printSorted(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 2, 3, 1};
        int n = nums.length;

        InsertionSort sorter = new InsertionSort();
        sorter.sort(nums, n);
        sorter.printSorted(nums, n);
    }
}
