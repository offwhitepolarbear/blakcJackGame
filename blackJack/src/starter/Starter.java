package starter;

import java.util.ArrayList;
import java.util.Scanner;

import card.Card;
import cardDraw.CardDraw;
import dealer.Dealing;
import deckMaker.DeckMaker;
import deckMaker.PatternSetMaker;
import pointCalculate.PointCalculator;
import shuffle.Shuffling;

public class Starter {

	public static void main(String[] args) {
		int startWithTwoCard =2;
		ArrayList<Card> cardDeck = DeckMaker.deckMaker();
		
		cardDeck = Shuffling.shuffling(cardDeck);
		
		ArrayList<Card> dealersCard = new ArrayList<Card>();
		ArrayList<Card> playerCard = new ArrayList<Card>();
		
		for(int i=0;i<startWithTwoCard;i++) {
		CardDraw.cardDraw(dealersCard, cardDeck);
		CardDraw.cardDraw(playerCard, cardDeck);
		}
		
		System.out.println("���� ī��");
		for(Card card : dealersCard) {
			System.out.println(card);
		}
		System.out.println("��ī��");
		for(Card card : playerCard) {
			System.out.println(card);
		}
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("ī�带 �������� 1 ���߷���0");
			
			int i = scan.nextInt();
			if(i==0) {
				System.out.println("�׸��ޱ� ����");
				break;
			}
			CardDraw.cardDraw(playerCard, cardDeck);
			System.out.println("���� �÷��̾� ī��");
			for(Card card : playerCard) {
				System.out.println(card);
			}
			
			if(PointCalculator.pointCalculating(playerCard)>21) {
				System.out.println("����"+PointCalculator.pointCalculating(playerCard)+"�� ����Ʈ��");
				break;
			}
		}
		
		scan.close();
		
		System.out.print("����������"+Dealing.dealing(dealersCard, cardDeck));
		System.out.println(" �÷��̾� ������ "+PointCalculator.pointCalculating(playerCard));
		System.out.println("���� ���� ī��");
		for(Card card : dealersCard) {
			System.out.println(card);
		}
		
	}

}
