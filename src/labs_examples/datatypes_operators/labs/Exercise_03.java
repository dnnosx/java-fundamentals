package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int a, b;
        a = 4;
        b = 3;

        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        double div = (double) a / b;
        int mod = a % b;

        System.out.println("add: " + add);
        System.out.println("sub: " + sub);
        System.out.println("mult: " + mult);
        System.out.println("div: " + div);
        System.out.println("mod: " + mod);

    }

}
