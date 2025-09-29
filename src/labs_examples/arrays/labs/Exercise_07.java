package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();

        int i = 0;

        nums.add(2);
        nums.add(0, 1);

        do {
            nums.add(i * 5);
            i++;
        } while (nums.size() < 10);

        System.out.println(nums);

        int x = nums.get(1);
        int y = nums.get(nums.size() - 1);
        int product = x * y;
        System.out.println(x + " * " + y + " = "  + product);

    }
}
