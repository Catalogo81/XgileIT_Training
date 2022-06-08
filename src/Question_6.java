import java.util.*;

public class Question_6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //reads the number of players the user wants to add
        System.out.print("Enter number of players to add: ");
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());

        //create a array for of the players and inserts the number of players
        Player[] players = new Player[numberOfPlayers];

        for(int i = 0; i < numberOfPlayers; i++)
        {
            try
            {
                System.out.print("First Name & Score: ");
                String fistName = scanner.next();
                int score = scanner.nextInt();
                System.out.print("-------------------------\n");

                //makes a new player object as the loop runs
                players[i] = new Player(fistName, score);
            }
            catch (Exception e)
            {
                System.out.print("Error: " + e.getMessage());
            }
        }

        Checker checker = new Checker();
        Arrays.sort(players, checker);

        //enhanced for loop to display the players names and scores according to the checker validation
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}


