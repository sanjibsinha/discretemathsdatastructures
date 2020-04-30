package fun.sanjibsinha.chapter7.binarytree.preordertraversal;

/**
 * In our example: A B C D E F
 A
 / \
 B   E
 / \   \
 C   D   F

 */

public class PreOrderTreeWithRecursion {

    public static void main(String[] args) {

        // construct the binaryTree object to traverse without recursion
        BinaryTreeWithRecursion binaryTree = new BinaryTreeWithRecursion();
        BinaryTreeWithRecursion.TreeNodeClass root = new BinaryTreeWithRecursion.TreeNodeClass("A");
        binaryTree.root = root;
        binaryTree.root.left = new BinaryTreeWithRecursion.TreeNodeClass("B");
        binaryTree.root.left.left = new BinaryTreeWithRecursion.TreeNodeClass("C");

        binaryTree.root.left.right = new BinaryTreeWithRecursion.TreeNodeClass("D");
        binaryTree.root.right = new BinaryTreeWithRecursion.TreeNodeClass("E");
        binaryTree.root.right.right = new BinaryTreeWithRecursion.TreeNodeClass("F");

        System.out.println();
        binaryTree.traversingPreOrderByCallingItself();
        System.out.println();

    }
}
