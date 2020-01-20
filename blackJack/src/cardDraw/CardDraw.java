package cardDraw;

import java.util.ArrayList;

import card.Card;

public class CardDraw {
	public static void cardDraw(ArrayList<Card> cardsInHand, ArrayList<Card> cardDeck ) {
		cardsInHand.add(cardDeck.get(0));
		cardDeck.remove(0);
	}
}
