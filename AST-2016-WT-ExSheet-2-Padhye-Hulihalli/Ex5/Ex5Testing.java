package Ex5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex5Testing {

	@Test
	void test() {
		IntegersPart3 test = new IntegersPart3();
		
		int[] expected = new int[] {2,3,5,7};
		assertEquals(expected.length,test.FindingPrimeIntegers(10).size());
		
		/*The time required for execution of a program cannot be calculated manually
		 * So, it is not possible to write test cases for the same.
		 * But we can check the time with the help of in-built methods like System.currentTimeMillis()
		 */
	}

}
