package dealer;

import java.util.ArrayList;

import card.Card;
import pointCalculate.PointCalculator;

public class Dealing {
	
	public int dealing(ArrayList<Card> dealersCard, ArrayList<Card> restDeck,int nextCardIndex) {
		int dealersPoint=0;
		int dealerMustGetCardPoint = 16;
		
		dealersPoint += dealersCard.get(0).getValue();
		dealersPoint += dealersCard.get(1).getValue();
		
		while(dealersPoint>dealerMustGetCardPoint) {
			dealersPoint = PointCalculator.pointCalculating(dealersCard, restDeck.get(nextCardIndex));
			nextCardIndex++;
		}
		
		return dealersPoint;
	}
}
