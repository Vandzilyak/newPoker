package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCardsFromConsol {

    public static Integer[] inputCards() {
        System.out.println("Please enter, your combination of 5 cards.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] e = reader.readLine().split(" ");

            Integer[] ints = new Integer[e.length];
            for (int i = 0; i < e.length; i++) {
                ints[i] = Integer.parseInt(e[i]);
            }
            ints = checkNumberOfCards(ints);

            return ints;
        } catch (IOException var2) {
            var2.printStackTrace();
            System.out.println("There are some exception.");
            return null;
        }
    }

    public static Integer[] checkNumberOfCards(Integer[] cards) {
        if(cards.length >= 5 && cards.length <= 5) {
            return cards;
        } else {
            System.out.println("You entered the incorrect number of cards");
            return inputCards();
        }
    }
}
