/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
            /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
            
            //REUSABLE ASSETS
            String[] suits = {"clubs", "hearts", "diamonds", "spades"};
            String[] ranks = {"ace", "two", "three", "four", "five", "six",
                    "seven", "eight", "nine", "ten", "jack", "queen", "king"};
            int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,};
            
            //NEW ASSETS
            String[] names = {"pigs", "dogs", "cats", "cows"};
            String[] age = {"one", "two", "three", "four", "five", "six",
                    "seven", "eight", "nine", "ten", "eleven", "thirteen", "fourteen"};
            int[] weight = {12, 33, 14, 9, 30, 17, 21, 19, 16, 4, 7, 11, 3,};
            
            /**** EXAMPLE DECK 1 ****/
            System.out.println("----TESTING DECK 1----");
            // create a deck
            Deck dMoney = new Deck(ranks, suits, pointValues);
        
            // test its size
            System.out.println("Deck size: " + dMoney.size());
            
            // deal one card
            Card x = dMoney.deal();
            System.out.println("Yo homie, I just dealt this card: " + x);
            System.out.println("Now my deck size is: " + dMoney.size());
                    
            // test two string
            System.out.println(dMoney);
            
            /**** EXAMPLE DECK 2 ****/
            System.out.println("----TESTING DECK 2----");
            // create a deck
            Deck dEasy = new Deck(names, age, weight);
            
            // test its size
            System.out.println("Deck size: " + dEasy.size());
            
            // deal one card
            Card y = dEasy.deal();
            System.out.println("I just dealt this card: " + dEasy.deal());
            System.out.println("Hey my deck now only has: " + dEasy.size() + "cards");
            
            //deal until empty
            while(!dEasy.isEmpty()){
                dEasy.deal();
            }
            
            // test two string
            System.out.println(dEasy);
	}
        
        
}
