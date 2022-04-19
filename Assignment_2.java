import java.util.Scanner;  // Import the Scanner class
import java.text.SimpleDateFormat; // Imports the Simple Date Formater
import java.util.Date; // Import the Date library
import java.util.Calendar; // Imports the Calendar library
import java.time.LocalDate;
import java.util.Arrays;

class Question_1
{
	public static void main(String args[])
	{
		/*A Java Program to reverse a string
		without using String inbuilt function reverse()*/
		
		String inputString; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input: ");
		inputString = scanner.nextLine();
		
		//char charString = getCharFromString(inputString);
		
		/* for loop runs through the inputStrings length
		   i decremets making the loop start from the end of the inputStrings
		   the loop will run through the string until i is > 0 */ 
		for(int i = inputString.length(); i > 0; i--)
		{
			//output
			System.out.print(inputString.charAt(i-1));
		}
		
		
	}
}

class Question_2
{
	public static void main(String args[])
	{
		/*A Java Program to count the number of 
		letters in a word without using function length()/size()*/
		
		String inputString;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input: ");
		inputString = scanner.nextLine();
	
		
		// for(int i = 0; i < inputString.length(); i++)
		// {
			// if(i <= inputString.length())
			// {
				// count++;
			// }
		// }
		
		for(char input : inputString.toCharArray())
		{
			count++;
		}
		
		System.out.println("number of characters: " + count);
		
	}
}

class Question_3
{
	public static void main(String args[])
	{
		/*Java Program to check if a vowel 
		is present in the string? Also find out its position.*/
		
		String inputString;
		int[] position;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input: ");
		inputString = scanner.nextLine();
	
		//this loop searches the letters in the string
		for(int i = 0; i < inputString.length(); i++)
		{
			//switch statement checks the inputString as a char and compares the vowels
			switch(inputString.charAt(i))
			{
				case 'a': System.out.println("a - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'e': System.out.println("e - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'i': System.out.println("i - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'o': System.out.println("o - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'u': System.out.println("u - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'A': System.out.println("A - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'E': System.out.println("E - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'I': System.out.println("I - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'O': System.out.println("O - detected as a vowel at position: " + (i + 1));
				break;
				
				case 'U': System.out.println("U - detected as a vowel at position: " + (i + 1));
				break;
				
				default: 
				break;
				
			}
			
			//I can also use an if to check both small a and capital A at the same time
			//but it doesnt show the if its the Capital A or small a it just outputs all the a's and their positions
			// if(inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A')
			// {
				// System.out.println("a - detected as a vowel at position: " + (i + 1));
			// }
		}
		
		//System.out.println("number of characters: " + count);
	}
}

class Question_4
{
	public static void main(String args[])
	{
		//If a=1,b=2,c=3 …… then find out what is the number of your name
		
		char[] nameArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 
		'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
		's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		
		
		//int position = 0;
		
		// for(int i = 0; i < name.length(); i++)
		// {
			// /*name.charAt(i) gets the name string as a char and compares each char value
			// with nameArray[0] value in my array*/
			// if(name.charAt(i) == nameArray[0])
			// {
				// System.out.print("1 ");//if true, prints value as 1 
			// }
			// else if(name.charAt(i) == nameArray[1])
			// {
				// System.out.print("2 ");//if true, prints value as 2... 
			// }
			// else if(name.charAt(i) == nameArray[2])
			// {
				// System.out.print("3 ");
			// }
			// else if(name.charAt(i) == nameArray[3])
			// {
				// System.out.print("4 ");
			// }
			
		// }
		
		//I definetly feel like there is a faster way to do this implementation but 
		//I still dont know much about most of the built in methods on java yet and interested to learn them
		for(int i = 0; i < name.length(); i++)
		{
			
			if(name.charAt(i) == 'a' || name.charAt(i) == 'A')
			{
				System.out.print("1 ");
			}
			else if(name.charAt(i) == 'b' || name.charAt(i) == 'B')
			{
				System.out.print("2 ");
			}
			else if(name.charAt(i) == 'c' || name.charAt(i) == 'C')
			{
				System.out.print("3 ");
			}
			else if(name.charAt(i) == 'd' || name.charAt(i) == 'D')
			{
				System.out.print("4 ");
			}
			else if(name.charAt(i) == 'e' || name.charAt(i) == 'E')
			{
				System.out.print("5 ");
			}
			else if(name.charAt(i) == 'f' || name.charAt(i) == 'F')
			{
				System.out.print("6 ");
			}
			else if(name.charAt(i) == 'g' || name.charAt(i) == 'G')
			{
				System.out.print("7 ");
			}
			else if(name.charAt(i) == 'h' || name.charAt(i) == 'H')
			{
				System.out.print("8 ");
			}
			else if(name.charAt(i) == 'i' || name.charAt(i) == 'I')
			{
				System.out.print("9 ");
			}
			else if(name.charAt(i) == 'j' || name.charAt(i) == 'J')
			{
				System.out.print("10 ");
			}
			else if(name.charAt(i) == 'k' || name.charAt(i) == 'K')
			{
				System.out.print("11 ");
			}
			else if(name.charAt(i) == 'l' || name.charAt(i) == 'L')
			{
				System.out.print("12 ");
			}
			else if(name.charAt(i) == 'm' || name.charAt(i) == 'M')
			{
				System.out.print("13 ");
			}
			else if(name.charAt(i) == 'n' || name.charAt(i) == 'N')
			{
				System.out.print("14 ");
			}
			else if(name.charAt(i) == 'o' || name.charAt(i) == 'O')
			{
				System.out.print("15 ");
			}
			else if(name.charAt(i) == 'p' || name.charAt(i) == 'P')
			{
				System.out.print("16 ");
			}
			else if(name.charAt(i) == 'q' || name.charAt(i) == 'Q')
			{
				System.out.print("17 ");
			}
			else if(name.charAt(i) == 'r' || name.charAt(i) == 'R')
			{
				System.out.print("18 ");
			}
			else if(name.charAt(i) == 's' || name.charAt(i) == 'S')
			{
				System.out.print("19 ");
			}
			else if(name.charAt(i) == 't' || name.charAt(i) == 'T')
			{
				System.out.print("20 ");
			}
			else if(name.charAt(i) == 'u' || name.charAt(i) == 'U')
			{
				System.out.print("21 ");
			}
			else if(name.charAt(i) == 'v' || name.charAt(i) == 'V')
			{
				System.out.print("22 ");
			}
			else if(name.charAt(i) == 'w' || name.charAt(i) == 'W')
			{
				System.out.print("23 ");
			}
			else if(name.charAt(i) == 'x' || name.charAt(i) == 'X')
			{
				System.out.print("24 ");
			}
			else if(name.charAt(i) == 'y' || name.charAt(i) == 'Y')
			{
				System.out.print("25 ");
			}
			else if(name.charAt(i) == 'z' || name.charAt(i) == 'Z')
			{
				System.out.print("26 ");
			}
			else 
			{
				System.out.print("Invalid Character!");
			}
			
		}
	}
}

class Question_5
{
	public static void main(String args[])
	{
		//Write a Java Program to find the second-highest number in an array.
		int numbers[] = {3, 5, 61, 44, 31, 7, 9, 61};
		
		int lowest = 0;
		int highest = 0;
		
		// for(int i = 0; i < numbers.length; i++)
		// {
			// if(numbers[0] > numbers[i])
			// {
				// highest = numbers[0];
				// System.out.println( highest + " number at position 1 is highest");
			// }
			// else if(numbers[1] > numbers[i])
			// {
				// highest = numbers[1];
				// System.out.println( highest + " number at position 2 is highest");
			// }
			// else if(numbers[2] > numbers[i])
			// {
				// highest = numbers[2];
				// System.out.println( highest + " number at position 3 is highest");
			// }
		//}
		
		Arrays.sort(numbers);//built in method for sorting arrays
		
		System.out.println(Arrays.toString(numbers));//converts the array to string and displays the array
		
		int i = numbers.length; //gets the size of the array
		int secondLargest = numbers[i-2]; //gets the second last item in the array
		
		//just to be sure i will check if the last number is not equal to the second last number
		//there is probably a way to check for duplicate numbers and then check if those duplicates
		//are not one of the highest numbers then only be able to check where the second highest number is at
		if(secondLargest == numbers[i-1])
		{
			secondLargest = numbers[i-3];
			System.out.println("The second largest is: " + secondLargest); //displays the result
		}
		// else
		// {
			// System.out.println("The second largest is: " + secondLargest); //displays the result
		// }
		
		
	}
	
}

class Question_6
{
	public static void main(String args[])
	{
		 /* Write a program to print below Triangle
			1
			2 3
			4 5 6
			7 8 9 10 */
			int count = 0;
			
			//rows = 4;
			//will print until j is smaller or eaual to 4			
			for(int i = 1; i <= 4; i++)
			{
				for(int j = 1 ; j <= i; j++)//this for loop indicates what i will be printing
				{							// in the row, thats why i used System.out.print();
					count++;
					System.out.print(count + " ");
				}
				System.out.println();//this prints a new line after every iteration of the inside for loop
			}
			
	}
	
}

class Question_7
{
	public static void main(String args[])
	{
		/* Write a program to print below Triangle
		   #####A
		   ####B B
		   ###C C C
		   ##D D D D
		   #E E E E E */
		   
		char[] lettersArray = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < lettersArray.length; i++)
        {
			for (int hashes = 0; hashes < lettersArray.length - i; hashes++)
			{
				//prints the #'s
				System.out.print("#");
			}
			for (int letters = 0; letters <  (i + 1); letters++)
			{
				//prints the letters's
				System.out.print(lettersArray[i] + " ");
			}
			System.out.println();
		}
	}
	
}

class Question_8
{
	public static void main(String args[])
	{
		/* Pass date of birth as input and find out how may years/months/days 
		   it has till today without using date or calendar library
		   Ex. Input: 1/1/2022 output: Years: 0, Months: 3, Days: 90 */
		   
		int year, month, day;
		int yearToday = 2022, monthToday = 04, dayToday = 17;
		int totalYears = 0, totalMonths = 0, totalDays = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your birth date below:");

		System.out.print("Year: ");
		year = scanner.nextInt();
		System.out.print("Month: ");
		month = scanner.nextInt();
		System.out.print("Day: ");
		day = scanner.nextInt();
		System.out.println();
		System.out.println("Input: " + year + "/" + month + "/" + day);
		System.out.println();

		//calculations
		totalYears = yearToday - year;
		totalMonths = monthToday - month;
		totalDays = dayToday - day;

		//output
		System.out.println("Years: " + totalYears + " Months: " + totalMonths + " Days: " + totalDays);

	
	
	}
	
}

class Question_9
{
	public static void main(String args[])
	{
		/* If 1 Jan 2022 was Saturday, then find when your birthday will come
           Ex. Input: 30/05/2022 Output: Monday */
	  
		// Calendar calendar = Calendar.getInstance();
	  
	    int year; 
		int month;      // months starts from 0 to 11
		int day;
	  
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your date below...");

		System.out.print("Year: ");
		year = scanner.nextInt();
		System.out.print("Month: ");
		month = scanner.nextInt();
		System.out.print("Day: ");
		day = scanner.nextInt();
		System.out.println();
		System.out.println("Input: " + year + "/" + month + "/" + day);
		System.out.println();

		//proccess
		LocalDate localDate = LocalDate.of(year, month, day);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();

		//output
        System.out.println("Output: " + dayOfWeek);

	}
	
}

class Question_10
{
	static int firstNum = 0, secondNum = 1;
	
	public static void main(String args[])
	{
		//Write a function to print Fibonacci series using normal function and recursion.
	
		/* A normal function is a function thats called from another function */
		normalFibonacciSeries();
		System.out.println();
		
		
		/* A recursive function is a function that calls itself */
		int i = 10;
		
		System.out.print(firstNum + " " + secondNum);
		
		recursionFibonacciSeries(i - 1);
	}
	
	public static void normalFibonacciSeries()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("The Fibonacci Sequence is a series of numbers where the next number is found by" + "\n" + "adding up the two numbers before it");
		
		System.out.print("Enter the amount in index lenght of how far your series should end: ");
		int amountOfIndex = scanner.nextInt();
		
		int firstNum = 0, secondNum = 1;
		
		//prints the Fibonacci Series
		for(int i = 0; i <= amountOfIndex; i++)
		{
			if(i <= 1)
			{
				System.out.print(i + " ");//prints first and second numbers 0 and 1
			}
			else if(i > 1)//prints the rest of the numbers in the series
			{
				for(i = 2; i < amountOfIndex; i++)
				{
					int thirdNum = firstNum + secondNum;//initialises the first plus second as the thirdNum
					System.out.print(thirdNum + " ");
			
					firstNum = secondNum;//makes the current second number be the first numer
					secondNum = thirdNum;//makes the current third number be the second numer
				}
			}
		}
	}
	
	public static void recursionFibonacciSeries(int i)
	{
		
		
		if(i > 1)
		{
			//declare and inicialise thirdNum
			int thirdNum = firstNum + secondNum;
			
			//set new firstNum and secondNum
			firstNum = secondNum;
			secondNum = thirdNum;
			
			//print series
			System.out.print(" " + thirdNum);
			
			//use recursion calling and decrease the index by 1
			recursionFibonacciSeries(i - 1);
		}
	}
}
