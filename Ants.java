import java.util.Scanner;

public class Ants {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		for (int i = 0; i<N; i++) {
			int length = reader.nextInt();
			int num = reader.nextInt();
			int min = -1;
			int minimum = Integer.MAX_VALUE;
			for (int j = 0; j<num; j++) {
				int a = reader.nextInt();
				min = Math.max(min, Math.min(a, length-a));
				minimum = Math.min(minimum, a);
			}
			System.out.println(min + " " + (length-minimum));
		}
	}
}
