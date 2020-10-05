/** Christina Ninh
 * CSSKL143 - Colaianne
 */

import java.util.Stack;
import java.util.StringTokenizer;

public class InFixCalc {
    public static void main(String[] args) {
        //String input = 4 + 4 /2
        //String input = 1 * -3
        //String input = 1 * -3 + 6 / 3
        String input = "1 * -3 + 6 / 3";
        //String input - 5
        //String input = -5
        int answer = calculate(input);
        System.out.println("Answer is " + answer);
    }//end main

    //preconditions: all binary operations are separated via a space
    //postconditions: returns the result of the processed string
    public static int calculate(String input) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> nums = new Stack<Double>();
        for (String str : input) {
            if (str.trim().equals("")) {
                continue;
            }

            switch (str) {
                case "(":
                    break;
                case ")":
                    double right = nums.pop();
                    double left = nums.pop();
                    String operator = ops.pop();
                    double val = 0;
                    switch (operator) {
                        case "+":
                            val = left + right;
                            break;
                        case "-":
                            val = left - right;
                            break;
                        case "*":
                            val = left * right;
                            break;
                        case "/":
                            val = left / right;
                            break;
                        default:
                            break;
                    }
                    nums.push(val);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    ops.push(str);
                    break;
                default:
                    nums.push(Double.parseDouble(str));
                    break;
            }
        }
        return ops.pop();
    }
}

