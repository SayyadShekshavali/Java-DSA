public class Recursion {
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1; 
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        } else {
            return binarySearch(arr, mid + 1, high, key);
        }
    }
       public static boolean isSorted(int[] arr,int n){
         if (n == 1 || n == 0) {
            return true;
        }

        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }

     
        return isSorted(arr, n - 1);
        
    }
    
       public static int Fibonacci(int n){
        if(n==0){
            return n ;
        }
       return n * Fibonacci(n-1)+Fibonacci(n-2);
        
    }
    public static int Factorial(int n){
        if(n==0){
            return 1 ;
        }
       return n * Factorial(n-1);
        
    }
    public static  void Printnumber(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+"\n");
        Printnumber(n-1);
    }
    public static void main(String[] args) {
        
        int n=5;
        int[] arr={1,2,3,4,5};
        // Printnumber(n);
        // int result = Factorial(n);
        // System.out.println("Factorial of " + n + " is: " + result);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(Fibonacci(i) + " ");
        // if(isSorted(arr, n)){
        //     System.out.println("Sorted");
        // }
        // else{
        //     System.out.println("UNSorted");   
        // }

        // }
       int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
