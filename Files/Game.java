/**
 * Assignment 3
 *
 * Date: 05-04-2018
 *
 * Full Name: Bhagyadeep Narula
 *
 * Course Section: CST8110_303 Intro To Computer Programming
 *
 * Lab Teacher: Jason Mombourquette
 *
 * Program Purpose: This problem will simulate a dice betting game. .
 *
 **/

import java.util.Scanner;

public class Game { // This class contains the logic of die betting Game
	
	private int potAmount ;
	private int betAmount ;
	private String betType ;
	private Scanner input ;
	
	public Game() {
		input = new Scanner(System.in);
		potAmount = 100;
		betAmount = 0;
		betType = new String("");
	}
	
	public void getBetFromUser() {
		System.out.println("\nYour current pot is "+potAmount);
		System.out.print("Enter your bet amount: ");
		betAmount = input.nextInt();
		
		while(betAmount > potAmount || betAmount < 0) {
			System.out.print("Error - cannot bet less than 0 or more than 100...Enter your bet amount: ");
			betAmount = input.nextInt();
		}
		
		if (betAmount == 0) {
			return;
		}
		
		System.out.print("Enter your bet type: ");
		betType = input.next().toLowerCase();
		
		while((betType.equals("odd")  || betType.equals("even") || betType.equals("low") || betType.equals("high")) != true) {
			System.out.print("Please enter odd, even, high, or low ....Enter your bet type: ");
			betType = input.next().toLowerCase();
		}
	}
	
	public void playGame() {
		Die dieValue[] = new Die[3];
		int i , sum = 0 ;
		
		System.out.println("Welcome to Double or Nothing Dice Game..bet an amount and type\n "
				+ "\t-if you are correct, you win twice your bet,\n" 
				+ "\t-otherwise you lose your bet\n" 
				+ "A bet of 0 ends the game");
		
		while(potAmount != 0 || betAmount != 0) {
			
			
			if (potAmount == 0) {
				System.out.println("\nYour current pot is "+potAmount);
				System.out.println("You end the game with pot of "+potAmount);
				return;
			}
			
			getBetFromUser();
			
			if (betAmount == 0) {
				System.out.println("You end the game with pot of "+potAmount);
				return;
			}
			
			System.out.print("Your dies are: ");
			for(i=0;i<3;i++) {
				dieValue[i] = new Die();
				dieValue[i].rollDie(); dieValue[i].displayDie();
				if(i < 2 ) {
					System.out.print(" and ");
				}
				sum = sum + dieValue[i].getValue();
			}
			
			System.out.println();
			if (betType.equals("odd")) {
				if (sum%2 != 0) {
					System.out.println("You WIN....double your bet");
					potAmount += betAmount;
					continue;
				}
				else {
					System.out.println("You LOSE....your bet");
					potAmount -= betAmount;
					continue;
				}
			}
			
			if (betType.equals("even")) {
				if (sum%2 == 0) {
					System.out.println("You WIN....double your bet");
					potAmount += betAmount;
					continue;
				}
				else {
					System.out.println("You LOSE....your bet");
					potAmount -= betAmount;
					continue;
				}
			}
			
			if (betType.equals("low")) {
				if (sum <= 8) {
					System.out.println("You WIN....double your bet");
					potAmount += betAmount;
					continue;
				}
				else {
					System.out.println("You LOSE....your bet");
					potAmount -= betAmount;
					continue;
				}
			}
			
			if (betType.equals("high")) {
				if (sum > 8) {
					System.out.println("You WIN....double your bet");
					potAmount += betAmount;
					continue;
				}
				else {
					System.out.println("You LOSE....your bet");
					potAmount -= betAmount;
					continue;
				}
			}
		}
	}
}

