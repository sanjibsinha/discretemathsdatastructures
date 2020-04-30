package fun.sanjibsinha.chapter7.binarytree.preordertraversal;

public class BinaryTreeWithRecursion {

    static class TreeNodeClass {
        String data;
        TreeNodeClass left;
        TreeNodeClass right;

        TreeNodeClass(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }

    }

    // root of the binary tree from where we start our journey
    BinaryTreeWithRecursion.TreeNodeClass root;

    /**
     * the public method to traverse and display the nodes
     * by calling the recursive function
     */
    public void traversingPreOrderByCallingItself() {
        traversingPreOrderByCallingItself(root);
    }

    /**
     * traversing the binary tree by calling itself
     */
    private void traversingPreOrderByCallingItself(BinaryTreeWithRecursion.TreeNodeClass node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        traversingPreOrderByCallingItself(node.left);
        traversingPreOrderByCallingItself(node.right);
    }

}
