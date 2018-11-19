package com.skilldistillery.cards;

public class BlackJackClass {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.makeDeck();
		deck.shuffle();
		
		
		
		System.out.println("Welcome to BlackJack");
		System.out.println(deck);
		
	}

}
