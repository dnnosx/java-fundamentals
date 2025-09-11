package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vowels = "aeiou";
        int vowelsLength = vowels.length();

        System.out.print("Type word: ");
        String word = scanner.nextLine();
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++){
            for (int x = 0; x < vowelsLength; x++){
                if (word.charAt(i) == vowels.charAt(x) ){
                    System.out.println(word.charAt(i));
                    System.out.println(word);
                    scanner.close();

                    return;
                }
            }
        }
    }
}
