package main;

import java.util.Scanner;

public class Main {
	Board game = new Board();
	public static void main(String[] args) {
		
		Main set = new Main();
		set.start();
		
		
		
	}
	
	
	
	public void start() {
		System.out.print(game.setup);
		playerX();
	}
	
/*The next two methods implement player input. It includes safeguards against overwriting the
 * opponent's previous moves and checking for victory after each valid move
 */
	
	public void playerX() {
		
		System.out.print("X's turn:");
		Scanner playerX = new Scanner(System.in);
		int Xmove = playerX.nextInt();
		//playerX.close();
		
		switch(Xmove) {
		
		case 1:{
			
			if (game.uL == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.uL = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		case 2:{
			
			if (game.uM == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.uM = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		case 3:{
			
			if (game.uR == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.uR = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		case 4:{
			
			if (game.mL == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.mL = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		case 5:{
			
			if (game.mM == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.mM = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		case 6:{
			
			if (game.mR == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.mR = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		case 7:{
			
			if (game.dL == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.dL = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		case 8:{
			
			if (game.dM == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.dM = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		case 9:{
			
			if (game.dR == "O") {
				System.out.print("Cannot override other player's move!\r\n");
				playerX();
			}
			
			game.dR = "X";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerO();
		}
		
		}
	}
	
	public void playerO() {
		
		System.out.print("O's turn:");
		Scanner playerO = new Scanner(System.in);
		int Omove = playerO.nextInt();
		//playerO.close();
		switch(Omove) {
		
		case 1:{
			
			if (game.uL == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.uL = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
			
		}
		case 2:{
			
			if (game.uM == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.uM = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
		}
		case 3:{
			
			if (game.uR == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.uR = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
		}
		case 4:{
			
			if (game.mL == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.mL = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
		}
		case 5:{
			
			if (game.mM == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.mM = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
		}
		case 6:{
			
			if (game.mR == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.mR = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
		}
		case 7:{
			
			if (game.dL == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.dL = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
		}
		case 8:{
			
			if (game.dM == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.dM = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
		}
		case 9:{
			
			if (game.dR == "X") {
				System.out.print("Cannot override other player's move!\r\n");
				playerO();
			}
			
			game.dR = "O";
			game.newSetup();
			System.out.print(game.setup);
			checkWin();
			playerX();
		}
		
		}
	}
	
/*The below method checks for winning plays for use playerO() and playerX() methods.
 * If a victory is detected, the program terminates
 */
	
	public void checkWin() {
		
		//Checking rows for win
		if (game.uL == "X" && game.uM == "X" && game.uR == "X") {
			System.out.print("X wins!");
			System.exit(0);
		}
		
		if (game.mL == "X" && game.mM == "X" && game.mR == "X") {
			System.out.print("X wins!");
			System.exit(0);
		}
		
		if (game.dL == "X" && game.dM == "X" && game.dR == "X") {
			System.out.print("X wins!");
			System.exit(0);
		}
		
		if (game.uL == "O" && game.uM == "O" && game.uR == "O") {
			System.out.print("O wins!");
			System.exit(0);
		}
		
		if (game.mL == "O" && game.mM == "O" && game.mR == "O") {
			System.out.print("O wins!");
			System.exit(0);
		}
		
		if (game.dL == "O" && game.dM == "O" && game.dR == "O") {
			System.out.print("O wins!");
			System.exit(0);
		}
		
		//Checking columns for win
		if (game.uL == "X" && game.mL == "X" && game.dL == "X") {
			System.out.print("X wins!");
			System.exit(0);
		}
		
		if (game.uM == "X" && game.mM == "X" && game.dM == "X") {
			System.out.print("X wins!");
			System.exit(0);
		}
		
		if (game.uR == "X" && game.mR == "X" && game.dR == "X") {
			System.out.print("X wins!");
			System.exit(0);
		}
		
		if (game.uL == "O" && game.mL == "O" && game.dL == "O") {
			System.out.print("O wins!");
			System.exit(0);
		}
		
		if (game.uM == "O" && game.mM == "O" && game.dM == "O") {
			System.out.print("O wins!");
			System.exit(0);
		}
		
		if (game.uR == "O" && game.mR == "O" && game.dR == "O") {
			System.out.print("O wins!");
			System.exit(0);
		}
		
		//Checking diagonal win
		if (game.uL == "X" && game.mM == "X" && game.dR == "X") {
			System.out.print("X wins!");
			System.exit(0);
		}
		
		if (game.uR == "X" && game.mM == "X" && game.dL == "X") {
			System.out.print("X wins!");
			System.exit(0);
		}
		
		if (game.uL == "O" && game.mM == "O" && game.dR == "O") {
			System.out.print("O wins!");
			System.exit(0);
		}
		
		if (game.uR == "O" && game.mM == "O" && game.dL == "O") {
			System.out.print("O wins!");
			System.exit(0);
		}
		
	}
}
