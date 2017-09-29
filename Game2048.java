import java.util.Scanner;

public class Game2048 {
	static int[][] matrix = new int[4][4];
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		for (int i = 0; i<matrix.length; i++) {
			for (int j = 0; j<matrix[0].length; j++) {
				matrix[i][j] = reader.nextInt();
			}
		}
		int move = reader.nextInt();
		if (move==0) moveLeft();
		else if (move==1) moveUp();
		else if (move==2) moveRight();
		else moveDown();
		
		for (int i = 0; i<4; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print(matrix[i][3]);
			System.out.println();
		}
		
	}
	
	public static void moveLeft() {
		int row = 0;
		while (row<4) {
			int prev = 0;
			for (int i = 1; i<4; i++) {
				if (matrix[row][prev]==0) {
					if (matrix[row][i]!=0) {
						matrix[row][prev] = matrix[row][i];
						matrix[row][i] = 0;
					}
				}
				else {
					if (matrix[row][i]==matrix[row][prev]) {
						matrix[row][prev] *= 2;
						matrix[row][i] = 0;
						prev++;
					}
					else if (matrix[row][i]!=0) {
						if (matrix[row][prev+1]==0) {
							matrix[row][prev+1] = matrix[row][i];
							matrix[row][i] = 0;
						}
						prev++;
					}
				}
			}
			row++;
		}
	}
	
	public static void moveRight() {
		int row = 0;
		while (row<4) {
			int prev = 3;
			for (int i = 2; i>=0; i--) {
				if (matrix[row][prev]==0) {
					if (matrix[row][i]!=0) {
						matrix[row][prev] = matrix[row][i];
						matrix[row][i] = 0;
					}
				}
				else {
					if (matrix[row][i]==matrix[row][prev]) {
						matrix[row][prev] *=2;
						matrix[row][i] = 0;
						prev--;
					}
					else if (matrix[row][i]!=0) {
						if (matrix[row][prev-1]==0) {
							matrix[row][prev-1] = matrix[row][i];
							matrix[row][i] = 0;
						}
						prev--;
					}
				}
			}
			row++;
		}
	}
	
	public static void moveUp() {
		int column = 0;
		while (column<4) {
			int prev = 0;
			for (int i = 1; i<4; i++) {
				if (matrix[prev][column]==0) {
					if (matrix[i][column]!=0) {
						matrix[prev][column] = matrix[i][column];
						matrix[i][column] = 0;
					}
				}
				else {
					if (matrix[i][column]==matrix[prev][column]) {
						matrix[prev][column] *= 2;
						matrix[i][column] = 0;
						prev++;
					}
					else if (matrix[i][column]!=0) {
						if (matrix[prev+1][column]==0) {
							matrix[prev+1][column] = matrix[i][column];
							matrix[i][column] = 0;
						}
						prev++;
					}
				}
			}
			column++;
		}
	}
	
	public static void moveDown() {
		int column = 0;
		while (column<4) {
			int prev = 3;
			for (int i = 2; i>=0; i--) {
				if (matrix[prev][column]==0) {
					if (matrix[i][column]!=0) {
						matrix[prev][column] = matrix[i][column];
						matrix[i][column] = 0;
					}
				}
				else {
					if (matrix[prev][column]==matrix[i][column]) {
						matrix[prev][column] *= 2;
						matrix[i][column] = 0;
						prev--;
					}
					else if (matrix[i][column]!=0) {
						if (matrix[prev-1][column]==0) {
							matrix[prev-1][column] = matrix[i][column];
							matrix[i][column] = 0;
						}
						prev--;
					}
				}
			}
			column++;
		}
	}
}
