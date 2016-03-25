//Trevor Hayes
//CSE002
//lab09-SentenceGenerator

//This program generates a random sentence for the user

//import Random and Scanner utilities
import java.util.Random;
import java.util.Scanner;
public class SentenceGenerator {
    public static String adjectives() { //Adjectives method. Returns a string value
        Random rand = new Random(); //Setup new random number generator
        String a = ""; //Delcare string 'a'
        int i = rand.nextInt(10); //Generate a random integer between 0 and 9
        switch (i) { //Assign an adjective to 'a' based on the resulting integer
            case 0:
                a = "voluptuous";
                break;
            case 1:
                a = "quivering";
                break;
            case 2:
                a = "impatient";
                break;
            case 3:
                a = "stenchy";
                break;
            case 4:
                a = "mouthy";
                break;
            case 5:
                a = "reptillian";
                break;
            case 6:
                a = "boorish";
                break;
            case 7:
                a = "marxist";
                break;
            case 8:
                a = "gleeful";
                break;
            case 9:
                a = "naughty";
                break;
        }
        return a; //Return the random word when called
    }
    public static String subjectNoun() { //Method subjectNoun
        Random rand = new Random(); //New random number generator
        String subn = ""; //Delcare string 'subn'
        int i = rand.nextInt(10); //Random number between 0 and 9
        switch (i) { //Assign subject noun to 'subn' based on random number
            case 0:
                subn = "pig";
                break;
            case 1:
                subn = "dwarf";
                break;
            case 2:
                subn = "sparrow";
                break;
            case 3:
                subn = "plunderer";
                break;
            case 4:
                subn = "gladiator";
                break;
            case 5:
                subn = "reptile";
                break;
            case 6:
                subn = "sea bass";
                break;
            case 7:
                subn = "iceburg";
                break;
            case 8:
                subn = "sausage";
                break;
            case 9:
                subn = "dinosaur";
                break;
        }
        return subn; //Return 'subn' when called
    }
    public static String verbs() { //Method verbs
        Random rand = new Random();
        String v = ""; //Declare string 'v'
        int i = rand.nextInt(10); //Random number between 0 and 9
        switch (i) { //Assign verb to 'v' based on random number
            case 0:
                v = "hunted";
                break;
            case 1:
                v = "enticed";
                break;
            case 2:
                v = "spat on";
                break;
            case 3:
                v = "craved";
                break;
            case 4:
                v = "pulverized";
                break;
            case 5:
                v = "comforted";
                break;
            case 6:
                v = "summoned";
                break;
            case 7:
                v = "forgave";
                break;
            case 8:
                v = "stalked";
                break;
            case 9:
                v = "slandered";
                break;
        }
        return v; //Return 'v' when called
    }
    public static String objectNoun() { //Method objectNoun
        Random rand = new Random();
        String obn = ""; //Declare string 'obn'
        int i = rand.nextInt(10); //Random number between 0 and 9
        switch (i) { //Assign object noun to 'obn' based on random number
            case 0:
                obn = "truffel";
                break;
            case 1:
                obn = "dragon";
                break;
            case 2:
                obn = "field mouse";
                break;
            case 3:
                obn = "scoundrel";
                break;
            case 4:
                obn = "emperor";
                break;
            case 5:
                obn = "bartender";
                break;
            case 6:
                obn = "fire truck";
                break;
            case 7:
                obn = "cruise ship";
                break;
            case 8:
                obn = "mouth";
                break;
            case 9:
                obn = "news anchor";
                break;
        }
        return obn; //Return 'obn' when called
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //New Scanner is set up
        boolean check = true; //Declare boolean 'check' and set equal to true
        System.out.println(); //New line in terminal
        while (check) { //Runs while 'check' is true
            System.out.println("The " + adjectives() + " " + subjectNoun() + " " + verbs() + " the " + adjectives() + " " + objectNoun()); //Organizes the words into a sentence
            System.out.printf("\nDo you want to create another sentence? If so, type Y or y: "); //Asks the user if they want to run the program again
            String input = ""; //Declares string 'input'
            if ((input = sc.next()).equals("Y") || input.equals("y")) { //Runs if 'input' is equal to Y or y
                System.out.println(); //New line in the terminal
            }
            else { //If 'input' is not Y or y, 'check' is changed to false
                check = false;
            }
        }
    }
}