package fun.sanjibsinha.chapter7.binarytree.preordertraversal;

/**
 * In our example: A B C D E F
      A
     / \
    B   E
   / \   \
  C   D   F

 */

public class PreOrderTreeTraversalWithoutRecursion {

    public static void main(String[] args) {

        // construct the binaryTree object to traverse without recursion
        BinaryTreeWithoutRecursion binaryTree = new BinaryTreeWithoutRecursion();
        BinaryTreeWithoutRecursion.TreeNodeClass root = new BinaryTreeWithoutRecursion.TreeNodeClass("A");
        binaryTree.root = root;
        binaryTree.root.left = new BinaryTreeWithoutRecursion.TreeNodeClass("B");
        binaryTree.root.left.left = new BinaryTreeWithoutRecursion.TreeNodeClass("C");

        binaryTree.root.left.right = new BinaryTreeWithoutRecursion.TreeNodeClass("D");
        binaryTree.root.right = new BinaryTreeWithoutRecursion.TreeNodeClass("E");
        binaryTree.root.right.right = new BinaryTreeWithoutRecursion.TreeNodeClass("F");

        // the binaryTree object will traverse the tree without recursion
        binaryTree.VisitTreeWithoutRecursion();
        System.out.println();


    }
}
