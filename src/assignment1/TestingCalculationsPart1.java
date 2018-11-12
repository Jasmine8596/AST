package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingCalculationsPart1 {

	@Test
	void test() {
		CalculationsPart1 test = new CalculationsPart1();
		
		int function1 = test.Function2n(3);
		assertEquals(6,function1);
		
		double function2 = test.FunctionRootn(7);
		assertEquals(2.64,function2,0.1);
		
		int function3 = test.Function10Powern(4);
		assertEquals(10000,function3);
		
		int function4 = test.FunctionnCube(5);
		assertEquals(125,function4);
		
		int function5 = test.Function2Powern(9);
		assertEquals(512,function5);
		
		double function6 = test.FunctionePowern(5);
		assertEquals(148.4,function6,0.1);
	}

}
