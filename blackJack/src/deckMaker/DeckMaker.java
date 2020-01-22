package deckMaker;

import java.util.ArrayList;

import card.Card;
import card.Pattern;

public class DeckMaker {

	public static ArrayList<Card> deckMaker() {
		ArrayList<Card> deck = new ArrayList<Card>();

		for(Pattern pattern : Pattern.values()) {
			ArrayList<Card> patternCardSet = PatternSetMaker.patternSetMaker(pattern);
			deck.addAll(patternCardSet);
		}
		
		return deck;
	}

}
