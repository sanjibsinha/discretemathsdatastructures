package fun.sanjibsinha.chapter7.binarytree.inorder;

public class InOrderBinaryTreeRecursive {

    static class TreeNodeClass {
        String data;
        InOrderBinaryTreeRecursive.TreeNodeClass left, right;

        TreeNodeClass(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }

    }

    // root of the binary tree from where we start our journey
    InOrderBinaryTreeRecursive.TreeNodeClass root;

    /**
     * the public method to traverse and display the nodes
     * by calling the recursive function
     */
    public void inOrder() {

        inOrder(root);
    }

    /**
     * traversing the binary tree by calling itself
     */
    private void inOrder(InOrderBinaryTreeRecursive.TreeNodeClass node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.printf("%s ", node.data);
        inOrder(node.right);
    }


}
