//Trevor Hayes
//CSE002
//lab04-CardGenerator

//This program a random card out of a pack of 52 cards, providing you with the rank and suit of the card.

public class CardGenerator {
    public static void main (String[] args) {
        int randNumb = (int) (Math.random()*52); //generates a random number from 0 to 51
        int randNumbPlus = randNumb + 14; //adds 14 to the randomly generated number
        int cardNumb = randNumbPlus%13; //takes the remainder of randNumbPlus divided by 13 to produce a number from 0 to 12 
        String cardValue = ""; //initializes the variable 'cardValue' to be used in the following switch statement
        switch (cardNumb) { //recieves a value of 0 to 12
            case 0:
                cardValue = "an Ace"; //if cardNumb is 0, the rank of the card is an ace
                break;
            case 1:
                cardValue = "a two"; //if cardNumb is 1, the rank of the card is a two
                break;
            case 2:
                cardValue = "a three"; //if cardNumb is 2, the rank of the card is a three
                break;
            case 3:
                cardValue = "a four"; //if cardNumb is 3, the rank of the card is a four
                break;
            case 4:
                cardValue = "a five"; //if cardNumb is 4, the rank of the card is a five
                break;
            case 5:
                cardValue = "a six"; //if cardNumb is 5, the rank of the card is a six
                break;
            case 6:
                cardValue = "a seven"; //if cardNumb is 6, the rank of the card is a seven
                break;
            case 7:
                cardValue = "an eight"; //if cardNumb is 7, the rank of the card is a eight
                break;
            case 8:
                cardValue = "a nine"; //if cardNumb is 8, the rank of the card is a nine
                break;
            case 9:
                cardValue = "a ten"; //if cardNumb is 9, the rank of the card is a ten
                break;
            case 10:
                cardValue = "a Jack"; //if cardNumb is 10, the rank of the card is a jack
                break;
            case 11:
                cardValue = "a Queen"; //if cardNumb is 11, the rank of the card is a queen
                break;
            case 12:
                cardValue = "a King"; //if cardNumb is 12, the rank of the card is a king
                break;
        }
        int suit = randNumb/13; //divides the randomly generated number by 13 to produce a 0, 1, 2, or 3
        switch (suit) {
            case 0:
                System.out.println("You picked " + cardValue + " of diamonds"); //if suit is 0, the suit is diamonds
                break;
            case 1:
                System.out.println("You picked " + cardValue + " of clubs"); //if suit is 1, the suit is clubs
                break;
            case 2:
                System.out.println("You picked " + cardValue + " of hearts"); //if suit is 2, the suit is hearts
                break;
            case 3:
                System.out.println("You picked " + cardValue + " of spades"); //if suit is 3, the suit is spades
                break;
        } 
    }
}