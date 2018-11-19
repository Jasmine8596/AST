package Ex6;

import java.util.Arrays;

public class DoublesPart1 {
	public static int[] InputIntegers(int num1,int num2,int num3) {
		int[] input = new int[] {num1,num2,num3};
		return input;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(InputIntegers(1000,54,99)));
	}
}
