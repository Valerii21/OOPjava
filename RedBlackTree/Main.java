public class Main {
    public static void main(String[] args) {
        RedBlackTree node = new RedBlackTree();

        node.insert(10);
        node.inorder();
        System.out.println("\n");
        node.insert(20);
        node.inorder();
        System.out.println("\n");
        node.insert(30);
        node.inorder();
        System.out.println("\n");
        node.insert(-23);
        node.inorder();
        System.out.println("\n");
        node.insert(-43);
        node.inorder();
        System.out.println("\n");
        node.insert(-443);
        node.inorder();
        System.out.println("\n");
        node.insert(-4434);
        node.inorder();
        System.out.println("\n");
        node.insert(-443434);
        node.inorder();


    }
}