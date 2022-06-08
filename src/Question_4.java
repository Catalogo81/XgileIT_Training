import java.util.ArrayList;

public class Question_4
{
    /*Write a Java program to retrieve an element
      (at a specified index) from a given array list.*/
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(236);
        numbers.add(2);
        numbers.add(0);

        //getting an element in the array list
        System.out.println("Number \""+ numbers.get(2) + "\" found at index 2");

        

    }
}
