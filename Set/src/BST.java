import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Calvin
 * @Description:
 */
public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left;
        public Node right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node root, E e) {
        if (root == null) {
            return false;
        }
        if (e.compareTo(root.e) == 0) {
            return true;
        } else if (e.compareTo(root.e) > 0) {
            return contains(root.right, e);
        } else {
            return contains(root.left, e);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.e);
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.left);
        }
    }

    public void preOrderNR() {
        preOrderNR(root);
    }

    private void preOrderNR(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            System.out.println(cur.e);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.e);
        inOrder(root.right);
    }

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node cur = queue.remove();
            System.out.println();

            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.left);
            }
        }
    }


    public E mininum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty");
        }
        return mininum(root).e;
    }

    private Node mininum(Node root) {
        if (root.left == null) {
            return root;
        }
        return mininum(root.left);
    }


    public E maxinum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty");
        }
        return maxinum(root).e;
    }

    private Node maxinum(Node root) {
        if (root.right == null) {
            return root;
        }
        return maxinum(root.right);
    }

    public E removeMin() {
        E ret = mininum();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node root) {
        if (root.left == null) {
            Node rightNode = root.right;
            root.right = null;
            size--;
            return rightNode;
        }
        root.left = removeMin(root.left);
        return root;
    }

    public E removeMax() {
        E ret = maxinum();
        root = removeMax(root);
        return ret;
    }

    private Node removeMax(Node root) {
        if (root.right == null) {
            Node leftNode = root.left;
            root.left = null;
            size--;
            return leftNode;
        }
        root.right = removeMax(root.right);
        return root;
    }


    public void remove(E e) {
        root = remove(root, e);
    }

    private Node remove(Node root, E e) {
        if (root == null) {
            return null;
        }
        if (e.compareTo(root.e) < 0) {
            root.left = remove(root.left, e);
            return root;
        } else if (e.compareTo(root.e) > 0) {
            root.right = remove(root.right, e);
            return root;
        } else {
            if (root.left == null) {
                Node leftNode = root.left;
                root.left = null;
                size--;
                return leftNode;
            }
            if (root.right == null) {
                Node rightNode = root.right;
                root.right = null;
                size--;
                return rightNode;
            }
            Node successor = mininum(root.right);
            successor.right = removeMin(root.right);
            successor.left = root.left;
            root.left = root.right = null;
            return successor;
        }

    }

}
