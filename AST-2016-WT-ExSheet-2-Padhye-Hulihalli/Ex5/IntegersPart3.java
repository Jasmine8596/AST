package Ex5;

import java.util.LinkedList;
import java.util.List;

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
}
