package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingPieIsNotPie {

	@Test
	void test() {
		PieIsNotPie test = new PieIsNotPie();
		
		double[] area = test.CircumferenceOfCircle(3, 3);
		double[] expected = new double[] {9,9.3,9.42,9.423};
		assertEquals(expected.length,area.length);
		for(int i = 0; i < expected.length; i++) {
			assertEquals(expected[i],area[i],0.1);
		}
		
		double[] increase = test.PercentageIncrease(expected);
		double[] percentage = new double[] {0.0, 3.33, 1.29, 0.063};
		assertEquals(percentage.length,increase.length);
		for(int i = 0; i < percentage.length; i++) {
			assertEquals(percentage[i],increase[i],0.1);
		}
	}

}
