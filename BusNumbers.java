import java.util.Arrays;
import java.util.Scanner;

public class BusNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] num = new int[n];
		for (int i = 0; i<num.length; i++) {
			num[i] = reader.nextInt();
		}
		Arrays.sort(num);
		int prev = num[0];
		int start = num[0];
		for (int i = 1; i<num.length; i++) {
			if (num[i]-prev!=1) {
				if (prev!=start&&prev-start>1) {
					System.out.print(start + "-" + prev + " ");
				}
				else {
					System.out.print(prev + " ");
				}
				System.out.print(num[i]+" ");
				start = num[i];
			}
			prev = num[i];
		}
		if (prev-num[num.length-2]==1) {
			if (prev-start!=1) {
				System.out.print(start + "-" + prev);
			}
			else System.out.print(start + " " + prev);
		}
	}
}
