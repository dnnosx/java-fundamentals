package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int x = 1;

        for (int i = 1; i < array.length + 1; i++){
            System.out.println();

            for (int j = 0; j < array[1].length; j++){

                array[i - 1][j] = x * 3;
                x++;


                System.out.print(array[i - 1][j]);
                System.out.print(" ");
            }

        }

    }
}
