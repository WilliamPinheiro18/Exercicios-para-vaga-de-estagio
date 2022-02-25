import java.util.Scanner;

public class FibonacciCheck
{
	public static void main(String[] args)
	{
		int numberToCheck = getNumberToCheck();

		boolean sentinel = isAFibonnaciNumber( numberToCheck );

		if( sentinel )
		{
			System.out.println("\nThe number informated is a fibonnaci number.\n");
		}
		else
		{
			System.out.println("\nThe number informated is not a fibonnaci number.\n");
		}
	}

	private static int getNumberToCheck()
	{
		Scanner scanner = new Scanner( System.in );

		System.out.println("Please, insert a number to check if is a fibonnaci number: ");
		while( !scanner.hasNextInt() )
		{
			System.out.println("Please, insert only a integer number to check if he is a fibonnaci number: ");
			scanner.next();
		}

		
		int aGivenNumber = scanner.nextInt();
		System.out.println("\n");

		return aGivenNumber;
	}

	private static boolean isAFibonnaciNumber( int numberToCheck )
	{

		if( numberToCheck < 0 ) return false;

		int a = 0, b = 1, c = 0;

		System.out.println(0 + " ");
		while( true )
		{
			if( c == numberToCheck )
				return true;
			else
				if( c > numberToCheck )
					return false;

			a = b + c;
			b = c;
			c = a;

			System.out.println(c + " ");

		}
	}
}