import java.util.Scanner;

/**
 * Created by vinamrata on 5/25/17.
 */

class Node {
    Node left, right;
    int data = 0;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node root = null;
        int total = in.nextInt();
        in.nextLine();

        while(total > 0) {
            int data = in.nextInt();
            root = insert(root, data);
            total--;
        }

        int height = getHeight(root);
        System.out.println("Height of binary tree : " + height);

    }

    public static int getHeight(Node root) {
        int heightLeft = 0;
        int heightRight = 0;

        if (root == null) {
            return -1;
        }

        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }

        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }

        return (heightRight > heightLeft ? heightRight : heightLeft);

    }
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        else {
            Node cur;
            if (data >= root.data) {
                cur = insert(root.right, data);
                root.right = cur;
            } else {
                cur = insert(root.left, data);
                root.left = cur;
            }
        }
        return root;
    }
}
