/* 
    Traverse and print in the format 1 -> 2 -> 3 -> NULL. Handle an empty list.
 */

//Create Nodes
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//Create the Linked List
class LinkedList {
    Node head;

    //Add the Elemet
    public void addNode(int value) {
        if(head == null) {
            head = new Node(value); //Be Careful here, you might get nullpointerExection
            return;
        }

        Node newNode = new Node(value);
        Node currNode = head;

        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print the Data (Actual Problem Statement)
    public void printInfo() {
        Node currNode = head;

        while(currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.print(" NULL ");
    }
}

public class Problem03 {
    public static void main(String[] args) {
        
        LinkedList L1 = new LinkedList();
        
        //Create the Nodes using Loop
        for(int i=1; i<=10; i++) {
            L1.addNode(i);
        }

        //Print the Nodes
        L1.printInfo();

    }
}