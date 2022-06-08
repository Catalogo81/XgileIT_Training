//Reversing a linked list

//step 1: create a list node and make it the current head


//step 2: create the second node called previous which will point to null


//step 3: create the third node called next which will be assigned to null


/*step 4: create a while loop that will traverse through the list placing a condition till it becomes null
        in the while condition, current will be checked if is not null
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;*/

public class Question_1
{

    public static void main(String[] args)
    {
        //lets create the input keys
        int[] keyValues = {10, 20, 30, 40, 50};


        Node head = null;
        for (int i = keyValues.length - 1; i >= 0; i--)
        {
            head = new Node(keyValues[i], head);
        }

        head = reverse(head);
        displayList(head);
    }

    //2. We create the helper function to print a linked list
    public static void displayList(Node head)
    {
        Node display = head;

        while (display != null)
        {
            System.out.print(display.data + " -> ");
            display = display.next;
        }

        System.out.println("null");
    }

    //3. create the reverse Question_1.Node to reverse a linked list by changing its .next fields and head
    public static Node reverse(Node head)
    {
        //nodes that will be used to traverse the list
        Node previous = null;
        Node current = head;

        //loop used to traverse through the list
        while (current != null)
        {
            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }


        return previous;
    }

    //1. A Linked List Question_1.Node is created
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}

