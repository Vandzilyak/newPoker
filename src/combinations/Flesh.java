package combinations;

import entity.Card;

import java.util.ArrayList;

public class Flesh implements Combination{

    Boolean indekator = false;

    public Boolean chek(ArrayList<Card> deck) {

        for (int i = 0; i < deck.size()-4; i++) {
            if ((deck.get(i).getType().equals(deck.get(i+1).getType()) &&
                    (deck.get(i+1).getType().equals(deck.get(i+2).getType())) &&
                    (deck.get(i+2).getType().equals(deck.get(i+3).getType())) &&
                    (deck.get(i+3).getType().equals(deck.get(i+4).getType())))){
                indekator = true;
            }
        }

        return indekator;
    }
}
