import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Question_10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> names = new HashSet<>();

        int numberOfPairs;
        int uniquePair = 0;

        System.out.print("Enter number of pairs: ");
        numberOfPairs = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 0; i < numberOfPairs; i++)
        {
            if(names.add(scanner.nextLine()))
            {
                uniquePair++;
            }

            output.add(uniquePair);
        }

        for(int i = 0; i < numberOfPairs; i++)
        {
            System.out.println(output.get(i));
        }

    }
}
