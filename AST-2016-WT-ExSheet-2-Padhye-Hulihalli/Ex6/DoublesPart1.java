package Ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoublesPart1 {
	public static int[] InputIntegers(int num1,int num2,int num3) {
		int[] input = new int[] {num1,num2,num3};
		return input;
	}
	
	public static List<Double> GenerateRandomFloatingPoint(int MaxNumber){
		List<Double> RandomNumbers =  new ArrayList<Double>();
		
		for(int i=0; i<MaxNumber; i++) {
			RandomNumbers.add(Math.random());
		}
		return RandomNumbers;
	}
	
	public static double SumOfNumbers(List<Double> list) {
		double sum = 0;
		for(int i=0;i<list.size();i++) {
			sum = sum + list.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(InputIntegers(1000,54,99)));
		List<Double> randomnumbers = GenerateRandomFloatingPoint(10);
		System.out.println("Random floating numbers:");
		System.out.println(randomnumbers);
		System.out.println("Sum of floating point numbers is:");
		double sum = SumOfNumbers(randomnumbers);
		System.out.println(sum);
	}
	
}
