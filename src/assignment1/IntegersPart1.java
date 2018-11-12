package assignment1;
import java.util.Scanner;


public class IntegersPart1 {
	public static int[] UserInput()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number of integers between 1 to 100:");
		int n = scan.nextInt();
		int[] ListOfNumbers = new int[n];
		
		System.out.println("Enter " + "numbers");
		
		for (int i=0;i<n;i++) {
			ListOfNumbers[i] = scan.nextInt();
		}
		
		SumOfNumbers(ListOfNumbers);
		return ListOfNumbers;
	}
	
	public static int SumOfNumbers(int[] ListOfNumbers) {
		int sum = 0;
		
		for(int i=0;i<ListOfNumbers.length;i++) {
			sum = sum + ListOfNumbers[i];
		}
		return sum;
		
	}
}
