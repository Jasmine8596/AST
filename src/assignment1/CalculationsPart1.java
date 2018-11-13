package assignment1;

public class CalculationsPart1 {
	
	public static int Function2n(int number) {
		return 2*number;
	}
	
	public static double FunctionRootn(int number) {
		return Math.sqrt(number);
	}
	
	public static double Function10Powern(int number) {
		return Math.pow(10, number);
	}
	
	public static int FunctionnCube(int number) {
		return number*number*number;
	}
	
	public static double Function2Powern(int number) {
		if(number == 0) {
			return 0.0;
		}
		else {
			double power = 1.0/Double.valueOf(number);
			return Math.pow(2, power);
		}
	}
	
	public static double FunctionePowern(int number) {
		return Math.pow(Math.E, number);
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			int out1 = Function2n(i);
			double out2 = FunctionRootn(i);
			double out3 = Function10Powern(i);
			int out4 = FunctionnCube(i);
			double out5 = Function2Powern(i);
			double out6 = FunctionePowern(i);
			System.out.print(out1);
			System.out.print("\t");
			System.out.print(out2);
			System.out.print("\t");
			System.out.print(out3);
			System.out.print("\t");
			System.out.print(out4);
			System.out.print("\t");
			System.out.print(out5);
			System.out.print("\t");
			System.out.print(out6);
			System.out.print("\n");
			
		}
	}
}
