package combinations;

import entity.Card;

import java.util.ArrayList;

public class Pair implements Combination{
    Boolean indekator=false;

private int j;
    public Boolean chek(ArrayList<Card> deck) {
        for (int i = 0; i <deck.size()-1 ; i++) {
            if (deck.get(i).getName().equals(deck.get(i + 1).getName())) {
                j++;
            }
        }
            if (j == 1){
                indekator = true;
            }
                return indekator;
    }
}

