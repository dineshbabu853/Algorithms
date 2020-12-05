import java.util.Stack;

public class reverseLL {
   static Node head = null;
   // 2->3->6->7->8->9->null
   static void append(int data ){ //adding at last
       Node newnode = new Node(data);
       if( head == null ){  //initially our list will be empty
        head =  newnode ;
       }
       else {
           Node temp=head;  //pointer to the head
           while (temp.next!=null ){
               temp=temp.next;
           }
           temp.next=newnode;
           newnode.next=null;
       }
   }
   static void display(){ //printing
       Node temp=head;//pointer to the head
       while ( temp!=null ){ //traversing
           System.out.print(temp.data+"->");
           temp=temp.next;
       }
   }
  static Node reverseLinkedList(Node head){
       //logic
       Stack<Node> stack = new Stack<>();
       Node ptr = head;
       while (ptr.next!=null){
           stack.push(ptr);  //pushing all elements from LL into stack
           ptr=ptr.next;
       }
       //LIFO
      // 2->3->6->7->8->9->null
      // 9->8->7....
      head=ptr;
      while (!stack.isEmpty() ){
          ptr.next=stack.peek(); //top element of the stack
          ptr=ptr.next;
          stack.pop();
      }
      ptr.next=null;
      return head;
  }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
            append(i);
        System.out.println("Before reversing..");
        display();
        head = reverseLinkedList(head);
        System.out.println();
        System.out.println("After reversing..");
        display();
    }
}
