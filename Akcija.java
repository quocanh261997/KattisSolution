import java.util.Arrays;
import java.util.Scanner;

public class Akcija {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] a = new int[N];
		int total = 0;
		for (int i = 0; i<a.length; i++) {
			a[i] = reader.nextInt();
			total += a[i];
		}
		Arrays.sort(a);
		int k = a.length-3;
		while (k>=0) {
			total -= a[k];
			k -= 3;
		}
		System.out.println(total);
	}
}
