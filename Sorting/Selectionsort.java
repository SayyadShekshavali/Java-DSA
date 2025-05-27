public class Selectionsort {
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void sort(int[] nums, int n) {
        for (int i = 0; i < n - 1; i++) {
            int currSmall = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[currSmall] > nums[j]) {
                    currSmall = j;
                }
            }
            swap(nums, i, currSmall);
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

        Selectionsort sorter = new Selectionsort();
        sorter.sort(nums, n);
        sorter.printSorted(nums, n);
    }
}
