package Ex6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Wx6Testing {

	@Test
	void test() {
		DoublesPart1 test = new DoublesPart1();
		
		int[] expected = new int[] {1000,54,99};
		int[] output = test.InputIntegers(1000,54,99);
		assertEquals(expected.length,output.length);
		
		List<Double> inputlist = new ArrayList<Double>();
		inputlist.add(1.1);
		inputlist.add(10.2);
		inputlist.add(20.3);
		double outputsum = test.SumOfNumbers(inputlist);
		assertEquals(31.6,outputsum,0.1);
		
		double outputproduct = test.ProductOfNumbers(inputlist);
		assertEquals(227.76,outputproduct,0.1);
		
		double outputaverage = test.AverageOfNumbers(inputlist);
		assertEquals(10.5,outputaverage,0.1);
		
		double outputvariance = test.VarianceOfNumbers(inputlist);
		assertEquals(61.49,outputvariance,0.1); 
	}

}
