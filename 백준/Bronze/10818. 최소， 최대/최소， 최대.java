import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int min = 1000000;
		int max = -1000000;
		for (int i=0; i<N; i++) {
			int num = scan.nextInt();
			if (num<=min)
				min = num;
			if (num>=max)
				max = num;
		}
		System.out.println(min + " " + max);
		scan.close();
	}

}
