package facade;

import entity.Card;

import java.util.ArrayList;
import java.util.HashSet;

public class DeckOfCards {

    public  void showOllCards() {
        for (int i = 0; i <getDeckOfCard().size(); i++) {
            System.out.println("id = "+getDeckOfCard().get(i).getId() +" "+ "Name = "+getDeckOfCard().get(i).getName() +" "+ "Type = "+getDeckOfCard().get(i).getType());

        }
    }

    public ArrayList<Card> getDeckOfCard(){
        ArrayList<Card> deck = new ArrayList<Card>();

        deck.add(new Card(1, "2", "black"));
        deck.add(new Card(2, "2", "red"));
        deck.add(new Card(3, "2", "green"));
        deck.add(new Card(4, "2", "blue"));

        deck.add(new Card(5, "3", "black"));
        deck.add(new Card(6, "3", "red"));
        deck.add(new Card(7, "3", "green"));
        deck.add(new Card(8, "3", "blue"));

        deck.add(new Card(9, "4", "black"));
        deck.add(new Card(10, "4", "red"));
        deck.add(new Card(11, "4", "green"));
        deck.add(new Card(12, "4", "blue"));

        deck.add(new Card(13, "5", "black"));
        deck.add(new Card(14, "5", "red"));
        deck.add(new Card(15, "5", "green"));
        deck.add(new Card(16, "5", "blue"));

        deck.add(new Card(17, "6", "black"));
        deck.add(new Card(18, "6", "red"));
        deck.add(new Card(19, "6", "green"));
        deck.add(new Card(20, "6", "blue"));

        deck.add(new Card(21, "7", "black"));
        deck.add(new Card(22, "7", "red"));
        deck.add(new Card(23, "7", "green"));
        deck.add(new Card(24, "7", "blue"));

        deck.add(new Card(25, "8", "black"));
        deck.add(new Card(26, "8", "red"));
        deck.add(new Card(27, "8", "green"));
        deck.add(new Card(28, "8", "blue"));

        deck.add(new Card(29, "9", "black"));
        deck.add(new Card(30, "9", "red"));
        deck.add(new Card(31, "9", "green"));
        deck.add(new Card(32, "9", "blue"));

        deck.add(new Card(33, "10", "black"));
        deck.add(new Card(34, "10", "red"));
        deck.add(new Card(35, "10", "blue"));
        deck.add(new Card(36, "10", "blue"));

        deck.add(new Card(37, "J", "black"));
        deck.add(new Card(38, "J", "red"));
        deck.add(new Card(39, "J", "green"));
        deck.add(new Card(40, "J", "blue"));

        deck.add(new Card(41, "Q", "black"));
        deck.add(new Card(42, "Q", "red"));
        deck.add(new Card(43, "Q", "green"));
        deck.add(new Card(44, "Q", "blue"));

        deck.add(new Card(45, "K", "black"));
        deck.add(new Card(46, "K", "red"));
        deck.add(new Card(47, "K", "green"));
        deck.add(new Card(48, "K", "blue"));

        deck.add(new Card(49, "A", "black"));
        deck.add(new Card(50, "A", "red"));
        deck.add(new Card(51, "A", "green"));
        deck.add(new Card(52, "A", "blue"));
        return deck;
    }









    public HashSet<Card> getDeckOfCard2(){
        HashSet<Card> deck = new HashSet<Card>();
        deck.add(new Card(1, "2", "black"));
        deck.add(new Card(2, "3", "black"));
        deck.add(new Card(3, "4", "black"));
        deck.add(new Card(4, "5", "black"));

        deck.add(new Card(5, "6", "black"));
        deck.add(new Card(6, "7", "black"));
        deck.add(new Card(7, "8", "black"));
        deck.add(new Card(8, "9", "black"));

        deck.add(new Card(9, "10", "black"));
        deck.add(new Card(10, "j", "black"));
        deck.add(new Card(11, "q", "black"));
        deck.add(new Card(12, "k", "black"));
        deck.add(new Card(13, "a", "black"));

        deck.add(new Card(14, "2", "red"));
        deck.add(new Card(15, "3", "red"));
        deck.add(new Card(16, "4", "red"));
        deck.add(new Card(17, "5", "red"));

        deck.add(new Card(18, "6", "red"));
        deck.add(new Card(19, "7", "red"));
        deck.add(new Card(20, "8", "red"));
        deck.add(new Card(21, "9", "red"));

        deck.add(new Card(22, "10", "red"));
        deck.add(new Card(23, "j", "red"));
        deck.add(new Card(24, "q", "red"));
        deck.add(new Card(25, "k", "red"));
        deck.add(new Card(26, "a", "red"));

        deck.add(new Card(27, "2", "green"));
        deck.add(new Card(28, "3", "green"));
        deck.add(new Card(29, "4", "green"));
        deck.add(new Card(30, "5", "green"));

        deck.add(new Card(31, "6", "green"));
        deck.add(new Card(32, "7", "green"));
        deck.add(new Card(33, "8", "green"));
        deck.add(new Card(34, "9", "green"));

        deck.add(new Card(35, "10", "green"));
        deck.add(new Card(36, "j", "green"));
        deck.add(new Card(37, "q", "green"));
        deck.add(new Card(38, "k", "green"));
        deck.add(new Card(39, "a", "green"));

        deck.add(new Card(40, "2", "blue"));
        deck.add(new Card(41, "3", "blue"));
        deck.add(new Card(42, "4", "blue"));
        deck.add(new Card(43, "5", "blue"));

        deck.add(new Card(44, "6", "blue"));
        deck.add(new Card(45, "7", "blue"));
        deck.add(new Card(46, "8", "blue"));
        deck.add(new Card(47, "9", "blue"));

        deck.add(new Card(48, "10", "blue"));
        deck.add(new Card(49, "j", "blue"));
        deck.add(new Card(50, "q", "blue"));
        deck.add(new Card(51, "k", "blue"));
        deck.add(new Card(52, "a", "blue"));

        return deck;
    }
}
