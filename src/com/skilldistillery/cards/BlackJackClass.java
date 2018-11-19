package com.skilldistillery.cards;

import java.util.Scanner;

public class BlackJackClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Deck deck = new Deck();
		deck.makeDeck();
		deck.shuffle();
		Deck dealer = new Deck();
		Deck player	= new Deck();
		System.out.println("Welcome to BlackJack");
		System.out.println(deck);
		/*need while loop for most of game
		 * logic for empty deck or deck running low
		 * dealer holds at 17
		 * dealing one blind card for dealer
		 */
		
		
	}

}
