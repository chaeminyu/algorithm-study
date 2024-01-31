import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String arr[][] = new String[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-1-i; j++) {
				arr[i][j] = " ";
			}
			for(int k= num-1-i; k<num; k++) {
				arr[i][k] = "*";
			}
		}
		for(int n=0; n<num; n++) {
			for(int m=0; m<num; m++) {
				System.out.print(arr[n][m]);
			}
			System.out.println();
		}
		scan.close();
	}
}
