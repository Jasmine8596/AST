package assignment1;

import java.util.Scanner;

public class PieIsNotPie {
	
	public static double CircumferenceOfCircle(double diameter) {
		return Math.PI*diameter;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter diameter of circle:");
		double diameter = scan.nextInt();
		scan.close();
		
		System.out.println("Circumference of the circle is:");
		System.out.println(CircumferenceOfCircle(diameter));
	}
}
