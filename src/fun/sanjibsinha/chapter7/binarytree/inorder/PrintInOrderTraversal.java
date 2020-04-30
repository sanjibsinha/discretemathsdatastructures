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

public class PrintInOrderTraversal {

    public static void main(String[] args) {

        InOrderBinaryTreeRecursive tree = new InOrderBinaryTreeRecursive();
        InOrderBinaryTreeRecursive.TreeNodeClass root = new InOrderBinaryTreeRecursive.TreeNodeClass("D");
        tree.root = root;
        tree.root.left = new InOrderBinaryTreeRecursive.TreeNodeClass("B");
        tree.root.left.left = new InOrderBinaryTreeRecursive.TreeNodeClass("A");

        tree.root.left.right = new InOrderBinaryTreeRecursive.TreeNodeClass("C");
        tree.root.right = new InOrderBinaryTreeRecursive.TreeNodeClass("E");
        tree.root.right.right = new InOrderBinaryTreeRecursive.TreeNodeClass("F");

        System.out.println();

        tree.inOrder();

        System.out.println();
    }
}
