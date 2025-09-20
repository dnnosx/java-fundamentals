package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        int index;

        do {
            System.out.print("Which index 1 - 10? ");
            index = scanner.nextInt();
        } while (index < 1 || index > 10);

        System.out.println(array[index - 1]);


    }
}