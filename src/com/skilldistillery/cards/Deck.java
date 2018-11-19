package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>(52);

	public Deck() {
		super();
		makeDeck();
		
	}

	public List<Card> makeDeck() {
		Suit[] Suits = Suit.values();
		Rank [] Ranks  = Rank.values();
		for (int i = 0; i < Suits.length; i++) {
			for (int j = 0; j < Ranks.length; j++) {
				Card card = new Card(Suits[i] , Ranks[j]);
				deck.add(card);
				
			}

		}
		return deck;
	}
	@Override
	public String toString() {
		String deckList = "";
		for (Card card : deck) {
			deckList += "\n" + "    " + card.toString();
			
		}
		return deckList;
	}

	public int checkDeckSize() {
		return deck.size();
	}
	
	public Card removeCard() {
		return deck.remove(0);
	}
	public Card getCard() {
		return deck.get(0);
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}
	

}
