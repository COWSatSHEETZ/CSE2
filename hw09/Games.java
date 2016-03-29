//Trevor Hayes
//CSE002
//hw09-Games

//This program allows the user to play a host of simple terminal games such as Guess the Box, Spin the Wheel, and Scrambler

import java.util.Scanner; //Import Scanner class
import java.util.Random; //Import Random class
public class Games {
    public static int inputCheck (String a) { //Method inputCheck recieves string input 'a'
        String b = a.toLowerCase(); //String 'a' is converted to all lowercase
        int gameNumber = 0; //Declares integer 'gameNumber'
        if (b.equals("guess the box") || b.equals("spin the wheel") || b.equals("scrambler")) { //Runs if string input is equal to one of the game names
            if (b.equals("guess the box")) { //Runs if string input equals "guess the box"
                gameNumber = 1; //'gameNumber' set equal to 1
            }
            else if (b.equals("spin the wheel")) { //Runs if string input is equal to "spin the wheel"
                gameNumber = 2; //'gameNumber' is set equal to 2
            }
            else { //Otherwise, this runs
                gameNumber = 3; //'gameNumber' is set equal to 3
            }
        }
        else { //Runs if string input does not equal the game names
            System.out.println("We don't have that game, silly! Bye bye now!"); //Tells user their game isn't listed
            System.exit(0); //Exits program
        }
        return gameNumber; //Returns 'gameNumber' to main method
    }
    public static void guessTheBox () { //Method 'guessTheBox'
        Scanner sc = new Scanner(System.in); //New scanner is set up
        Random rand = new Random(); //New random number generator is set up
        boolean check = true; //Boolean 'check' is set equal to true
        System.out.println("The prize is in box 1, 2, or 3. Guess which one you think it is!"); //Prompts the user to guess which box has the prize
        while (check) { //Runs while 'check' equals true
            if (sc.hasNextInt()) { //Runs if user input is an integer
                int boxChoice = sc.nextInt(); //Integer is stored into 'boxChoice'
                int winner = rand.nextInt(3) + 1; //Random winning box is chosen
                if (boxChoice > 0 && boxChoice < 4) { //Runs if 'boxChoice' is between 1 and 3
                    if (boxChoice == winner) { //Runs if the user's guess is the same as the winning box
                        System.out.printf("Bitchin choice! You guessed the right box!\nYou win one pride point.\n"); //Displays winning message
                        check = false; //'check' is changed to false
                    }
                    else { //Runs if user's choice is not the same as the winning box
                        System.out.printf("Oh god damnit. You picked the wrong box.\nTry again, which box do you want?\n"); //Tells user to try again
                        sc.nextLine(); //Scanner input is cleared
                    }
                }
                else { //Runs if input is not between 1 and 3
                    System.out.println("Hold it mister! Ya gotta choose from boxes 1, 2, or 3! Try again,"); //Tells user to input a number between 1 and 3
                    sc.nextLine(); //Scanner input is cleared
                }
            }
            else { //Runs if input is not an integer
                System.out.println("Hold it mister! Ya gotta choose from boxes 1, 2, or 3! Try again,"); //Tells user to input a number between 1 and 3
                sc.nextLine(); //Scanner input is cleared
            }
        }
    }
    public static void spinTheWheel () { //Method 'spinTheWheel'
        Random rand = new Random(); //New random number generator is set up
        Scanner sc = new Scanner(System.in); //New scanner is set up
        boolean gameCheck = true; //Boolean 'gameCheck' is set equal to true
        int num = 0; //Integer 'num' is set equal to 0
        System.out.printf("We bout to spin this wheel.\nThere are 10 sections, half red, half black. Each section of both colors has a number from 1 to 5.\nTry to guess the color and number you think the wheel will land on.\n"); //Prompts user with game rules
        while (gameCheck) { //Runs while 'gameCheck' is true
            boolean check1 = true, check2 = true; //Booleans 'check1' and 'check2' are set equal to true
            System.out.printf("Start by entering the color:\n"); //Prompts user to enter their color choice
            String inputColor = "", color = ""; //Strings 'inputColor' and 'color' are created
            while (check1) { //Runs while 'check1' is true
                inputColor = sc.nextLine(); //User input is stored into 'inputColor'
                color = inputColor.toLowerCase(); //Input is converted to all lowercase
                if (color.equals("red") || color.equals("black")) { //Runs if input is equal to red or black
                    check1 = false; //'check1' is changed to false
                    System.out.println("Next, enter the number."); //Prompts user for number choice
                    while (check2) { //Runs while 'check2' is true
                        if (sc.hasNextInt()) { //Runs if input is an integer
                            num = sc.nextInt(); //Input is stored into 'num'
                            if (num > 0 && num < 6) { //Runs if 'num' is between 1 and 5
                                check2 = false; //'check2' is set equal to false
                            }
                            else { //Runs if 'num' is not between 1 and 5
                                System.out.println("The number must be between 1 and 5. Please enter it again."); //Asks user to enter the number again
                                sc.nextLine(); //Scanner input is cleared
                            }
                        }
                        else { //Runs if input is not an integer
                            System.out.println("Please enter a number between 1 and 5."); //Asks user to input number again
                            sc.nextLine(); //Scanner input is cleared
                        }
                    }
                }
                else { //Runs if input does not equal red or black
                    System.out.println("Your color options are Red and Black. Please choose one."); //Asks user to choose color again
                }
            }
            String guess = color + " " + num; //Creates one string out of user's color and number guesses
            String randColor = ""; //Declares string to store the randomized color
            int randNum = rand.nextInt(5) + 1; //Random number between 1 and 5
            int randInt = rand.nextInt(2); //Random number between 0 and 1
            switch (randInt) { //Switch cases of 'randInt'
                case 0: //If 'randInt' equals 0
                    randColor = "red"; //'randColor' is set equal to red
                    break;
                case 1: //If 'randInt' equals 1
                    randColor = "black"; //'randColor' is set equal to black
                    break;
            }
            String randSection = randColor + " " + randNum; //Combine randomly generated color and number into one string
            if (lowerCaseRandSection.equals(guess)) { //Runs if the user's guess is equal to the randomly generated combo
                System.out.println("Congratulations! You picked the right section!"); //Prints out user's success
                gameCheck = false; //'gameCheck' is set equal to false
            }
            else { //Runs if guess and random don't match
                System.out.printf("Nuh uh, that ain't right. Give it another go.\n\n"); //Tells the user to try again
                sc.nextLine(); //Scanner input is cleared
            }
        }
    }
    public static void scrambler() { //Method 'scrambler'
        Scanner sc = new Scanner(System.in); //Setup new scanner
        Random rand = new Random(); //Setup new random number generator
        System.out.println("Enter the word you want to be scrambled"); //Asks user for a word
        boolean wordCheck = true; //Creates boolean 'wordCheck' and sets it equal to true
        String word = ""; //Prepares string 'word'
        while (wordCheck) { //Runs while wordCheck is true
            if (sc.hasNextDouble()) { //Runs if user input is a double
                System.out.println("Please input a word, not numbers"); //Tells user to input a word
                sc.nextLine(); //Scanner input is cleared
            }
            else { //Runs if input is not a double
                word = sc.nextLine(); //Input is stored as a string
                wordCheck = false; //'wordCheck' is changed to false
            }
        }
        int wordLength = word.length(); //Finds length of input word
        char array[] = word.toCharArray(); //Turns input word into an array of characters
        for (int i = 0; i < wordLength; i++) { //Runs while dummy variable 'i' is less than the length of the unput word
            int j = rand.nextInt(wordLength); //Dummy variable 'j' is a random number between 0 and the length of the input word
            char replace = array[i]; array[i] = array[j]; array[j] = replace; //Replaces the 'i'th character in the character array with the randomly chosen 'j' character
        }
        String scrambled = new String(array); //Scrambled character array is reassembled into a string
        System.out.println(scrambled); //Scrambled string is printed
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //New scanner created
        System.out.printf("Welcome to Trevor's game center!\n"); //Welcomes user
        System.out.println("Would you like to play Guess the Box, Spin the Wheel, or Scrambler?"); //Asks which game they want to play
        int gameChoice = inputCheck(sc.nextLine()); //Calls method 'inputCheck' and returns value as 'gameChoice'
        switch (gameChoice) { //Switches cases of 'gameChoice'
            case 1: //If 'gameChoice' is equal to 1
                guessTheBox(); //Calls 'guessTheBox' method
                break;
            case 2: //If 'gameChoice' is equal to 2
                spinTheWheel(); //Calls 'spinTheWheel' method
                break;
            case 3: //If 'gameChoice' is equal to 2
                scrambler(); //Calls 'scrambler' method
                break;
        }
    }
}