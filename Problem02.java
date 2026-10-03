/* 
    PROBLEM 02
    Write buildList(arr) that creates a linked list from an array and returns the head.
*/

//To Create Node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Problem02 {

    //Function to create LL from array
    public static Node bulidList(int[] arr) {
        Node head = new Node(arr[0]);
        Node currNode = head;
        for(int i=1; i<arr.length; i++) {
            Node newNode = new Node(arr[i]);
            currNode.next = newNode;
            currNode = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        Node node = bulidList(arr);
        
        while(node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
            if(node == null) {
                System.out.print("null");
            }
        }
    }
}