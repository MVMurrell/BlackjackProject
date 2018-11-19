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

		player.add(deck.dealCard());
		player.add(deck.dealCard());
		dealer.add(deck.dealCard());
		dealer.add(deck.dealCard());
		System.out.println("Your hand is:");
		System.out.println(player.toString());
		System.out.println("For a total of:");
		System.out.println(getValue(player));
		System.out.println("Dealer has " + dealer.get(0).toString());
		System.out.println("Woud you like to Hit(1) or Stand(2)?");
		int choice = input.nextInt();
//		System.out.println(dealer.toString());
		if (choice == 1) {
			player.add(deck.dealCard());
			if (getValue(player)> 21 ) {
				System.out.println("You busted with a hand of " + player.toString());
			}
			else if (getValue(player) == 21) {
				System.out.println(" You have twenty one!!");
				System.out.println(player.toString());
			}
			else {
			System.out.println("Your hand is:");
			System.out.println(player.toString());
			System.out.println("For a total of:");
			System.out.println(getValue(player));
			}
		}

		/*
		 * need while loop for most of game logic for empty deck or deck running low
		 * dealer holds at 17 dealing one blind card for dealer
		 */

	}

	public static int getValue(List<Card> hand) {
		int totalValue = 0;
		for (Card card : hand) {
			totalValue += card.getValue();

		}
		return totalValue;
	}
}
