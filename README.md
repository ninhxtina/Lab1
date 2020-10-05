# CSSSKL 143 Lab: Review, Structured Programming, and Data and Methods in Classes
# Section 1: Review of Structured Programming is an optional section for you to complete if you feel that you want more practice on any of the topics covered in CSS 142. You are not required to submit any of this section, unless you want feedback or have questions on the material.

For the following TWO sections bellow, submit all of the Java files associated with the section:

- Infix calculator project.
- Data and methods in classes:  Solutions for all subsections (1-8).
All work must be submitted via Canvas.

List of Files to Submit:

- InFixCalc.java
- NewAndReviewExamples.java
- Rectangle.java
- Car.java or vehicle.java
- Point.java or Pair.java
- Time.java or Date.java
- SquareSomething.java
# Review of Structured Programming (optional)
## Purpose
This section serves as a refresher for programming constructs and structures in Java. We will consider Selection Control Structures (if/switch), Repetition Control Structures (for/while), arrays, and File IO.The first five programs are simple enough to be done all in one main (thus one file), while the last two programs in this section require their own file and main driver.

Let’s review some Java code that was core to CSS 142. We’ll start with some control structures and move on to data, arrays, algorithms and a bit of file IO. Start by picking a java IDE of your choice (frequently BlueJ or Eclipse), make a project, and make a main(). Do the following exercises in this main function.

## 1. Control Structures (For, While, If, Switch)
- Write a loop to print out numbers 1-10. Use a for() loop to accomplish this.
- Write a loop to print out the first 10 even numbers Use a while() loop to accomplish this and use an if (a % 2 == 0) to determine even or odd.
- Write a loop to sum the first 5 integer quiz scores entered by the user through the console. Use Scanner keys = new Scanner(System.in) for console input and use a sum variable.
- Average the integers entered in the previous problem. Produce a double result, as in 96.5.
- Use an if statement to produce a letter grade {A,B,C,D,F}. Grades over 90 should print "A", over 80 should print "B", etc.
- Rewrite the if statement above using a switch statement. Are there any problems with this?
## 2. Arrays
- Write a new method or main and declare an array of integers (choose whatever values you'd like, e.g., int[] data = {3,1,-8,4,-5,2};).
- Write a separate function to sum the contents of an array (e.g., public static int sum(int[] data)).
- Find the average after receiving the return value from the function above.
- Write a function to find the index of a specified element.
- Write a function to sum up only positive integers in an array.
- Write a function to populate an int array with values obtained from the console.
## 3. File IO
- Write the contents of the array above to a file, all on one line separated by a comma (e.g., use PrintWriter).
- Write the sum of the array to the file on the next line
- Write the average of the array to the third line
- Make a new main that reads the contents of this file (“data.txt”) and prints it to the console (e.g., use Scanner).
## 4. Standalone Programs using Loop Structures – Part I
In this section, your job will be to write a new program/class that will use scanner to ask the user for a number. Once you’ve got the number, your job is to calculate the factorial corresponding to the number. We’ll use a loop (a Repetition Control Structure) inside our main to build the final output. Here is an example execution from the console (although you may use JOptionPane if you wish) – note the user input to the program is the "5" after the "Enter the number:" prompt.

Enter the number: 5
1*2*3*4*5
120
Steps:

1. Declare a new program or class (if this is eclipse, make a new project first).
2. Define the main function.
3. Inside main, declare a Scanner object (don’t forget your import!).
4. Define a variable called product. Should this start at 0?
5. Prompt the user as the output indicates above for a number n.
6. Write a for loop that loops from 1 to n, printing out the current number each time.
7. In the loop, multiply your loop control variable by product.
8. Print out your final product.
## 5. A Second Java Program (Selection Control Structures)
Create a new java program and define its main function. In this program, we’ll also use a scanner to ask the user for a number n. Once we have this number, we’d like to find its GCD (greatest common divisor) by using a simple algorithm described below. Notice that, to determine the GCD, we’ll need to make use of an if statement (a Selection Control Structure) to determine if the number n is evenly divisible by some divisor d. The code to determine if a number n is evenly divisible by a divisor d is written here: “ if n divided by d produces a remainder of zero, then d evenly divides n” Or in Java: if (n % d == 0) { //if true, d is a divisor Notice we will also need an if statement for special cases; what if the user enters a 0 or a 1? Handle these special cases by wrapping your logic in an if statement that handles the case where n is 0, 1, or greater than 1. Here is a sample execution...

Enter a number: 12
Divisors are 6 4 3 2 1
Steps:

1. Make a new program and define its main().
2. Define a Scanner object and ask the user for a number n.
3. Build an if statement to handle cases such as 0, 1, or greater than 1.
4. In the greater than one case, build a loop starting at n (or n/2?) and ending at 1.
5. Using the if statement above, print out your loop variable if it evenly divides n.
## 6. File I/O using PrintWriter
Revisit your first two programs, and instead of outputting the answers to the console, use PrintWriter to write your data to a file (say “data.txt”). Steps:

1. Declare a PrintWriter object.
2. Next, catch or declare your problematic code, now that you are attempting file i/o.
3. Instead of printing your output to System.out.println(), use your PrintWriter object's println() method.
4. Close your PrintWriter object.
## 7. File I/O using Scanner
Build a program/class and define a main(). This program will open the text files from the first two programs (say, “data1.txt” and “data2.txt”) and output the results of the file to the console. Consider a sample execution below:

Which file to view? data1.txt
1*2*3*4*5
120
We will use Scanner to accomplish the file reading, but instead of making a Scanner which points to System.in, you must define a Scanner using something like what follows: Scanner foo = new Scanner(new File(filename)); Steps:

1. Define a program and define its main().
2. Ask the user for a filename to view.
3. Declare your Scanner object to read from the file as demonstrated above.
4. While your file has more lines, print out each line.
5. Close your Scanner object.
# Infix Calculator Project
Build a simple calculator that ignores order of operations. This “infix” calculator will read in a String from the user and calculate the results of that String from left to right. Consider the following left-to-right calculations:

"4 + 4 / 2"
"Answer is 4"   //not 6, since the addition occurs first when reading from left to right
“1 * -3 + 6 / 3”
“Answer is 1”   //not -1, Start your program by copying the driver code below.
Read the program bellow and notice the comments before you proceed –your assignments in the lecture section will require you to comment accordingly, or they will drop a complete letter grade! This is a good example of what comments could look like, so feel free to use it as a reference. Begin by tracing (i.e. reading through) the program in main. Your code will go in the calculate() function, so start writing code there. Hints:

- Build the starter code using a snippet below.
- Assume spaces between all numbers and operators.
- If a number is negative (like -3), there will be no space between the sign and the number. Use Scanner and nextInt() to read each integer.
- Use Scanner and what operation to read a single character? (our operator?).
- Or you could also use StringTokenizer to do these tasks as well.
- To get started, use the comments below or down load the file InFixCalc.javaPreview the document. Can you write the regular expression that would recognize this pattern?
import ?; /*
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * Exercise author: Rob Nash
 * Complete the calculate() function below to build a simple, infix
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 *
 * Example: " 1 * -3 + 6 / 3"
 * Execution: calculate 1 * -3 first, then -3 + 6 next, then 3 / 3
 * last to obtain the value 1
*
* Solution by 
*/
public class InFixCalc {
    //example pattern: "3 + 5"
    //general pattern: <lhs='3'> <operation='+'> <rhs='5'> //extended pattern:     ...  
    //special case: 
    //other special cases?
    //implement this logic in the calculate method bellow

    public static void main(String[] args) { //String input = "4 + 4";
        //String input = "4 + 4 / 2";
        //String input ="1 * -3";
        String input ="1 * -3 + 6 / 3";
        //String input ="5";
        //String input ="-5";
        int answer = calculate(input);
        System.out.println("Answer is " + answer);
    }

//preconditions: all binary operations are separated via a space
//postconditions: returns the result of the processed string
    public static int calculate(String input) {
        int lhs,rhs; //short for left-hand & right-hand side
        char operation;
        /*todo: your name and code goes here*/
        /*You need a Scanner(or StringTokenizer) to get tokens
          *Then you need a loop, and switch inside that loop*/
        return lhs;
    }
}
# Data and Methods in Classes
## Introduction
This lab both reviews old materials and introduce new materials that correspond with the readings in the schedule for weeks one and two.  In this section, we’ll use a driver provided for you to explore each of the sections below. In BlueJ or Eclipse, make a new Java project and add  Rectangle.javaPreview the document and it's driver NewAndReviewExamples.javaPreview the document to get started. Run the NewAndReviewExamples.java driver for each case of the switch statement and observe what happens. After you run each case, take a look at the code used to produce that result. Use these two files as examples while working on the remaining sections.

You may complete this section in lab if time permits, but this section is designed to be completed outside of lab and before lecture next week. In this section, you will review some old topics and explore some new ones as well. We’ll start with topics related to data (primitives and objects), and then look at topics that focus on methods.

## 1. Data in Java: Primitives and Objects
In this section, we’ll build a class that is composed of both primitives and objects. Java has classes to help in converting from primitives to objects (for example converting an int to an Integer) and vice-versa. Let’s start by building a small class used to represent a single concept such as a Car or Vehicle.
Make a new Java project and and create a new class called “Car”.
Cars should define primitives for things like odometers, etc., and Strings for make and model. Inside your Car class but outside of any method, define three (instance) variables for the odometer, make, and model.
Write a main that builds 2 cars and prints them out. (Hint: Car c1 = new Car(); and System.out.println(c1.toString());.
## 2. Variable Scope in Java: Local and Class-Level
Lets practice building classes again and defining two variables: one local and one with class-level scope. Prove to yourself that you can access the class-level variable throughout the class in which it’s defined. Then, try to access the local variable from a method other than the one in which it’s defined. Finally, look inside of Rectangle.java and identify at least 4 instance variables (class-level) and at least 2 local variables. Indicate these using comments.
## 3. This (the Implicit Parameter)
Take a class you’ve already built (or build the Car Class described in the “Data in Java” section) and build an object from that class. Observe the address of that object in main by using println with toString().  Next, from a method inside the class, print out the address of the “this” object using println. Call that method on the object you’ve just built, and explain why the two addresses are the same. If you get stuck take a look at Case 1 in NewAndReviewExamples.java.
## 4. Access Modifiers: Public and Private
Build yet another simple class (say, a Point or Pair). Then, create another (separate, distinct) class that is to be the “driver” for this example (just like the driver for Rectangle.java above). In Your Point class, create two methods. One should be public and another private. In your driver, build an object of the Point class and try to access a method declared as public. Now, on the same Point object, try to call a method declared as private. What message does Java print out? Next, declare a class-level data item as public (say, an int), and declare another class-level data item as private. In your driver’s “main”, try again to access these two data items – what message does the Java compiler display now?
## 5. Accessors and Mutators (or, Getters and Setters)
Each of these sections encourages you to practice building small classes, and we’ll continue that pattern here. Construct a simple class used to store the time or date. Add a field for minute, second, and hour, but make these class-level variables private. So that our class can be used by external clients, we need to declare some public methods for use with our private data. Build two methods for each data item: one to get the value of the data item, and one to set the value of the data item. See the getters and setters defined in the Rectangle class for examples of these getters & setters.
## 6. Overriding toString() (and equals())
Build a simple class to represent a Vehicle (or reuse your Car class above). In a main, build an object of that class, and print out the object using System.out.println(). Notice that this simply reports the memory address of the object in question, and we’d like to do something more useful. To replace (or override) the toString (or equals) function, first see the examples defined in the NewAndReviewExamples.java file for both toString and equals. Now, build a toString function that prints out the make, model, and odometer reading for a vehicle object.
## 7. Overloading Methods
Check out the Rectangle class constructors to see an example of overloading – defining multiple methods with the same name. Now build a SquareSomething class, with all static functions, whose purpose is to take an int, a double, or a float, and report back the square of the number (returning the correct type). This will mean your square class has three functions ( all named “square”) that each take a different type of data as input (int, double, float). Your square function that takes a double should return a double as well. This is how the println() method accomplishes such flexibility – you can hand it an int, a string, a double, a float, etc. and it simply prints the data. How it does so is by overloading the println() method to provide a different function for each possible type of input.
## 8. Constructors as Methods
First, check out the set of constructors provided for you in the Rectangle class. Notice how they are overloaded (meaning many methods with the same name, but different with regards to input) to provide flexibility for users of this class. Add to your Car class two constructors – one to take a string make, the other to take two strings: a make and a model. Test these constructors by building multiple Cars in your main() driver, calling each constructor in turn.
Credits
Rob Nash originally wrote much of this lab.  Edits by others including Johnny Lin.
