package deckMaker;

import java.util.ArrayList;

import card.Card;

public class PatternSetMaker {

	public static ArrayList<Card> patternSetMaker(String pattern) {
		ArrayList<Card> patternCardSet = new ArrayList<Card>();

		for (int i = 1; i <= 13; i++) {
			Card card = new Card();
			card.setPattern(pattern);
			if (i == 1) {
				card.setName("A");
			} else if (i == 11) {
				card.setName("J");
			} else if (i == 12) {
				card.setName("Q");
			} else if (i == 13) {
				card.setName("K");
			} else {
				card.setName(i + "");
			}
			
			if (i==1) {
				card.setValue(11);
			}
			else if (i < 10) {
				card.setValue(i);
			}
			else if (i >= 10) {
				card.setValue(10);
			}
			
			patternCardSet.add(card);
		}

		return patternCardSet;
	}

}
