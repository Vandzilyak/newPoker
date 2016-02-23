package combinations;

import entity.Card;

import java.util.ArrayList;

public class Straight implements Combination {

    public static final String straightValue = "2345678910jqka2345a";
    Boolean indekator = false;
    String string="";

    public Boolean chek(ArrayList<Card> deck) {
        for (int i = 0; i < deck.size(); i++) {
            string = string + deck.get(i).getName();
        }
        if (straightValue.contains(string)){
            indekator = true;
        }
        return indekator;

    }
}


