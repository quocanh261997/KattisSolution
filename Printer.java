import java.util.Scanner;

public class Printer {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int statues = reader.nextInt();
		int days = 0;
		int printer = 1;
		while (printer<statues) {
			printer *= 2;
			days++;
		}
		System.out.println(days+1);
	}
}
