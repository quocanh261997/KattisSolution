import java.util.HashMap;
import java.util.Scanner;

public class Doorman {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int difference = reader.nextInt();
		int dif = 0;
		int total = 0;
		reader.nextLine();
		String text = reader.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('W',0);
		map.put('M', 0);
		for (int i = 0; i<text.length(); i++) {
			dif = Math.abs(map.get('W')-map.get('M'));
			if (dif<difference) {
				map.put(text.charAt(i), map.get(text.charAt(i))+1);
				total++;
			}
			else {
				if (i+1<text.length()) {
					map.put(text.charAt(i), map.get(text.charAt(i))+1);
					map.put(text.charAt(i+1), map.get(text.charAt(i+1))+1);
					if (Math.abs(map.get('W')-map.get('M'))>difference) {
						break;
					}
					else {
						total += 2;
					}
				}
				else {
					map.put(text.charAt(i), map.get(text.charAt(i))+1);
					if (Math.abs(map.get('W')-map.get('M'))>difference) {
						break;
					}
					else {
						total++;
					}
				}
				i++;
			}
		}
		System.out.println(total);
	}
}
