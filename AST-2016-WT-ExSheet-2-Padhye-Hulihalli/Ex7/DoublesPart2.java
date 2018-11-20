package Ex7;

public class DoublesPart2 {
	public static double function(int k,int n) {
		double sigma = 0.5/(1-0.5);
		
		for(int i=2; i<k; i++) {
			sigma = sigma + 0.9;
		}
		
		for(int i=k; i<=n;i++) {
			sigma = sigma + i;
		}
		
		sigma = sigma + 1;
		double inv = Math.pow(sigma, -1);

		double answer = 1 - inv;
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println("Output of function for (k,n):(10,20) is");
		System.out.println(function(10,20));
		System.out.println("\n");
		
		System.out.println("Output of function for (k,n):(100,200) is");
		System.out.println(function(100,200));
		System.out.println("\n");
		
		System.out.println("Output of function for (k,n):(1000,1200) is");
		System.out.println(function(1000,1200));
		System.out.println("\n");
		
		System.out.println("Output of function for (k,n):(10000,10200) is");
		System.out.println(function(10000,10200));
		System.out.println("\n");
	}
}
