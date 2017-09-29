import java.util.Scanner;

public class JumbledCompass {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int degree = Math.min(Math.abs(a-b), 360-Math.abs(a-b));
		if ((a+degree)%360==b) System.out.println(degree);
		else System.out.println(-1*degree);
	}
}
