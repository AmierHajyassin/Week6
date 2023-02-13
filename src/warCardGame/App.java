package warCardGame;

public class App {

	public static void main(String[] args) {
	
		
		// making a new deck 
        Deck deck = new Deck();
        Player player1 = new Player();
        Player player2 = new Player();
        deck.shuffle(); // shuffling deck 

        for (int i = 0; i < 52; i++) {
            if ( i % 2 ==0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

  
        
        // each card is flipped, cards are compared to each other and the scores are tallied up. 
        
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
            }
        }

  
        System.out.printf("Player1 score is %d" , player1.getScore()); // %d specifies that the single variable is a decimal integer. 
        System.out.println();
        System.out.printf("Player2 score is %d" , player2.getScore());
        System.out.println(); 
        
        
        //checking to see which player has the higher score and printing the winner 
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player1 is the winner!");
           
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player2 is the winner!");
           
        } else {
            System.out.println("It is a DRAW!");
        }


    }
	
}