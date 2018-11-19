package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Deck deck = new Deck();
		deck.makeDeck();
		deck.shuffle();
		List<Card> dealer = new ArrayList<>();
		List<Card> player = new ArrayList<>();
		int money = 500;
		System.out.println("What is  your name?");
		String name = input.nextLine();
		
		System.out.println("Hi, " + name + "Let's play some BlackJack. \nYou have $500 to bet");
//		System.out.println(deck);
//		System.out.println(player);
//		System.out.println(dealer);
		boolean proceed = true;
		
		
		
		
		
		/*need while loop for most of game
		 * logic for empty deck or deck running low
		 * dealer holds at 17
		 * dealing one blind card for dealer
		 */
		
		
	}

}
