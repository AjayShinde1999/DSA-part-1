package patterns;


// Node class for a singly linked list
class Node {
    int data;     // Data stored in the node
    Node next;    // Reference to the next node in the list

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;  // Initialize next pointer to null
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        // Creating nodes
        Node node1 = new Node(10);  // Node with data 10
        Node node2 = new Node(20);  // Node with data 20

        // Linking nodes
        node1.next = node2;  // node1 points to node2

        // Accessing data and next pointer of nodes
        System.out.println("Node 1: Data = " + node1.data + ", Next = " + node1.next);
        System.out.println("Node 2: Data = " + node2.data + ", Next = " + node2.next);
    }
}


