import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Question_2
{
    /*Write a Java program to get the first (lowest) key and
        the last (highest) key currently in a map.*/

    public static void main(String[] args)
    {
        HashMap <String,Integer> studentMarks = new HashMap<> ();
        //keys: Strings
        //values: Integers

        studentMarks.put("Steven", 90);
        studentMarks.put("Lulu", 40);
        studentMarks.put("Ken", 55);
        studentMarks.put("David", 80);
        studentMarks.put("Low", 22);

        //make a variable for getting the min and max marks in the map
        int maxMarkInMap = (Collections.max(studentMarks.values()));
        int minMarkInMap = (Collections.min(studentMarks.values()));

        //use the special for loop to get the go through the map
        for(Map.Entry <String, Integer> myEntries : studentMarks.entrySet())
        {
            if(myEntries.getValue() == maxMarkInMap)//if a max number is found
            {
                System.out.println("HIGHEST MARK " + myEntries.getKey() + ":" + myEntries.getValue());
            }
            else if (myEntries.getValue() == minMarkInMap)//if a min number is found
            {
                System.out.println("LOWEST MARK " + myEntries.getKey() + ":" + myEntries.getValue());
            }
        }
    }
}
