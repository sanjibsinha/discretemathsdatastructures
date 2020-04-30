package fun.sanjibsinha.chapter7.binarytree.preordertraversal;

// we need to use the Stack Collection framework
import java.util.Stack;

public class BinaryTreeWithoutRecursion {

    static class TreeNodeClass {
        String data;
        BinaryTreeWithoutRecursion.TreeNodeClass left, right;

        TreeNodeClass(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }

    }

    // root of the binary tree from where we start our journey
    BinaryTreeWithoutRecursion.TreeNodeClass root;

    /**
     * this method will visit tree nodes without recursion.
     */
    public void VisitTreeWithoutRecursion() {
        Stack<BinaryTreeWithoutRecursion.TreeNodeClass> nodes = new Stack<>();
        nodes.push(root);

        while (!nodes.isEmpty()) {
            BinaryTreeWithoutRecursion.TreeNodeClass current = nodes.pop();
            System.out.printf("%s ", current.data);

            if (current.right != null) {
                nodes.push(current.right);
            }
            if (current.left != null) {
                nodes.push(current.left);
            }
        }
    }

}
