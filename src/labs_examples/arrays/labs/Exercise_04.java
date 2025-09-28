package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] row = new int[9][];

        for (int i = 0; i < row.length; i++){
            row[i] = new int[i + 1];
            for (int x = 1; x < row[i].length; x++){
                row[i][x] = x;
            }
        }

        for (int[] array : row){
            System.out.println();
            for (int num : array){
                System.out.print(num);
            }
        }
    }

}
