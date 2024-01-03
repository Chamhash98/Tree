public class New { //root
    Node left, right; //childs of root
    int value; //adding values
    public New(int key){
        value = key;
        left = right = null;
    }
}
class bTree{
    Node root;
    public void structure(Node node){
        if(node != null ){ //!=false
            structure(node.left);
            System.out.print(" " + node.value);
            structure(node.right);
        }
    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(13);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(15);

        System.out.print("\nBinary Tree :- ");
        tree.structure(tree.root);
    }
}


