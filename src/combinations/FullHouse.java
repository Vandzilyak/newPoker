package combinations;

import entity.Card;

import java.util.ArrayList;

public class FullHouse implements Combination {

    Boolean indekator=false;
    private int j;
    private int v;

    public Boolean chek(ArrayList<Card> deck) {

        for (int i = 0; i <deck.size()-2 ; i++) {
            if ((deck.get(i).getName().equals(deck.get(i + 1).getName()) && (deck.get(i + 1).getName().equals(deck.get(i + 2).getName())))) {
                j++;
            }
        }
        for (int i = 0; i <deck.size()-1 ; i++) {
            if ((deck.get(i).getName().equals(deck.get(i + 1).getName()))) {
                v++;
            }
        }
        if (j == 1 && v == 3){
            indekator = true;
        }

        return indekator;
    }
}
