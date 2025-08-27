package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";

        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();
        System.out.println(length);

        String str2 = "hello";

        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = str.equals(str2);
        System.out.println(isEqual);

        // please concatenate str & str2 and set the result to a new String variable below
        String together = str + str2;
        System.out.println(together);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String replaced = str.replace('!', '?');
        System.out.println(replaced);

        String substring = str.substring(0, 2);
        System.out.println(substring);

        boolean contains = str.contains("ll");
        System.out.println(contains);

        int index = str.indexOf("o");
        System.out.println(index);

        char charAt = str.charAt(4);
        System.out.println(charAt);

        String uppercase = str.toUpperCase();
        System.out.println(uppercase);
    }


}