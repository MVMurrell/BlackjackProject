package com.skilldistillery.cards;

public class Card {

	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	public boolean equals(Card card) {
		if (this == card)
			return true;
		if (card == null)
			return false;
		if (getClass() != card.getClass())
			return false;
		Card other = (Card) card;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}
	
	public int value(Card card) {
		return rank.getValue();
		
	}
}