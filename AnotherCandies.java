import java.util.Scanner;

public class AnotherCandies {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int total = 0;
		for (int i = 0; i<N; i++) {
			int num = reader.nextInt();
			total = 0;
			for (int j = 0; j<num; j++) {
				long a = reader.nextLong();
				total += a%num;
			}
			if (total%num==0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
