package fun.sanjibsinha.chapter7.binarytree.inorder;

import java.util.Stack;

public class InOrderBinaryTreeNotRecursive {

    static class TreeNodeClass {
        String data;
        InOrderBinaryTreeNotRecursive.TreeNodeClass left, right;

        TreeNodeClass(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }

    }

    // root of the binary tree from where we start our journey
    InOrderBinaryTreeNotRecursive.TreeNodeClass root;

    public void inOrderWithoutRecursion() {
        Stack<InOrderBinaryTreeNotRecursive.TreeNodeClass> nodes = new Stack<>();
        InOrderBinaryTreeNotRecursive.TreeNodeClass current = root;

        while (!nodes.isEmpty() || current != null) {

            if (current != null) {
                nodes.push(current);
                current = current.left;
            } else {
                InOrderBinaryTreeNotRecursive.TreeNodeClass node = nodes.pop();
                System.out.printf("%s ", node.data);
                current = node.right;
            }

        }
    }


}
