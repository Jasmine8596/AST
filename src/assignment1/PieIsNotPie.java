package assignment1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PieIsNotPie {
	
	public static double CircumferenceOfCircle(double diameter,int precision) {
		
		Double pi = BigDecimal.valueOf(Math.PI).setScale(precision, RoundingMode.HALF_UP).doubleValue();

		return pi*diameter;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter diameter of circle:");
		double diameter = scan.nextInt();
		
		System.out.println("Enter precision of pi:");
		int precision = scan.nextInt();
		scan.close();
		
		System.out.println("Circumference of the circle is:");
		System.out.println(CircumferenceOfCircle(diameter,precision));
	}
}
