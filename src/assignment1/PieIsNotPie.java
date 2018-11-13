package assignment1;

import java.util.Arrays;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PieIsNotPie {
	
	public static double[] CircumferenceOfCircle(double diameter,int precision) {
		double[] Areas = new double[precision+1];
		
		Areas[0] = 3*diameter;
		
		for(int i=1; i <= precision ; i++) {
			Double pi = BigDecimal.valueOf(Math.PI).setScale(i, RoundingMode.HALF_UP).doubleValue();
			Areas[i] = pi*diameter;
		}

		return Areas;
	}
	
	public static double[] PercentageIncrease(double[] Areas) {
		double[] PercentageIncrease = new double[Areas.length];
		
		PercentageIncrease[0] = 0;
		
		for(int i = 1; i < Areas.length ; i++) {
			double increase = Areas[i] - Areas[i-1];
			PercentageIncrease[i] = increase * 100 / Areas[i-1];
		}
		
		return PercentageIncrease;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter diameter of circle:");
		double diameter = scan.nextInt();
		
		System.out.println("Enter precision of pi:");
		int precision = scan.nextInt();
		scan.close();
		
		double[] circumference = CircumferenceOfCircle(diameter,precision);
		
		System.out.println("Circumference of the circle is:");
		System.out.println(Arrays.toString(circumference));
		
		System.out.println("Percentage Increase:");
		System.out.println(Arrays.toString(PercentageIncrease(circumference)));
	}
}
