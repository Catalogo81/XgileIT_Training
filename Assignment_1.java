import java.util.Scanner;  // Import the Scanner class

class Question_1
{
	public static void main(String[] args)
	{
		int num1, num2, result;
		char operant;
		
		Scanner scanner = new Scanner(System.in); //scanner object to read the users input
		
		while(true)
		{
			System.out.print("Enter first number: "); //user enters first number
			num1 = scanner.nextInt();  // read user input
		
			System.out.print("Enter second number: ");//user enters first number
			num2 = scanner.nextInt();
		
			System.out.print("Enter the Operation You Want to Perform (+, -, *, /, %): ");//user enters operant
			operant = scanner.next().charAt(0);
			
			//if use wants to exit the loop they press x
			if(operant == 'x')
				break;
			
			//checks the operant type the user inserts
			if(operant == '+')
			{
				result = num1 + num2;
				System.out.println("Your result is: " + result);
			}
			else if (operant == '-')
			{
				result = num1 - num2;
				System.out.println("Your result is: " + result);
			}
			else if (operant == '*')
			{
				result = num1 * num2;
				System.out.println("Your result is: " + result);
			}
			else if (operant == '/')
			{
				result = num1 / num2;
				System.out.println("Your result is: " + (int)result);
			}
			else if (operant == '%')
			{
				result = num1 % num2;
				System.out.println("Your result is: " + (int)result);
			}
			else
			{
				System.out.println("Please Enter Correct Operant: ");
				//break;
			}
			
			
		}
		
	}
}


class Question_2
{
	public static void main(String args[])
	{
		int number1, number2;
		double answer = 0;
		char userOperant;
		
		Scanner scn = new Scanner(System.in);
		
		//reads the 2 numbers from the user
		System.out.print("Enter First Number: ");
		number1 = scn.nextInt();
		
		System.out.print("Enter Second Number: ");
		number2 = scn.nextInt();
		
		//displays remainder
		answer = number1 % number2;
		System.out.println("Remainder is: " + answer);
	
		//displays quotient
		answer = number1 / number2;
		System.out.println("Quotient is: " + answer);
	
	}
}

class Question_3
{
	public static void main(String args[])
	{
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		
		//checks if number is even
		if(number % 2 == 0)
		{
			System.out.print("Number is even");
		}
		else //checks if number is odd
		{
			System.out.print("Number is odd");
		}
		
	}
}

class Question_4
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		char letter;
		
		System.out.print("Enter a letter: ");
		letter = scanner.next().charAt(0);
		
		//checks the vowels
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
		   || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
		{
			System.out.print("Letter " + letter + " is a Vowel");
		}
		else//checks the consonants
		{
			System.out.print("Letter " + letter + " is a Consonant");
		}
	}
}

//Question_5
class Question_5
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3;//variables
		
		//read numbers from user
		System.out.print("Enter first number: ");
		num1 = scanner.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = scanner.nextInt();
		
		System.out.print("Enter third number: ");
		num3 = scanner.nextInt();
		
		//checks number 1 is bigger than 2 and or 3
		if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.print(num1 + " is the largest");
			}
			else
			{
				System.out.print(num3 + " is the largest");
			}
		}
		//checks number 2 is bigger than 1 and or 3
		else if(num2 > num3)
		{
			System.out.print(num2 + " is largest");
		}
		else //checks number 3 is bigger than 2 and or 1
		{
			System.out.print(num3 + " is the largest");
		}
	
	}
}
