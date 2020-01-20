package cardDraw;

import java.util.ArrayList;

import card.Card;
import pointCalculate.PointCalculator;

public class CardDraw {
	
	public static void cardDraw(ArrayList<Card> cardsInHand, ArrayList<Card> cardDeck) {
		cardsInHand.add(cardDeck.get(0));
		cardDeck.remove(0);
	}

	public static ArrayList<Card> startingDraw(ArrayList<Card> deck) {

		ArrayList<Card> startingCards = new ArrayList<Card>();

		int startWithTwoCard = 2;

		for (int i = 0; i < startWithTwoCard; i++) {
			CardDraw.cardDraw(startingCards, deck);
		}
		if (PointCalculator.isBlackJacked(startingCards)) {
			System.out.println("ºí·¢ÀèÀÓ");
		}

		return startingCards;
	}
	
}