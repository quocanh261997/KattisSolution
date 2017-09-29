import java.util.Scanner;

public class Trik {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String text = reader.nextLine();
		int position = 1;
		for (int i = 0; i<text.length(); i++) {
			if (text.charAt(i)=='A') {
				if (position==1) position = 2;
				else if (position==2) position = 1;
			}
			else if (text.charAt(i)=='B') {
				if (position==2) position = 3;
				else if (position==3) position = 2;
			}
			else {
				if (position==1) position = 3;
				else if (position==3) position = 1;
			}
		}
		System.out.println(position);
	}
}
