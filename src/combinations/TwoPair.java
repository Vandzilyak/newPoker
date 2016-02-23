package combinations;

import entity.Card;

import java.util.ArrayList;

public class TwoPair implements Combination {
    Set set = new Set();

    Boolean indekator = false;
    private int j;

    public Boolean chek(ArrayList<Card> deck) {

        for (int i = 0; i < deck.size() - 1; i++) {
            if (deck.get(i).getName().equals(deck.get(i + 1).getName())) {
                j++;
            }
        }
        if (j == 2 ){
            indekator=true;
        }else if (j == 3){
            indekator = true;
        }
        return indekator;
    }
}
