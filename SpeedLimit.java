import java.util.Scanner;

public class SpeedLimit {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			int n = reader.nextInt();
			if (n==-1) break;
			int prev = 0;
			int total = 0;
			for (int i = 0; i<n; i++) {
				int s = reader.nextInt();
				int t = reader.nextInt();
				total += (t-prev)*s;
				prev = t;
			}
			System.out.println(total + " miles");
		}
	}
}
