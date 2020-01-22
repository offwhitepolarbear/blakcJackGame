package deckMaker;

import java.util.ArrayList;

import card.Card;
import card.Name;
import card.Pattern;

public class PatternSetMaker {

	public static ArrayList<Card> patternSetMaker(Pattern pattern) {
		ArrayList<Card> patternCardSet = new ArrayList<Card>();

		for (int i = 1; i <= 13; i++) {
			Card card = new Card();
			card.setPattern(pattern);
			card.setName(Name.values()[i-1]);
			
			if (i >= 10) {
				card.setValue(10);
			}
			if (i < 10) {
				card.setValue(i);
			}
			if (card.getValue()==1) {
				card.setValue(11);
			}
		
			patternCardSet.add(card);

		}

		return patternCardSet;
	}

}
