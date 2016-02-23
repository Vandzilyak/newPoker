package combinations;

import entity.Card;

import java.util.ArrayList;

public class Kare implements Combination{
    Boolean indekator=false;

    private int j;


    public Boolean chek(ArrayList<Card> deck) {

        for (int i = 0; i <deck.size()-3 ; i++) {
            if (deck.get(i).getName().equals(deck.get(i + 1).getName()) && (deck.get(i+1).getName().equals(deck.get(i + 2).getName())) && deck.get(i+2).getName().equals(deck.get(i + 3).getName())) {
                j++;
            }
        }
        if (j == 1){
            indekator = true;
        }


        return indekator;
    }
}
