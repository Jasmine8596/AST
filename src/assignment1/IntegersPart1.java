package assignment1;

import java.util.Scanner;

public class IntegersPart1 {
	
  public static int LengthOfList;
  public static int[] ListOfNumbers;

	public static int UserInput(int LengthOfList){

		return LengthOfList;
	}

  public static int[] ListOfNumbers(int[] ListOfNumbers){

    return ListOfNumbers;
  }

	public static int SumOfNumbers(int[] ListOfNumbers) {
		int sum = 0;

		for(int i=0;i<ListOfNumbers.length;i++) {
			sum = sum + ListOfNumbers[i];
		}
		return sum;
	}

	public static int ProductOfNumbers(int[] ListOfNumbers) {
		int product = 1;

		for (int i=0; i<ListOfNumbers.length; i++) {
			product = product * ListOfNumbers[i];
		}
		return product;
	}
	
	public static int AverageOfNumbers(int[] ListOfNumbers) {
		int sum = 0;
		for(int i=0;i<ListOfNumbers.length;i++) {
			sum = sum + ListOfNumbers[i];
		}
		int average = sum/ListOfNumbers.length;
		return average;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select a number between 0 and 100:");
		LengthOfList = scan.nextInt();
		
		int[] list = new int[LengthOfList];
		
		for(int i = 0; i < LengthOfList ; i++) {
			System.out.format("Number %d:",i+1);
			list[i] = scan.nextInt();
		}
		scan.close();
		
		UserInput(LengthOfList);
		ListOfNumbers(list);
		
		System.out.println("\n");
		
		System.out.println("Sum of numbers in list:");
		System.out.println(SumOfNumbers(list));
		
		System.out.println("Product of numbers in list:");
		System.out.println(ProductOfNumbers(list));
		
		System.out.println("Average of numbers in list:");
		System.out.println(AverageOfNumbers(list));
	}
}
