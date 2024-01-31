import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		if (string.length() > 1000) {
			System.out.println("단어의 길이는 최대 1000이다");
		}
		int i = scan.nextInt();
		if (i>string.length()) {
			System.out.println("i의 최대 크기는 단어의 길이와 같다");
		}
		System.out.println(string.charAt(i-1));
		scan.close();
	}

}
