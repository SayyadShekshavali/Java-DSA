
import java.util.LinkedList;
import java.util.Queue;


public class Binarytree {
 static class Node{
   int data;
   Node left;
   Node right;

     Node(int data) {
    this.data=data;
    this.left=null;
    this.right=null;    
    }
    
}

static  class Binarytree1{
        static int idx = -1;
       public  static Node buildTree(int[] Nodes){
      idx++;
     if(Nodes[idx]==-1||idx>=Nodes.length){
        return null;

     }
     Node newNode=new Node(Nodes[idx]);
     newNode.left=buildTree(Nodes);
     newNode.right=buildTree(Nodes);
     
return newNode;
       } 

    }
 //! Pre-Order  
public static void preOrder(Node root){
   if(root==null){
      return;
   }
   System.out.print(root.data+" ");
   preOrder(root.left);
   preOrder(root.right);
}

//! IN-order
public static void inOrder(Node root){
   if(root==null){
      return;
   }

   inOrder(root.left);
   System.out.print(root.data+" ");
   inOrder(root.right);
}

//! Post-Order
public static void postOrder(Node root){
   if(root==null){
      return;
   }

   preOrder(root.left);
   preOrder(root.right);
    System.out.print(root.data+" ");
}

//! LevelOrder
public static void leveltOrder(Node root){
if(root==null){
   return;
}
Queue<Node>  q=new LinkedList<>();
   q.add(root);
   q.add(null);
   while(!q.isEmpty()){
   Node CurrentNode=q.remove();
   if(CurrentNode==null){
      System.out.println();
      if(q.isEmpty()){
      break;
      }
      else{
         q.add(null);
      }
   }
   else{
      System.out.print(CurrentNode.data+" ");
       if(CurrentNode.left!=null){
        q.add(CurrentNode.left);
       }
       if(CurrentNode.right!=null){
         q.add(CurrentNode.right);
       }
   }

}

}
//! Count Nodes &&SumofNodes
public static int countNodes(Node root){
   if(root==null){
     return 0;
   }
  int leftNode=countNodes(root.left);
  int rightNode=countNodes(root.right);
  //!for countNodes
//   return  leftNode+rightNode+1;
//! For SumNOdes
return leftNode+rightNode+root.data;
}

public static int height(Node root){
   if(root==null){
      return 0;
   }
     int leftNode=height(root.left);
     int rightNode=height(root.right);
     int Maxheight=Math.max(leftNode,rightNode)+1;
     return Maxheight;
}
public static int Diameter(Node root){
   if(root==null){
      return 0;
   }
   int diam1=Diameter(root.left);
   int diam2=Diameter(root.right);
   int diam3=height(root.left)+height(root.right)+1;
   return Math.max(diam3,(Math.max(diam1, diam2)));
}

public static void main(String[] args) {
     int[] Nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     Node root= Binarytree1.buildTree(Nodes);
   //   System.out.println("Preorder:");
   //   preOrder(root);
   //   System.out.println("");
   //        System.out.println("inOrder:");

   //   inOrder(root);
   //   System.out.println(""); 
      //   System.out.println("PostOrder:");
   //   postOrder(root);
   // // leveltOrder(root); 
   // System.out.println(countNodes(root));
   
     System.out.println(  height(root));
     System.out.println(Diameter(root));
   }
}