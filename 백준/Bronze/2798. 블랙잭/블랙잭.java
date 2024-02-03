import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int numArr[] = new int[N];
		int round = combination(N,3);
		int jackArr[] = new int[round];
		int count = 0;
		int finalNum = 0;
		
		for(int m=0; m<N; m++) {
			numArr[m] = scan.nextInt();
		}
		
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					jackArr[count] = numArr[i] + numArr[j] + numArr[k];
					count++;
				}
			}
		}
		
		for(int n=0; n<round; n++) {
			if(jackArr[n]<=M && (M-jackArr[n])<(M-finalNum))
				finalNum = jackArr[n];
		}
		System.out.println(finalNum);
		scan.close();
	}
	
	public static int combination(int n, int r) {
		if(n==r || r==0)
			return 1;
		else
			return combination(n-1, r-1) + combination(n-1, r);
	}

}