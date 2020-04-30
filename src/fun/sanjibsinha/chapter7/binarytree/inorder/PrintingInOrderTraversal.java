package fun.sanjibsinha.chapter7.binarytree.inorder;

/*
 *
 *
 * input:
 *     D
 *    / \
 *   B   E
 *  / \   \
 * A   C   F
 *
 * output: A B C D E F
 */

public class PrintingInOrderTraversal {

    public static void main(String[] args) {

        InOrderBinaryTreeNotRecursive tree = new InOrderBinaryTreeNotRecursive();
        InOrderBinaryTreeNotRecursive.TreeNodeClass root = new InOrderBinaryTreeNotRecursive.TreeNodeClass("D");
        tree.root = root;
        tree.root.left = new InOrderBinaryTreeNotRecursive.TreeNodeClass("B");
        tree.root.left.left = new InOrderBinaryTreeNotRecursive.TreeNodeClass("A");

        tree.root.left.right = new InOrderBinaryTreeNotRecursive.TreeNodeClass("C");
        tree.root.right = new InOrderBinaryTreeNotRecursive.TreeNodeClass("E");
        tree.root.right.right = new InOrderBinaryTreeNotRecursive.TreeNodeClass("F");

        System.out.println();

        tree.inOrderWithoutRecursion();

        System.out.println();

    }
}
