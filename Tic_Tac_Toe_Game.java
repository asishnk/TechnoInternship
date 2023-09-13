package asish.internship;

import java.util.Scanner;

public class Tic_Tac_Toe_Game {

	public static void main(String[] args) {
		char[][] board = {
	            {' ', ' ', ' '},
	            {' ', ' ', ' '},
	            {' ', ' ', ' '}
	        };	        
	       char currentPlayer = 'X';
	        boolean isGameFinished = false;
	        Scanner scanner = new Scanner(System.in);
	        
	        while (!isGameFinished) {
	            printBoard(board);
				System.out.println("Player " + currentPlayer + ", enter row (0-2):");
	            int row = scanner.nextInt();
	            System.out.println("Enter column (0-2):");
	            int col = scanner.nextInt();
	            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
	                board[row][col] = currentPlayer;
	                if (checkWin(board, currentPlayer)) {
	                    printBoard(board);
	                    System.out.println("Player " + currentPlayer + " wins!");
	                    isGameFinished = true;
	                } else {
	                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	                }
	            } else {
	                System.out.println("Invalid move. Try again.");
	            }
	            if (!isGameFinished && isBoardFull(board)) {
	                printBoard(board);
	                System.out.println("It's a draw!");
	                isGameFinished = true;
	            }
	        }
	        
	        scanner.close();
	    }

	    public static void printBoard(char[][] board) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j]);
	                if (j < 2) {
	                    System.out.print(" | ");
	                }
	            }
	            System.out.println();
	            if (i < 2) {
	                System.out.println("---------");
	            }
	        }
	    }

	    public static boolean checkWin(char[][] board, char player) {
	        // Check rows, columns, and diagonals for a win
	        for (int i = 0; i < 3; i++) {
	            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
	                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
	                return true;
	            }
	        }
	        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
	               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
	    }

	    public static boolean isBoardFull(char[][] board) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] == ' ') {
	                    return false;
	                }
	            }
	        }
	        return true;

	}

}
