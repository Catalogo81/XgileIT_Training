import java.util.ArrayList;
import java.util.Scanner;

public class Question_7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //declaring the variables
        int numberOfLines, numberOfIntegers, numberOfqueries, x, y;
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> intArrayList = new ArrayList<>();

        numberOfLines = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numberOfLines; i++)
        {
            numberOfIntegers = scanner.nextInt();

            for(int j = 0; j < numberOfIntegers; j++)
            {
                int yNumbers = scanner.nextInt();
                intArrayList.add(yNumbers);
            }
            arrayList.add(intArrayList);
            scanner.nextLine();
        }

        numberOfqueries = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfqueries; i++)
        {
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            scanner.nextLine();

            if(x < arrayList.size())
            {
                if(y < arrayList.get(x).size())
                {
                    System.out.println("Output: \n" + arrayList.get(x).get(y));
                }
                else
                {
                    System.out.println("Error!!!");
                }
            }
        }

    }
}
