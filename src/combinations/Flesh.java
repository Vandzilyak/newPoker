package combinations;

import entity.Card;

import java.util.ArrayList;

public class Flesh implements Combination{

    Boolean indekator = false;

    public Boolean chek(ArrayList<Card> deck) {

        for (int i = 0; i < deck.size()-1; i++) {
            if ((deck.get(i).getType().equals(deck.get(i+1).getType()) )){
                indekator = true;
            }else {
                indekator = false;
                break;
            }
        }

        return indekator;
    }
}
