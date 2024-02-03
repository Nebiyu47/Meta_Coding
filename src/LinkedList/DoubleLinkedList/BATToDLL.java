package LinkedList.DoubleLinkedList;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

 class Solution {
    Node prev;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        // Create a dummy node as the head of the doubly linked list
        Node dummy = new Node(0);
        prev = dummy;
        // Convert the BST to DLL
        convert(root);
        // Connect the head and tail of the DLL
        dummy.right.left = prev;
        prev.right = dummy.right;
        return dummy.right;
    }

    private void convert(Node node) {
        if (node == null) {
            return;
        }
        // In-order traversal: left subtree
        convert(node.left);
        // Connect the current node to the previous node in the DLL
        prev.right = node;
        node.left = prev;
        prev = node;
        // In-order traversal: right subtree
        convert(node.right);
    }
}

