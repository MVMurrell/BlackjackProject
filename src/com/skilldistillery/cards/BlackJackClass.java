package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean proceed = true;
			Deck deck = new Deck();
			deck.makeDeck();
			deck.shuffle();
			List<Card> dealer = new ArrayList<>();
			List<Card> player = new ArrayList<>();
			int wallet = 500;
			int bet = 0;
			System.out.print("Hi, what is  your name?  ");
			String name = input.nextLine();

			System.out.println("\nHi, " + name + ". Let's play some BlackJack. \nYou have " + "$" + wallet);
//		System.out.println(deck);
//		System.out.println(player);
//		System.out.println(dealer);
//			if(getValue(player)!= 21 && getValue(dealer)!=21)
			do {
			player.add(deck.dealCard());
			player.add(deck.dealCard());
			dealer.add(deck.dealCard());
			dealer.add(deck.dealCard());
			System.out.println("\nYour hand is: ");
			System.out.println(player.toString());
			System.out.println("For a total of:");
			System.out.println(getValue(player));
			System.out.println("Dealer has " + dealer.get(0).toString());
			System.out.println("\nHow much would you like to bet?");
			bet = input.nextInt();
			boolean endGame = false;
			
			
			do {
				System.out.println("\nWoud you like to Hit(1) or Stay(2)?");
				int choice = input.nextInt();
//		System.out.println(dealer.toString());
				if (choice == 1) {
					player.add(deck.dealCard());
					if (getValue(player) > 21) {
						System.out.println("You busted with a hand of " + player.toString());
						wallet = wallet - bet;
						System.out.println("You have $"+ wallet + " left.");
						proceed = false;
						endGame = true;
						
					} else if (getValue(player) == 21) {
						System.out.println(" You have BlackJack!!");
						System.out.println(player.toString());
						proceed = false;
					} else {
						System.out.println("Your hand is:");
						System.out.println(player.toString());
						System.out.println("For a total of:");
						System.out.println(getValue(player));
						proceed = true;
					}

				} else {
					proceed = false;
				}
			} while (proceed == true);
			
			if(endGame == false) {
			System.out.println("Dealer has " + dealer.toString());
			if (getValue(dealer) < 17) {
				do {
					dealer.add(deck.dealCard());
					System.out.println("Dealer hit. Dealer has " + dealer.toString());
				} while (getValue(dealer) < 17);
			}
			if (getValue(dealer) > 21) {
				System.out.println("Dealer Busts, You Win");
				wallet = wallet + (bet*2);
				System.out.println("You have $"+ wallet + " left." );
			} else if (getValue(dealer) <= 21) {
				if (getValue(dealer) > getValue(player)) {
					System.out.println("Dealer Wins. Gambling is bad. Quit while you're ahead.");
					wallet = wallet - bet;
					System.out.println("You have $"+ wallet + " left." );
				} else if (getValue(dealer) == getValue(player)) {
					System.out.println("Game is a Push");
					System.out.println("You have $"+ wallet + " left." );
				} else {
					System.out.println("You win");
					wallet = wallet + (bet*2);
					System.out.println("You have $"+ wallet + " left." );
				}
			}
			}
			else if(wallet == 0) {
				System.out.println("\nYou're out of money Game Over");
				System.exit(0);
			}
			
			System.out.print("Would you like to play again?(Y or N):");
			String t = input.next();
			if (t.toUpperCase().equals("Y")) {
				dealer.clear();
				player.clear();
				
				if (deck.checkDeckSize() < 15) {
					for (int i = 0; i < deck.checkDeckSize(); i++) {
						deck.removeCard();
					}
					deck.makeDeck();
					deck.shuffle();
				proceed = true;
				
				}
				
			}
			 else {
				 System.out.println("Sorry to see you go "+name+", Goodbye!");
				proceed = false;
				System.exit(0);
			}
				
			
		} while ( proceed = true);
		input.close();

	}

	public static int getValue(List<Card> hand) {
		int totalValue = 0;
		for (Card card : hand) {
			totalValue += card.getValue();

		}
		return totalValue;
	}
}
