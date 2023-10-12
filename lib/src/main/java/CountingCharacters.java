import java.util.Scanner;

public class CountingCharacters {

    public static void main (String[] args) {

        // Accept a user's input string, and count the characters of each type in it.

        // Accept input string
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // Invoke counter method below
        counter(inputString);

    }

    public static void counter(String input) {

        // Initialize the counts
        int letterCounter = 0;
        int numberCounter = 0;
        int spaceCounter = 0;
        int specialCounter = 0;

        // Turn the input string into an array of characters
        char[] characters = input.toCharArray();

        // Loop through the array, incrementing the counts
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(characters[i])) {
                letterCounter++;
            }
            else if (Character.isDigit(characters[i])) {
                numberCounter++;
            }
            else if (Character.isSpaceChar(characters[i])) {
                spaceCounter++;
            }
            else {
                specialCounter++;
            }
        }

        // Print out the individual counts
        System.out.println("The total number of characters in the string is: " + (characters.length));
        System.out.println("The number of letters is: " + letterCounter);
        System.out.println("The number of digits is: " + numberCounter);
        System.out.println("The number of special characters is: " + specialCounter);
        System.out.println("The number of spaces is :" + spaceCounter);

    }

}
