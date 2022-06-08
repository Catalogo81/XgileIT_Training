import java.util.Iterator;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        //String Linked List
        //declaring and initializing a Linked List
        LinkedList<String> names = new LinkedList<String>();

        //adding data to the linked list
        names.add("Kgotso");
        names.add("Thabo");
        names.add("Lebo");
        names.add("Steven");

        //displaying the list
        System.out.println(names);

        /*--------------------------------------------------------*/

        //Integer Linked List
        //declaring and initializing a Linked List
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        //adding data to the linked list
        numbers.add(5);
        numbers.add(56);
        numbers.add(8);
        numbers.add(45);

        //displaying the list
        System.out.println(numbers.get(3));

        /* if we want to search for an item in the linked list and we not sure where the item is we can use... */
        Iterator numbersIterator = numbers.iterator();

        //use a while loop to iterate through the list
        while(numbersIterator.hasNext())
        {
            //cast to int
            if ((int) numbersIterator.next() == 56)
            {
                System.out.println("number 56 was found ");
            }
            else
            {
                System.out.println("no data was found ");
            }
        }

    }
}