package Fredrik;

import java.util.ArrayList;
import java.util.Random;

public class RandomSort {
	private static ArrayList<Integer> deck;
	private static ArrayList<Integer> deck2;
	private static Random randGen = new Random();

	public static void main(String[] args) {
		int x = 0;
		while(true) {
			x++;
			System.out.println(x);
			newDeck();
			randDeck();
			boolean notSorted = false;
			for(int i = 0; i < deck2.size(); i++) {
				if(deck2.get(i) != i) {
					notSorted = true;
				}
			}
			if (notSorted == false) {
				break;
			}
		}
		System.out.println(deck.toString());
	}
	public static void newDeck() {
		deck = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			deck.add(i);
		}
	}
	public static void randDeck() {
		deck2 = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			int rand;
			if (i == 0)
				rand = 0;
			else 
				rand = randGen.nextInt(52-i);
			
			int val = deck.get(rand);
			deck.remove(rand);
			deck2.add(val);
		}
	}
}
