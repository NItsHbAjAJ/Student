/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassexercise1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nagma
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            magicHand[i] = generateRandomCard();
        }
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card value: ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the card suit (0-3): ");
        int userSuit = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
    private static Card generateRandomCard() {
        Card c = new Card();
        c.setValue((int) (Math.random() * 10) + 1); // Random value between 1 and 10
        c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // Random suit (0-3)
        return c;
    }
    
}
