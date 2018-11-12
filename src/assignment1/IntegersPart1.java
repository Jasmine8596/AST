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

	public static int SumOfNumbers() {
		int sum = 0;

		for(int i=0;i<ListOfNumbers.length;i++) {
			sum = sum + ListOfNumbers[i];
		}
		return sum;
	}

	public static int ProductOfNumbers() {
		int product = 1;

		for (int i=0; i<ListOfNumbers.length; i++) {
			product = product * ListOfNumbers[i];
		}
		return product;
	}
}
