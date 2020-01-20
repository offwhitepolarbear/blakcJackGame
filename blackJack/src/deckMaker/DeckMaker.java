package deckMaker;

import java.util.ArrayList;

import card.Card;

public class DeckMaker {

	public static ArrayList<Card> deckMaker() {
		
		ArrayList<Card> spadeSet = PatternSetMaker.patternSetMaker("spade");
		ArrayList<Card> heartSet = PatternSetMaker.patternSetMaker("heart");
		ArrayList<Card> cloverSet = PatternSetMaker.patternSetMaker("clover");
		ArrayList<Card> diamondSet = PatternSetMaker.patternSetMaker("diamond");
		
		ArrayList<Card> deck = new ArrayList<Card>();
		
		deck.addAll(spadeSet);
		deck.addAll(heartSet);
		deck.addAll(cloverSet);
		deck.addAll(diamondSet);

		return deck;
	}

}
