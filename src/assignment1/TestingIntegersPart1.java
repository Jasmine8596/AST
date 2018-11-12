package assignment1;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingIntegersPart1 {

	@Test
	void test() {
		IntegersPart1 test = new IntegersPart1();
		int output = test.UserInput(3);
		
		assertEquals(3,output);
		
		int[] inputlist = new int[] {3,4,5};
		int[] outputlist = test.ListOfNumbers(inputlist);
		
		assertEquals(inputlist,outputlist);
		
		int outputsum = test.SumOfNumbers(inputlist);
		assertEquals(12,outputsum);
		
		int outputproduct = test.ProductOfNumbers(inputlist);
		assertEquals(60,outputproduct);
		
		int outputaverage = test.AverageOfNumbers(inputlist);
		assertEquals(4,outputaverage);
	}

}
