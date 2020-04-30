package fun.sanjibsinha.chapter7.binarytree.postordertraversal;

/** The binary tree traversal will take place as the following structure
 * With the following output
 A
 *      / \
 *     B   F
 *    / \   \
 *   C  E    G
 *  /  / \
 * D  H  I
 *
 * output: D C E B H I G F A
 */

public class DisplayingPostOrderTraversal {

    public static void main(String[] args) {

        BinaryTreeRecursive tree = new BinaryTreeRecursive();
        BinaryTreeRecursive.TreeNodeClass root = new BinaryTreeRecursive.TreeNodeClass("A");
        tree.root = root;
        tree.root.left = new BinaryTreeRecursive.TreeNodeClass("B");
        tree.root.left.left = new BinaryTreeRecursive.TreeNodeClass("C");
        tree.root.left.left.left = new BinaryTreeRecursive.TreeNodeClass("D");

        tree.root.left.right = new BinaryTreeRecursive.TreeNodeClass("E");
        tree.root.right = new BinaryTreeRecursive.TreeNodeClass("F");
        tree.root.right.right = new BinaryTreeRecursive.TreeNodeClass("G");
        tree.root.right.right.left = new BinaryTreeRecursive.TreeNodeClass("H");
        tree.root.right.right.right = new BinaryTreeRecursive.TreeNodeClass("I");

        System.out.println();

        // post order traversal recursive way
        System.out.println("The nodes of binary tree on post order recursive way...");

        tree.postOrder();

        System.out.println();


    }
}
