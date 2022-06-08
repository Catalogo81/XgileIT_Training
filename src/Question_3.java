import java.util.HashSet;

public class Question_3
{
    //Write a Java program to convert a hash set to a List/ArrayList.
    public static void main(String[] args)
    {
        //declare & initialize hashset
        HashSet<String> studentMarks = new HashSet<> ();
        //keys: Strings

        //adding keys to the hashset
        studentMarks.add("Steven");
        studentMarks.add("Lulu");
        studentMarks.add("Ken");
        studentMarks.add("David");
        studentMarks.add("Low");

        //printout the keys
        System.out.println(studentMarks);


        //turn the hashset into an array/arraylist
        Object[] objectArray = studentMarks.toArray();

        //specias=l for loop to display the names fromm the created array
        for (Object object : objectArray)
        {
            String names = (String) object;
            System.out.print(names + " ");
        }

    }

}
