package dealer;

import java.util.ArrayList;

import card.Card;
import cardDraw.CardDraw;
import pointCalculate.PointCalculator;

public class Dealing {
	
	public static int dealing(ArrayList<Card> dealersCard, ArrayList<Card> restDeck) {
		int dealersPoint=0;
		int dealerMustGetCardPoint = 16;
		
		dealersPoint += dealersCard.get(0).getValue();
		dealersPoint += dealersCard.get(1).getValue();
		
		while(dealersPoint<=dealerMustGetCardPoint) {
			CardDraw.cardDraw(dealersCard, restDeck);
			dealersPoint = PointCalculator.pointCalculating(dealersCard);
		}
		return dealersPoint;
	}
}
