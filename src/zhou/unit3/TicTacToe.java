package zhou.unit3;

import java.util.Scanner;

/** TicTacToe.java
 * <p> This program allows two users to play tic tac toe.
 * <b> Date created: November 26, 2019
 * @author Sarah Zhou
 */

public class TicTacToe {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {

		// Array for board
		String[][] board = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}} ;


		Scanner sc = new Scanner(System.in);

		// Variables
		boolean win = false;
		boolean p1Turn = true;
		int move;
		boolean check = false;
		boolean done = false;
		String response;
		boolean play = true;

		// Prints out a reference board for the moves that a player can make (1 - 9).
		System.out.println("Welcome to tic tac toe! Here is a refernce for the moves you can make.");
		System.out.format("%5s %5s %5s", "1", "2", "3 \n");
		System.out.format("%5s %5s %5s", "4", "5", "6 \n");
		System.out.format("%5s %5s %5s", "7", "8", "9 \n");

		// Loops the game while the boolean variable play is true.
		while (play) {

			// Loops players taking turns while the boolean variable win is not true.
			while (!win) {

				/*
				 * If it is currently Player 1's turn:
				 * Print out the current board.
				 * Scan in Player 1's move as an integer.
				 * While the boolean variable done is not true, take Player 1's move and store an 'X' in its respective location.
				 * If the location already contains Player 2's move, outputs "invalid move", and skips over to Player 2's turn.
				 * Turns the boolean variable p1Turn to false.
				 *s
				 */

				if (p1Turn) {
					// Prints out the current board.
					System.out.println("Current Board:");
					System.out.format("%5s %5s %5s", board[0][0], board [0][1], board[0][2]);
					System.out.println();
					System.out.format("%5s %5s %5s", board[1][0], board [1][1], board[1][2]);
					System.out.println();
					System.out.format("%5s %5s %5s", board[2][0], board [2][1], board[2][2]);
					System.out.println();
					System.out.println("Player 1, your move!");

					// Player 1 input.
					move = sc.nextInt();

					/**
					 * While the board is not complete (the boolean variable done is false) run the following if-structure.
					 * If Structure:
					 *  For each possible spot, if Player 1's move is not occupied:
					 * 		Assign "X" into its corresponding place in the array board.
					 * 		Break out of the loop.
					 *  If Player 1's move is occupied by Player 2's marker ("O"), or is any other number outside the range of 1 - 9, break out of the loop.
					 */
					while (!done) {
						if (move == 1 && (!board[0][0].equalsIgnoreCase("o"))){
							board[0][0] = "X";
							break;
						}
						else if (move == 2 && !board[0][1].equalsIgnoreCase("o")){
							board[0][1] = "X";
							break;
						}
						else if (move == 3 && !board[0][2].equalsIgnoreCase("o")){
							board[0][2] = "X";
							break;
						}
						else if (move == 4 && !board[1][0].equalsIgnoreCase("o")){
							board[1][0] = "X";
							break;
						}
						else if (move == 5 && !board[1][1].equalsIgnoreCase("o")){
							board[1][1] = "X";
							break;
						}
						else if (move == 6 && !board[1][2].equalsIgnoreCase("o")){
							board[1][2] = "X";
							break;
						}
						else if (move == 7 && !board[2][0].equalsIgnoreCase("o")){
							board[2][0] = "X";
							break;
						}
						else if (move == 8 && !board[2][1].equalsIgnoreCase("o")){
							board[2][1] = "X";
							break;
						}
						else if (move == 9 && !board[2][2].equalsIgnoreCase("o")){
							board[2][2] = "X";
							break;
						}
						else {
							System.out.println("invalid move.");
							break;
						}
					}

					// Turns the variable p1Turn false, signifying that it is no Player 2's turn.
					p1Turn = false;

					System.out.println("Current Board:");
					System.out.format("%5s %5s %5s", board[0][0], board [0][1], board[0][2]);
					System.out.println();
					System.out.format("%5s %5s %5s", board[1][0], board [1][1], board[1][2]);
					System.out.println();
					System.out.format("%5s %5s %5s", board[2][0], board [2][1], board[2][2]);
					System.out.println();

					if (!(board[0][0] == "_") && !(board[0][1] == "_") && !(board[0][2] == "_") && !(board[1][0] == "_") && !(board[1][1] == "_") && !(board[1][2] == "_")
							&& !(board[2][0] == "_") && !(board[2][1] == "_") && !(board[2][2] == "_")) {
						done = true;
					}

					if (done) {
						System.out.println("It's a tie!");
						break;
					}

					/**
					 *  Checks for three in a row matches after Player 1's turn.
					 *  If any of the sequences of three in a row are true:
					 *  	The boolean variable win becomes true.
					 *  	The system outputs that Player 1 has won.
					 *  	Break out of the if-structure.
					 */
					if (board[0][0] == "X" && board[0][0] == board [0][1] && board[0][1] == board[0][2]) {
						win = true;
						System.out.println("Player 1 Wins!!");
						break;
					}

					else if (board[1][0] == "X" && board[1][0] == board [1][1] && board[1][1] == board[1][2]) {
						win = true;
						System.out.println("Player 1 Wins!!");
						break;
					}

					else if (board[2][0] == "X" && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
						win = true;
						System.out.println("Player 1 Wins!!");
						break;
					}

					else if (board[0][0] == "X" && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
						win = true;
						System.out.println("Player 1 Wins!!");
						break;
					}
					else if (board[0][1] == "X" && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
						win = true;
						System.out.println("Player 1 Wins!!");
						break;
					}
					else if (board[0][2] == "X" && board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
						win = true;
						System.out.println("Player 1 Wins!!");
						break;
					}
					else if (board[2][0] == "X" && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
						win = true;
						System.out.println("Player 1 Wins!!");
						break;
					}
					else if (board[0][0] == "X" && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
						win = true;
						System.out.println("Player 1 Wins!!");
						break;
					}
				}

				if (!p1Turn) {
					System.out.println("Player 2, your move!");

					move = sc.nextInt();

					while (!done) {
						if (move == 1 && !board[0][0].equalsIgnoreCase("x")){
							board[0][0] = "O";
							break;
						}
						else if (move == 2 && !board[0][1].equalsIgnoreCase("x")){
							board[0][1] = "O";
							break;
						}
						else if (move == 3 && !board[0][2].equalsIgnoreCase("x")){
							board[0][2] = "O";
							break;
						}
						else if (move == 4 && !board[1][0].equalsIgnoreCase("x")){
							board[1][0] = "O";
							break;
						}
						else if (move == 5 && !board[1][1].equalsIgnoreCase("x")){
							board[1][1] = "O";
							break;
						}
						else if (move == 6 && !board[1][2].equalsIgnoreCase("x")){
							board[1][2] = "O";
							break;
						}
						else if (move == 7 && !board[2][0].equalsIgnoreCase("x")){
							board[2][0] = "O";
							break;
						}
						else if (move == 8 && !board[2][1].equalsIgnoreCase("x")){
							board[2][1] = "O";
							break;
						}
						else if (move == 9 && !board[2][2].equalsIgnoreCase("x")){
							board[2][2] = "O";
							break;
						}
						else {
							System.out.println("invalid move.");
							break;
						}
					}

					p1Turn = true;

					if (!(board[0][0] == "_") && !(board[0][1] == "_") && !(board[0][2] == "_") && !(board[1][0] == "_") && !(board[1][1] == "_") && !(board[1][2] == "_")
							&& !(board[2][0] == "_") && !(board[2][1] == "_") && !(board[2][2] == "_")) {
						done = true;
					}

					if (done) {
						System.out.println("It's a tie!");
						break;
					}


					// Checks for three in a row matches
					if (board[0][0] == "O" && board[0][0] == board [0][1] && board[0][1] == board[0][2]) {
						win = true;
						System.out.println("Player 2 Wins!!");
						break;
					}

					if (board[1][0] == "O" && board[1][0] == board [1][1] && board[1][1] == board[1][2]) {
						win = true;
						System.out.println("Player 2 Wins!!");
						break;
					}

					if (board[2][0] == "O" && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
						win = true;
						System.out.println("Player 2 Wins!!");
						break;
					}

					if (board[0][0] == "O" && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
						win = true;
						System.out.println("Player 2 Wins!!");
						break;
					}
					if (board[0][1] == "O" && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
						win = true;
						System.out.println("Player 2 Wins!!");
						break;
					}
					if (board[0][2] == "O" && board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
						win = true;
						System.out.println("Player 2 Wins!!");
						break;
					}
					if (board[2][0] == "O" && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
						win = true;
						System.out.println("Player 2 Wins!!");
						break;
					}
					if (board[0][0] == "O" && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
						win = true;
						System.out.println("Player 2 Wins!!");
						break;
					}
				}

			}
			System.out.println();
			System.out.println("Would you like to play again? Type 'Yes' or 'No'.");
			response = sc.next();
			if (response.equalsIgnoreCase("yes")) {
				for (int row = 0; row < 3 ; row++) {
					for (int column = 0; column < 3; column ++) {
						board[row][column] = "_";
					}
				}
				play = true;
				win = false;
				p1Turn = true;
				check = false;
				done = false;
			}
			else {
				System.out.println("Goodbye!");
				play = false;
			}
		}
	}
}