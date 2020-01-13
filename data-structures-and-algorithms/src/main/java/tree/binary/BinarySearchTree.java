package tree.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 二叉查找树。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class BinarySearchTree {

    private Node tree;

    public void insert(int data) {
        if (tree == null) {
            this.tree = new Node(data);
            return;
        }
        Node parent = null;
        Node current = this.tree;
        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (data < parent.data) {
            parent.left = new Node(data);
        } else {
            parent.right = new Node(data);
        }
    }

    public List<Node> find(int data) {
        List<Node> findNodeList = new ArrayList<>();
        Node current = this.tree;
        while (current != null) {
            if (data < current.data) {
                current = current.left;
            } else if (data > current.data) {
                current = current.right;
            } else {
                findNodeList.add(current);
                current = current.right;
            }
        }
        return findNodeList;
    }

    public List<Node> delete(int data) {
        List<Node> deleteNodeList = new ArrayList<>();
        Node node = this.deleteInDeep(data);
        while (node != null) {
            deleteNodeList.add(node);
            node = this.deleteInDeep(data);
        }
        return deleteNodeList;
    }

    private Node deleteInDeep(int data) {
        Node target = null;
        Node targetParent = null;
        Node parent = null;
        Node current = this.tree;
        while (current != null) {
            if (data < current.data) {
                parent = current;
                current = current.left;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
            } else {
                target = current;
                targetParent = parent;
                parent = current;
                current = current.right;
            }
        }

        if (target == null) {
            return null;
        }

        if (target.left != null && target.right != null) {
            Node minP = target.right;
            Node minPP = target;
            while (minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            int temp = target.data;
            target.data = minP.data;
            minP.data = temp;
            targetParent = minPP;
            target = minP;
        }

        Node child = null;
        if (target.left != null) {
            child = target.left;
        } else if (target.right != null) {
            child = target.right;
        }

        if (targetParent == null) {
            // 删除目标是根节点
            this.tree = child;
        } else if (targetParent.left == target) {
            targetParent.left = child;
        } else {
            targetParent.right = child;
        }

        return target;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.tree != null) {
            this.printTree(sb, this.tree);
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    private void printTree(StringBuilder sb, Node node) {
        if (node == null) {
            return;
        }
        printTree(sb, node.left);
        sb.append(node.data).append(",");
        printTree(sb, node.right);
    }

    public class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }
}
