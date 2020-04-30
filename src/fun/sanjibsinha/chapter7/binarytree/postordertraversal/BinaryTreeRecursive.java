package fun.sanjibsinha.chapter7.binarytree.postordertraversal;

public class BinaryTreeRecursive {

    static class TreeNodeClass {
        String data;
        BinaryTreeRecursive.TreeNodeClass left, right;

        TreeNodeClass(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }

    }

    // root of the binary tree from where we start our journey
    BinaryTreeRecursive.TreeNodeClass root;

    /**
     * the public method to traverse and display the nodes
     * by calling the recursive function
     */
    public void postOrder() {
        postOrder(root);
    }

    /**
     * traversing the binary tree by calling itself
     */
    private void postOrder(BinaryTreeRecursive.TreeNodeClass node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.printf("%s ", node.data);
    }


}
