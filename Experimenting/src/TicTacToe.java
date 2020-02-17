import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		char[][] gameBoard = {{ ' ', '|', ' ', '|', ' '}, 
							  {'-', '+', '-', '+', '-'},
							  {' ', '|', ' ', '|', ' '}, 
							  {'-', '+', '-', '+', '-'}, 
							  {' ', '|', ' ', '|', ' '}};
		
		printGame(gameBoard);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter where you want to place your symbol 1-9");
		int pos = in.nextInt();
		System.out.println(pos);
		switch(pos) {
		case 1: gameBoard[0] [0] = 'x';
		break;
		case 2: gameBoard[0] [2] = 'x';
		}
		in.close();
	}
	
	public static void printGame(char[][] gameBoard) {
		
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
