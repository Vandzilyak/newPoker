import entity.Card;
import facade.ChekCombinations;
import facade.DeckOfCards;
import facade.InputCardsFromConsol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        DeckOfCards deckOfCards = new DeckOfCards();
        InputCardsFromConsol inputCardsFromConsol = new InputCardsFromConsol();



        deckOfCards.showOllCards();

        ArrayList<Card> fiveCards = new ArrayList<Card>();
        for (Integer i : inputCardsFromConsol.inputCards()) {
            System.out.println("i= "+i);
            for (int j = 0; j < deckOfCards.getDeckOfCard().size(); j++) {
                if(i.equals(deckOfCards.getDeckOfCard().get(j).getId())){
                    fiveCards.add(deckOfCards.getDeckOfCard().get(j));
                    System.out.println("id = "+deckOfCards.getDeckOfCard().get(j).getId()+" Name = "+deckOfCards.getDeckOfCard().get(j).getName()+" Type = "+deckOfCards.getDeckOfCard().get(j).getType());
                    break;
                }
            }
        }



        Collections.sort(fiveCards);
        ChekCombinations chekCombinations = new ChekCombinations();
        chekCombinations.chekCombinations(fiveCards);


    }
}

