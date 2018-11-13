package assignment1;

import java.util.*;

public class IntegersPart2 {
	
	public static List<Integer> GetPrimeNumbers(long LargestNumber) {
		List<Integer> primenumbers = new LinkedList<>();
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
				System.out.println(num);
			}
		}
		return primenumbers;
	}
	
	public static long CalculateTime(long SmallestNumber,long LargestNumber) {
		long StartTime = System.currentTimeMillis();
		for(long i = SmallestNumber; i <= LargestNumber; i++) {}
		long StopTime = System.currentTimeMillis();
		
		long duration = (StopTime - StartTime)/1000;
		
		return duration;
	}
	
	public static void main(String[] args) {
		System.out.println("Prime Numbers between 0 and largest integer:");
		System.out.println(GetPrimeNumbers(Integer.MAX_VALUE));
		
		System.out.println("Prime Numbers between 0 and largest long integer:");
		System.out.println(GetPrimeNumbers(Long.MAX_VALUE));
		
		System.out.println("Time required to count from smallest to largest integer");
		System.out.println(CalculateTime(Integer.MIN_VALUE,Integer.MAX_VALUE));
		
		System.out.println("Time required to count from smallest to largest long integer");
		System.out.println(CalculateTime(Long.MIN_VALUE,Long.MAX_VALUE));
	}
}
