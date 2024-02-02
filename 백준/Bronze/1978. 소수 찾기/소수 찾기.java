import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int prime = 0;
		for (int i=0; i<N; i++) {
			int num = scan.nextInt();
			boolean isPrime = true;
			if (num<2) {
				isPrime = false;
			}
			else {
				for(int j=2; j<=Math.sqrt(num); j++) {
					if(num % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime) {
				prime++;
			}
		}
		System.out.println(prime);
		scan.close();
	}
}
