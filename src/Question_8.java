import java.util.ArrayList;
import java.util.Scanner;

public class Question_8
{
    public static void main(String[] args)
    {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);    //index 0
        numbers.add(0);     //index 1
        numbers.add(1);     //index 2
        numbers.add(78);    //index 3
        numbers.add(12);    //index 4

        System.out.println("Original list:" + numbers);

        //inserting a number in a specific index
        numbers.add(5, 23);

        System.out.println("Element added list:" + numbers);

        //replacing a number in a specific index
        numbers.set(5, 100);

        System.out.println("Element replaced list:" + numbers);


        //remove a number in a specific index
        numbers.remove(0);

        System.out.println("Element 0 removed list:" + numbers);
    }
}
