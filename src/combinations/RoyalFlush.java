package combinations;

import entity.Card;

import java.util.ArrayList;

public class RoyalFlush implements Combination {



    public static final String straightValue = "10jqka";
    Boolean indekator = false;
    String string="";
    Flesh flesh = new Flesh();


    public Boolean chek(ArrayList<Card> deck) {
        for (int i = 0; i < deck.size(); i++) {
            string = string + deck.get(i).getName();
        }
        Boolean t = flesh.chek(deck);
        if (straightValue.equals(string) && t ){
            indekator = true;
        }
        return indekator;

    }
}
