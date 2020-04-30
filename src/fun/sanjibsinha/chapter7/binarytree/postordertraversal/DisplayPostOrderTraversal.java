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

public class DisplayPostOrderTraversal {

    public static void main(String[] args) {

        BinaryTreeNotRecursive tree = new BinaryTreeNotRecursive();
        BinaryTreeNotRecursive.TreeNodeClass root = new BinaryTreeNotRecursive.TreeNodeClass("A");
        tree.root = root;
        tree.root.left = new BinaryTreeNotRecursive.TreeNodeClass("B");
        tree.root.left.left = new BinaryTreeNotRecursive.TreeNodeClass("C");
        tree.root.left.left.left = new BinaryTreeNotRecursive.TreeNodeClass("D");

        tree.root.left.right = new BinaryTreeNotRecursive.TreeNodeClass("E");
        tree.root.right = new BinaryTreeNotRecursive.TreeNodeClass("F");
        tree.root.right.right = new BinaryTreeNotRecursive.TreeNodeClass("G");
        tree.root.right.right.left = new BinaryTreeNotRecursive.TreeNodeClass("H");
        tree.root.right.right.right = new BinaryTreeNotRecursive.TreeNodeClass("I");

        System.out.println();
        // post order traversal without recursion
        System.out.println("The nodes of binary tree on post order iterative way...");
        tree.postOrderWithoutRecursion();

        System.out.println(); // insert new line


    }
}
