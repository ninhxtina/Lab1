/** Christina Ninh
 * CSSKL143 - Colaianne
 */

import java.util.StringTokenizer;

public class InFixCalc {
    public static void main(String[] args) {
        //String input = 4 + 4 /2
        //String input = 1 * -3
        //String input = 1 * -3 + 6 / 3
        String input ="1 * -3 + 6 / 3";
        //String input - 5
        //String input = -5
        int answer = calculate(input);
        System.out.println("Answer is " + answer);
    }//end main

    //preconditions: all binary operations are separated via a space
    //postconditions: returns the result of the processed string
    public static int calculate(String input) {
        int lhs, rhs; //short for left-hand/right-hand side
        char operation = 0;
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());

            int result = 0;
            switch (operation) {
                case "+":
                    result = lhs + rhs;
                    break;
                case "-":
                    result = lhs - rhs;
                    break;
                case "*":
                    result = lhs * rhs;
                    break;
                case "/":
                    result = lhs / rhs;
                    break;
                default:
                    break;
            }
        }
    }
}
