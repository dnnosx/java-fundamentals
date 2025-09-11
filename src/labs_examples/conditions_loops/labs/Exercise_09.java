package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("- " + i);
            for (int x = 0; x < 5; x++){
                System.out.println("-- " + x);
                if (x == 3){
                    break;
                }
            }

            if (i == 3){
                break;
            }
        }
    }
}
