/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author ???
 * @version ???
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- ???
	2. Print deck (simple)
	- ???
	*
	*/
	public static void main(String[] args) {
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		CardTester.main(null);

		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array
		Card[] deck = new Card[52];
		char[] suits = { Card.HEART, Card.DIAMOND, Card.CLUB, Card.SPADE };
		int cardIndex = 0;

		for (char suit : suits) {
			for (int value = 1; value <= 13; value++) {
				deck[cardIndex] = new Card(value, suit);
				cardIndex++;
			}
		}
		//2. Print deck
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] + " ");
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}