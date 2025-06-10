
public class LL {
    Node head;
    private int size;
    
    LL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newnNode=new Node(data);
        if(head==null){
             head=newnNode;
        return;
            }
        newnNode.next=head;
        head=newnNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
       return;
           }
          
        Node currentNode=head;
           while(currentNode.next!=null){
            currentNode=currentNode.next;
           }
           currentNode.next=newNode;
        }
        public void println(){
            Node currentNode=head;
            while(currentNode!=null){
             System.out.println(currentNode.data+"->");
             currentNode=currentNode.next;
            }
            System.out.println("NULL");
            
        }

        public void deletefirst(){
            if(head==null){
                System.out.println("NUll");
            }
            head=head.next;
            size--;
        }
public void deletelast(){
    Node secondnode=head;
    Node secondnext=head.next;
while(secondnext.next!=null){
    secondnext=secondnext.next;
    secondnode=secondnode.next;
}
size--;
secondnode.next=null;

}
public int getSize(){
    return size;

}
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("This");
        list.addLast("is");
        list.println();
        list.addFirst("my");
        list.addLast("idea");
        list.println();
        list.deletefirst();
        list.deletelast();
        list.println();
        System.out.println(list.getSize());
        list.addLast("idea");
        System.out.println(list.getSize());
    }
    
}
