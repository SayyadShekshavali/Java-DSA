public class Quicksort {

    public static void sorting(int[] arr, int si, int ei) {
        if (si < ei) {
            int pivotIdx = partition(arr, si, ei);
            sorting(arr, si, pivotIdx - 1);
            sorting(arr, pivotIdx + 1, ei);
        }
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {  
                i++;
             
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
  
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
        return i + 1;
    }

    public static void Printarr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 8, 2, 0};
        int ei = arr.length - 1;
        int si = 0;

        sorting(arr, si, ei);

        System.out.println("Sorted array:");
        Printarr(arr);  
    }
}
