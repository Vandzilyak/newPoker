package facade;

import combinations.*;
import entity.Card;

import java.util.ArrayList;

public class ChekCombinations {

    Pair pair = new Pair();
    TwoPair twoPair = new TwoPair();
    Set set = new Set();
    Straight straight = new Straight();
    Flesh flesh = new Flesh();
    FullHouse fullHouse = new FullHouse();
    Kare kare = new Kare();
    StraightFlesh straightFlesh = new StraightFlesh();
    RoyalFlush royalFlush = new RoyalFlush();

    public void chekCombinations(ArrayList<Card> deck){

        if (royalFlush.chek(deck)){
            System.out.println("royalFlush");
        }else if (straightFlesh.chek(deck)){
            System.out.println("straightFlesh");
        }else if (kare.chek(deck)){
            System.out.println("kare");
        }else if (fullHouse.chek(deck)){
            System.out.println("fullHouse");
        }else if (flesh.chek(deck)){
            System.out.println("flesh");
        }else if (straight.chek(deck)){
            System.out.println("straight");
        }else if (set.chek(deck)){
            System.out.println("set");
        }else if (twoPair.chek(deck)){
            System.out.println("twoPair");
        }else if (pair.chek(deck)){
            System.out.println("pair");
        }else {
            System.out.println("hoge kard = "+ deck.get(4).getName());
        }
    }


}
