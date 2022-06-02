/*
Student id: 991662988
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Scanner;

/**
 * step1 : generate 7 random cards and store in array - how step 2: take any
 * card input from user suit,number step 3: user card is in the array 'card is
 * found'
 *
 * @author sivagamasrinivasan,May 23rd
 * @modifier Mehakpreet Kaur, June1
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; //Array of object
        Card luckyCard = new Card(); // Creating a luckyCard
        luckyCard.setValue(5);
        luckyCard.setSuits("diamonds");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue((int) (Math.random() * 13 + 1));
            magicHand[i].setSuits(Card.SUITS[(int) (Math.random() * 4)]);
        }
        //step 2:take input 
        System.out.print("Enter a the card suit: {\"diamonds\",\"clubs\",\"spades\",\"hearts\"}");
        String suit = in.next();
        System.out.print("Enter a the card number( between 1 and 13): ");
        int value = in.nextInt();
        //step 3: match with array 
        boolean pal = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (value == magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuits())) {
                pal = true;
                break;
            } else {
                pal = false;
            }
        }
        if (pal) {
            System.out.println("The card is In the Magic Hand");
        } else {
            System.out.println("Sorry The card is not in the magic hand");
        }
        

        pal = false;//boolean for card
        for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuits().equalsIgnoreCase(magicHand[i].getSuits())) {
                pal = true;
                break;
            } else {
                pal = false;
            }

        }
        if (pal) {
            System.out.println("you won");
        } else {
            System.out.println("Sorry! u lost");
        }
        System.out.println("The magicHand : \n");
        for(int i = 0; i<magicHand.length; i++){
            System.out.println("Value:" + magicHand[i].getValue()+" Suits :" + magicHand[i].getSuits() ); // printing magicHands
        }
    }
}
