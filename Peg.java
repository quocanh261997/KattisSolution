import java.util.Scanner;

public class Peg {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] text = new String[7];
		for (int i = 0; i<7; i++) {
			text[i] = reader.nextLine();
		}
		int count = 0;
		for (int i = 0; i<text.length; i++) {
			for (int j = 0; j<text[i].length(); j++) {
				if (text[i].charAt(j)=='.') {
					if (i-2>=0 && text[i-1].charAt(j)=='o' && text[i-2].charAt(j)=='o') count++;
					if (i+2<7 && text[i+1].charAt(j)=='o' && text[i+2].charAt(j)=='o') count++;
					if (j-2>=0 && text[i].charAt(j-1)=='o' && text[i].charAt(j-2)=='o') count++;
					if (j+2<7 && text[i].charAt(j+1)=='o' && text[i].charAt(j+2)=='o') count++;
				}
			}
		}
		System.out.println(count);
	}
}
