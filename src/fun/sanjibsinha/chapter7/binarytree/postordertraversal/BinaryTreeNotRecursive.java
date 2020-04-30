package fun.sanjibsinha.chapter7.binarytree.postordertraversal;

import java.util.Stack;

public class BinaryTreeNotRecursive {

    static class TreeNodeClass {
        String data;
        BinaryTreeNotRecursive.TreeNodeClass left, right;

        TreeNodeClass(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }

    }

    // root of the binary tree from where we start our journey
    BinaryTreeNotRecursive.TreeNodeClass root;

    public void postOrderWithoutRecursion() {
        Stack<BinaryTreeNotRecursive.TreeNodeClass> nodes = new Stack<>();
        nodes.push(root);

        while (!nodes.isEmpty()) {
            BinaryTreeNotRecursive.TreeNodeClass current = nodes.peek();

            if (current.isLeaf()) {
                BinaryTreeNotRecursive.TreeNodeClass node = nodes.pop();
                System.out.printf("%s ", node.data);
            } else {

                if(current.right != null){
                    nodes.push(current.right);
                    current.right = null;
                }

                if(current.left != null){
                    nodes.push(current.left);
                    current.left = null;
                }
            }

        }
    }
}
