package pointCalculate;

import java.util.ArrayList;

import card.Card;

public class PointCalculator {
	
	public static int pointCalculating(ArrayList<Card> cardsInHand, Card nextCard) {
		
		int pointResult=0;
		int aceCounter=0;
		
		for(Card card : cardsInHand) {
			pointResult += card.getValue();
			if(card.getValue()==11) {
				aceCounter++;
			}
		}
		
		if (aceCounter==0) {
			return pointResult;
		}
		
		else {
			while(pointResult>21) {
				while(aceCounter>0) {
					pointResult -= 10;
					aceCounter--;
				}
			}
			return pointResult;
		}

	}
	
	public boolean isBlackJacked(ArrayList<Card> cardsInHand) {
		boolean isBlackJacked = false;
		
		if(cardsInHand.get(0).getName().equals("A")) {
			if(cardsInHand.get(1).getValue()==10) {
				isBlackJacked=true;
			}
		}
		
		else if(cardsInHand.get(1).getName().equals("A")) {
			if(cardsInHand.get(0).getValue()==10) {
				isBlackJacked=true;
			}
		}
		
		return isBlackJacked;		
	}

}
