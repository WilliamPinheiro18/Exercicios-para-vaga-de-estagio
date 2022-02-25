import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args)
	{
		String stringToReverse = getStringToReverse();

		String stringReversed = reverseString( stringToReverse );

		System.out.println("\nOriginal string: " + stringToReverse);
		System.out.println("\nReversed string: " + stringReversed);

	}

	private static String getStringToReverse()
	{
		Scanner scanner = new Scanner( System.in );

		System.out.print("\nInsert a string to be reversed: ");
		String aString = scanner.nextLine();

		return aString;
	}

	private static String reverseString( String stringToReverse )
	{
		StringBuilder stringBuilder = new StringBuilder( stringToReverse );
		StringBuilder stringReversed = new StringBuilder();

		for( int index = stringBuilder.length() - 1; index >= 0; index-- )
			stringReversed.append( stringBuilder.charAt( index ) );

		return stringReversed.toString();
		

	}
}