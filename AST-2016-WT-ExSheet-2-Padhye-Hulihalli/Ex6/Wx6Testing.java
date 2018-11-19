package Ex6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Wx6Testing {

	@Test
	void test() {
		DoublesPart1 test = new DoublesPart1();
		
		int[] expected = new int[] {1000,54,99};
		int[] output = test.InputIntegers(1000,54,99);
		assertEquals(expected,output);
	}

}
