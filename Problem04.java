/* 
    Count nodes (iterative): Return the number of nodes using a loop.
*/

//Create the Node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//Create the LinkedList
class LinkedList2 {
    Node head;

    public void addNode(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = new Node(value);
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public int countNode() {
        int count = 0;
        Node currNode = head;

        while(currNode != null) {
            count++;
            currNode = currNode.next;
        }
        System.out.print("Number Of Nodes are: " + count);
        return 0;
    }
}
public class Problem04 {
    public static void main(String[] args) {

        LinkedList2 L1 = new LinkedList2();

        for(int i=1; i<=10; i++){
            L1.addNode(i);
        }
 
        L1.countNode();
    }
}