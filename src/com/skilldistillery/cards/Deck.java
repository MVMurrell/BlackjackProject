package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		super();
		makeDeck();
	}

	private void makeDeck() {
		Suit[] Suits = Suit.values();
		Rank [] Ranks  = Rank.values();
		for (int i = 0; i < Suits.length; i++) {
			for (int j = 0; j < Ranks.length; j++) {
				Card card = new Card(Suits[i] , Ranks[j]);
				deck.add(card);
				
			}

		}
	}

}
