import java.util.Arrays;
import java.util.Scanner;

public class ArmyStrength1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int T = reader.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.println();
			int G = reader.nextInt();
			int M = reader.nextInt();
			int maxG = 0;
			int maxM = 0;
			for (int j = 0; j < G; j++) {
				maxG = Math.max(maxG, reader.nextInt());
			}
			for (int j = 0; j < M; j++) {
				maxM = Math.max(maxM, reader.nextInt());
			}
			if (maxG>maxM || maxM==maxG) System.out.println("Godzilla");
			else System.out.println("MechaGodzilla");
		}

	}
}
