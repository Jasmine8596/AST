package assignment1;

import java.util.Scanner;
import java.util.Arrays;

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
		int[] list = new int[] {5,6,7,8,9};
		
		IntegersPart1 InMain = new IntegersPart1();
		
		System.out.println(InMain.UserInput(5));
		System.out.println(Arrays.toString(InMain.ListOfNumbers(list)));
		System.out.println(InMain.SumOfNumbers(list));
		System.out.println(InMain.ProductOfNumbers(list));
		System.out.println(InMain.AverageOfNumbers(list));
	}
}
