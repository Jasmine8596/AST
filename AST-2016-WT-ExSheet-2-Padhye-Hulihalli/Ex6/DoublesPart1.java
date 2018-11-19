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
	
	public static double ProductOfNumbers(List<Double> list) {
		double product = 1;

		for (int i=0; i<list.size(); i++) {
			product = product * list.get(i);
		}
		return product;
	}
	
	public static double AverageOfNumbers(List<Double> list) {
		double sum = SumOfNumbers(list);
		
		double average = sum/list.size();
		return average;
	}
	
	public static double VarianceOfNumbers(List<Double> list) {
		double average = AverageOfNumbers(list);
		double variance = 0;
		
		for(int i=0; i<list.size();i++) {
			variance = variance + Math.pow(list.get(i)-average,2);
		}
		variance = variance/list.size();
		return variance;
	}
	
	public static List<Double> LimitValues(double sum,double product, double average, double variance){
		double smallestnumber = 1;
		double largestnumber = 0;
		
		List<Double> values = new ArrayList<Double>();
		
		if(sum < smallestnumber) {
			smallestnumber = sum;
		}
		else if(sum > largestnumber) {
			largestnumber = sum;
		}
		
		if(product < smallestnumber) {
			smallestnumber = product;
		}
		else if(product > largestnumber) {
			largestnumber = product;
		}
		
		if(average < smallestnumber) {
			smallestnumber = average;
		}
		else if(average > largestnumber) {
			largestnumber = average;
		}
		
		if(variance < smallestnumber) {
			smallestnumber = variance;
		}
		else if(variance > largestnumber) {
			largestnumber = variance;
		}
		
		values.add(smallestnumber);
		values.add(largestnumber);
		
		return values;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(InputIntegers(1000,54,99)));
		List<Double> randomnumbers = GenerateRandomFloatingPoint(10);
		System.out.println("Random floating numbers:");
		System.out.println(randomnumbers);
		
		System.out.println("Sum of floating point numbers is:");
		double sum = SumOfNumbers(randomnumbers);
		System.out.println(sum);
		
		System.out.println("Product of floating point numbers");
		double product = ProductOfNumbers(randomnumbers);
		System.out.println(product);
		
		System.out.println("Average of floating point numbers");
		double average = ProductOfNumbers(randomnumbers);
		System.out.println(average);
		
		System.out.println("Variance of floating point numbers");
		double variance = ProductOfNumbers(randomnumbers);
		System.out.println(variance);
		
		List<Double> values = LimitValues(sum,product,average,variance);
		System.out.println("The smallest value is:");
		System.out.println(values.get(0));
		System.out.println("The largest value is:");
		System.out.println(values.get(1));
	}
	
}
