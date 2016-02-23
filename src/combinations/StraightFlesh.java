package combinations;

import entity.Card;

import java.util.ArrayList;

public class StraightFlesh implements Combination {



    public static final String straightValue = "2345678910jqka2345a";
    Boolean indekator = false;
    String string="";
    Flesh flesh = new Flesh();

    public Boolean chek(ArrayList<Card> deck) {
        for (int i = 0; i < deck.size(); i++) {
            string = string + deck.get(i).getName();
        }
        Boolean t = flesh.chek(deck);
        if (straightValue.contains(string) && t){
            indekator = true;
        }
        return indekator;

    }
}
