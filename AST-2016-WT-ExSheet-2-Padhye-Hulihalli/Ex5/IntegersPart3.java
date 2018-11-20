package Ex5;

import java.util.LinkedList;
import java.util.List;
import java.lang.*;

public class IntegersPart3 {
	public static List<Integer> FindingPrimeIntegers(int LargestNumber){			
		List<Integer> primenumbers = new LinkedList<>();
		boolean flag = false;
		for(int num = 2; num <= LargestNumber; num++) {
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
		int count = 0;
		for(long i = SmallestNumber; i <= 2*LargestNumber; i++) {
			count++;
		}
		long StopTime = System.currentTimeMillis();
		
		long duration = (StopTime - StartTime);
		
		return duration;
	}
	
	public static void main(String[] args) {
		System.out.println("Prime numbers till 10 are:");
		FindingPrimeIntegers(10);
		System.out.println("\n");
		
		System.out.println("Time required (in millis) to count from minimum to maximum integer value is:");
		System.out.print(CalculateTime(Integer.MIN_VALUE,Integer.MAX_VALUE));
	}
}
