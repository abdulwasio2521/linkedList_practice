/*
    Sum of all elements: Return the sum of all node values.
*/

//Creates the Nodes
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//Creates the LinkedList
class LinkedList6 {
    Node head;

    public void addElement(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node currNode = head;
        Node newNode = new Node(value);

        while(currNode.next != null) {
            currNode =currNode.next;
        }
        currNode.next = newNode;
    }

    public int sumOfNode() {
        Node currNode = head;

        //Corner Case 1 - If the List is empity
        if( head == null) {
            System.out.println("The List is the Empty");
            return 0;
        }

        int sum = 0;
        while (currNode != null) {
            sum = sum + currNode.data;
            currNode = currNode.next;
        }
        System.out.print("The Sum Of The Nodes is the: " + sum);
        return sum;
     }
}

public class Problem06 {
    public static void main(String[] args) {
     
        LinkedList6 L6 = new LinkedList6();

        for(int i=1; i<=10; i++) {
            L6.addElement(i);
        }

        L6.sumOfNode();
    }
}