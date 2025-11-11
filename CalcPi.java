// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		Double sum = 0.0;

		for (int i = 0; i < n; i++){
			Double num = 1.0 / (2.0 * i + 1.0);

			if (i % 2 == 0){
				sum = sum + num;
			}
			else 
			sum = sum - num;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}

}
