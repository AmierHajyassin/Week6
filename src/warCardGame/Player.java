package warCardGame;
import java.util.ArrayList;
import java.util.List;

public class Player { 
	

    private List<Card> hand = new ArrayList<>();
    private int score;
    private String name;

    public Player() {
        score = 0;
    }

    public Player(String newName) {
        name = newName;
        score = 0;
    }

    public void describe() { //The describe() method returns description of the data
        System.out.printf("Player %s has the following cards: \n", name);
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {//flip() is useful to drain active elements from a buffer. After a series of channel-read or put operations
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() { // adds the score 
        score++;
    }

    public int getScore() { // gets the score 
        return score;
    }

}
