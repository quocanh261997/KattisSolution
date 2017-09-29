import java.util.Scanner;

public class ABC {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int total = 0;
		for (int i = 0; i<3; i++) {
			int num = reader.nextInt();
			max = Math.max(max, num);
			min = Math.min(min, num);
			total += num;
		}
		String text = reader.next();
		for (int i = 0; i<3; i++) {
			if (text.charAt(i)=='A') System.out.print(min + " ");
			else if (text.charAt(i)=='B') System.out.print(total-min-max+ " ");
			else System.out.print(max + " ");
		}
 	}
}
