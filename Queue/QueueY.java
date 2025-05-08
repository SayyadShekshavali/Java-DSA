

public class QueueY {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;

        public Queue(int n) {
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
        if(rear==size-1){
          System.out.println("Queue is full");
            return; 
         }      
      rear++;
      arr[rear]=data;      
        }
        public static int deque(){
            if(isEmpty()){
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        } 
        public static void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    Queue q=new Queue(4);
    q.add(5);
    q.add(80);
    q.add(90);
    q.printQueue();
    
    System.out.println("Front element: " + q.peek());
    
    System.out.println("Dequeued element: " + q.deque());
    q.printQueue();
    
} 
}