import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Question_9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;

        HashMap<String, Integer> phoneBook = new HashMap<>();

        phoneBook.put("uncle sam", 99912222);
        phoneBook.put("steve", 99912222);
        phoneBook.put("londy", 99912222);
        phoneBook.put("rockcliff", 99912222);

        //use the special for loop to get the go through the map
        for(Map.Entry <String, Integer> myEntries : phoneBook.entrySet())
        {
            System.out.print("Enter a name to search: ");
            name = scanner.nextLine();

            if(Objects.equals(myEntries.getKey(), name))//if a name is found
            {
                System.out.println(name + " = " + myEntries.getValue());
            }
            else//if a name is not found
            {
                System.out.println("Not found");
            }
        }
    }
}
