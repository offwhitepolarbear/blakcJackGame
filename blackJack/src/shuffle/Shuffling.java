package shuffle;

import java.util.ArrayList;

import card.Card;
import numberPicker.NumberPicker;

public class Shuffling {
	
	public static ArrayList<Card> shuffling(ArrayList<Card> deck){
		
		ArrayList<Integer> shuffleIndex = shufflingIndexing(deck.size());
		
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();
		
		for(int index : shuffleIndex) {
			shuffledDeck.add(deck.get(index));
		}
		
		return shuffledDeck;
	}
	
	public static ArrayList<Integer> shufflingIndexing(int deckSize){
		
		ArrayList<Integer> shuffleIndex = new ArrayList<Integer>();
		
		while(shuffleIndex.size()<deckSize) {
			int randomlyPickedNumber = NumberPicker.randomNumberPicker(deckSize);
			NumberPicker.pickNumberChecker(randomlyPickedNumber, shuffleIndex);
		}
		
		return shuffleIndex;
		
	}
	
}
