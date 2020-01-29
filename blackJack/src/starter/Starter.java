package starter;

import java.util.ArrayList;
import java.util.Scanner;

import card.Card;
import card.Name;
import cardDraw.CardDraw;
import dealer.Dealing;
import deckMaker.DeckMaker;
import deckMaker.PatternSetMaker;
import pointCalculate.PointCalculator;
import shuffle.Shuffling;

public class Starter {

	public static void main(String[] args) {
		
		ArrayList<Card> cardDeck = DeckMaker.deckMaker();
		
		cardDeck = Shuffling.shuffling(cardDeck);
		
		ArrayList<Card> dealersCard = CardDraw.startingDraw(cardDeck);
		ArrayList<Card> playerCard = CardDraw.startingDraw(cardDeck);
		
		System.out.println("딜러카드");
		for(Card card : dealersCard) {
			System.out.println(card);
		}
		System.out.println("플레이어카드");
		for(Card card : playerCard) {
			System.out.println(card);
		}
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("카드를 받으려면 1 멈추려면0");
			
			int i = scan.nextInt();
			if(i==0) {
				System.out.println("그만받습니다.");
				break;
			}
			CardDraw.cardDraw(playerCard, cardDeck);
			System.out.println("현재 플레이어 카드");
			for(Card card : playerCard) {
				System.out.println(card);
			}
			
			if(PointCalculator.pointCalculating(playerCard)>21) {
				System.out.println("총합 "+PointCalculator.pointCalculating(playerCard)+" 로 버스트됨");
				break;
			}
		}
		
		scan.close();
		
		System.out.print("딜러점수"+Dealing.dealing(dealersCard, cardDeck));
		System.out.println(" 플레이어점수 "+PointCalculator.pointCalculating(playerCard));
		System.out.println("딜러카드");
		for(Card card : dealersCard) {
			System.out.println(card);
		}

	}
	
}
