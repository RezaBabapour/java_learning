package dataStructure;

public class LinkedList {
    Node head;
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    public void insert(int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (this.head == null) {
            this.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

    }

}
