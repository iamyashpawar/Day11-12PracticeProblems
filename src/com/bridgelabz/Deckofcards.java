package com.bridgelabz;

import java.util.*;

public class Deckofcards {

    List<String> deck;

    public void DeckOfCards() {
        deck = new ArrayList<>();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
    }

    public void shuffle() {
        //Random rd = new Random();
        Collections.shuffle(deck);
    }

    public void print() {
        for (String card : deck) {
            System.out.println(card);
        }
    }

    public static void main(String[] args) {
        Deckofcards deck = new Deckofcards();
        deck.shuffle();
        deck.print();
    }
}

