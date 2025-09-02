package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b) {
            System.out.println("a or b is true");
        }

        // write your code below

        // AND
        if (a & b) {
            System.out.println("&: a and b must be true");
        }

        // short-circuit AND
        if (a && b) {
            System.out.println("&&: if a is false, b is skipped. They both need to be true");
        }

        // OR
        if (a | b) {
            System.out.println("\n| :  a or b is true");
        }

        // short-circuit OR
        if (a || b) {
            System.out.println("||:  a is true so b is skipped. Either must be true");
        }

        // XOR
        if (a ^ b) {
            System.out.println("^ :  a or b must be true but not both");
        }

        // NOT
        if (!a) {
            System.out.println("!: only if a is NOT true this will print");
        }
    }
}