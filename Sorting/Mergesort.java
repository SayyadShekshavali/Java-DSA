public class Mergesort {

    public void conquer(int[] nums, int si, int ei, int mid) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (nums[idx1] <= nums[idx2]) {
                merged[x++] = nums[idx1++];
            } else {
                merged[x++] = nums[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = nums[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = nums[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            nums[j] = merged[i];
        }
    }

    public void divide(int[] nums, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(nums, si, mid);
        divide(nums, mid + 1, ei);
        conquer(nums, si, ei, mid);
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 6, 3, 9, 1, 5};
        int n = nums.length;

        Mergesort ms = new Mergesort();
        ms.divide(nums, 0, n - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
