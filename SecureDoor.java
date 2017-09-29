import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoor {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> map = new ArrayList<String>();
		int n = reader.nextInt();
		reader.nextLine();
		for (int i = 0; i<n; i++) {
			String entering = reader.nextLine();
			String people = entering.substring(entering.indexOf(" ")+1);
			String status = entering.substring(0, entering.indexOf(" "));
			if (map.contains(people)) {
				if (status.equals("entry")) {
					System.out.println(people + " entered (ANOMALY)");
				}
				else {
					System.out.println(people + " exited");
					map.remove(people);
				}
			}
			else {
				if (status.equals("entry")) {
					System.out.println(people + " entered");
					map.add(people);
				}
				else System.out.println(people + " exited (ANOMALY)");
			}
		}
	}

}
