public class Stack {
    //*  Node creation
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //*  Stack head assingment
    static class Stack1 {
        public static Node head;

        //*  Check  is empty
        public static boolean isEmpty() {
            return head == null; 
        }

        //*  Push element 
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //* Pop element 
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //*  Peek element  stack
        public static int peek() {
            if (isEmpty()) {
                
                return -1;
            }
            return head.data; 
        }
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); 
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Top element after pop: " + stack.peek());
    }
}
