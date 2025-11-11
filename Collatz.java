// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int times = Integer.parseInt(args[0]);
	   String vc = args[1];
	   int n = 0;
	   int count1 = 1;
		
	   if (vc.equals("v")){
			for (int i=0; i < times; i++){
				n = i + 1;
				System.out.print(n + " ");
				
				if ((n % 2) == 0){
					n = n / 2;
				}
				else {
					n = (n * 3) + 1;
				}
				int count = 2;
				System.out.print(n + " ");

				while (n != 1){
					if ((n % 2) == 0){
						n = n / 2;
						System.out.print(n + " ");
						count++;				}
					else {
						n = (n * 3) + 1;
						System.out.print(n + " ");
						count++;
					}
					count1++;
				}
				
				System.out.println("(" + count + ")");
			}
		}
		
		if (vc.equals("c")){
			for (int i=0; i < times; i++){
				n = i + 1;
				
				if ((n % 2) == 0){
					n = n / 2;
				}
				else {
					n = (n * 3) + 1;
				}

				int count = 2;
				count1++;

				while (n != 1){
					if ((n % 2) == 0){
						n = n / 2;
						count++;				
					}
					else {
						n = (n * 3) + 1;
						count++;
					}
					count1++;
				}
				
				}
		
		
			}
			System.out.println("Every one of the first " + times + " hailstone sequences reached 1.");
			
}
}
