package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingIntegersPart2 {

	@Test
	void test() {
		IntegersPart2 test = new IntegersPart2();
		
		int[] expected = new int[] {1,2,3,5,7};
		assertEquals(expected.length,test.GetPrimeNumbers(10).size());
	}

}
