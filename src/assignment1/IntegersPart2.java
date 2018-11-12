package assignment1;

import java.util.*;

public class IntegersPart2 {
	
	public static ArrayList<Integer> GetPrimeNumbers(int LargestNumber) {
		ArrayList<Integer> primenumbers = new ArrayList<Integer>(LargestNumber);
		boolean flag = false;
		for(int num = 1; num <= LargestNumber; num++) {
			for(int i=2; i <= num/2; i++) {
				if(num % i == 0) {
					flag = true;
					break;
				}
				else {
					flag = false;
				}
			}
			if(flag==false) {
				primenumbers.add(num);
			}
		}
		return primenumbers;
	}
	
	public static void main(String[] args) {
		System.out.println(GetPrimeNumbers(Integer.MAX_VALUE));
	}
}
