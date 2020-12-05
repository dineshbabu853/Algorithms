
public class flat {
    Node root;
    public static void main(String[] args) {
        flat obj = new flat();
        obj.root = new Node(5);
        obj.root.left=new Node(4);
        obj.root.right=new Node(7);
        Node header = new Node(-1);
        Node head = convertToLL(obj.root , header);
        displayLinkedList(head);
    }

    private static void displayLinkedList(Node head) {
        while (head.right!=null){
            System.out.println(head.data);
            head=head.right;
        }
    }

    private static Node convertToLL(Node root, Node header) {
        if(root==null)
            return null;
        Node newNode = new Node(root.data);
        header.right=newNode;
        //System.out.println(newNode.data);
        header=header.right;
        System.out.println(header.data);
        convertToLL(root.left , header);
        convertToLL(root.right , header );
        return header;
    }
}
