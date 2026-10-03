/* PROBLEM 01
   Define a Node structure/class holding data and a next reference. Write createNode(value) that returns a new node.
*/

//Creates Node
class Node {
    int data;
    Node next;

    //constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//Main Class
public class Problem01 {
    
    /* Method to create the New Node
    This must be the static beacuse the main class is the static
    It uses the "new" keyword to create the Node therefore you don't have to use the Node class to create the Node example
    01 Node node = new Node(20) --> This can create Node but we can use the function we just created
    02 Node node = newNode(20) --> Call the method directly instead of the new keyword
    */

    public static Node newNode(int value) {
    Node newNode = new Node(value);
    return newNode;
    }

    public static void main(String[] args) {

        Node node = newNode(10);

        System.out.println("The Data in Node is: " + node.data);
        System.out.println("The Next of Node is: " + node.next);
    }
}