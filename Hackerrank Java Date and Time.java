/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date , the method should return  as the day on that date.

image

Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.*/

/* Java Code */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


/* Explaination for Above Code*/

/*
Here’s a very simple explanation of each line in your Java code:


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

- These are **import statements** that allow you to use predefined Java classes from different packages (like `java.io.*` for input/output operations, `java.util.*` for utility functions, etc.). Not all are used in this program, but they are commonly added to provide flexibility in the code.


class Result {

- This defines a class named `Result` where the logic of finding the day will be placed.


/*
 * Complete the 'findDay' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER month
 *  2. INTEGER day
 *  3. INTEGER year
 */

- This is a **comment** explaining the function's purpose: it returns the day of the week (as a string) when given a date (month, day, and year).


public static String findDay(int month, int day, int year) {

- This is the **method signature** for the `findDay` method, which takes three integers (month, day, year) and returns a string.


    Calendar cal = Calendar.getInstance();

- Creates an instance of the `Calendar` class, which represents a specific date.


    cal.set(Calendar.MONTH, month-1);

- Sets the **month** in the calendar. The `-1` is because months in the `Calendar` class are zero-indexed (January = 0, February = 1, etc.).


    cal.set(Calendar.DAY_OF_MONTH, day);

- Sets the **day of the month** in the calendar.


    cal.set(Calendar.YEAR, year);

- Sets the **year** in the calendar.


    return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

- Gets the **day of the week** for the given date, formats it as a long name (like "Monday") in **uppercase** letters.


}

- End of the `findDay` method.


public class Solution {

- Starts the `Solution` class, which contains the `main` method where the program starts executing.


public static void main(String[] args) throws IOException {

- This is the **main method** where the program begins. It can throw an **IOException** for handling input/output errors.


BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

- Sets up a **BufferedReader** to read input from the user or the system.


BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

- Sets up a **BufferedWriter** to write output to a specified file, which is determined by the environment variable `"OUTPUT_PATH"`.


String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

- Reads a line of input, removes trailing spaces, and splits the input into an array of strings based on spaces.


int month = Integer.parseInt(firstMultipleInput[0]);
int day = Integer.parseInt(firstMultipleInput[1]);
int year = Integer.parseInt(firstMultipleInput[2]);

- Converts the first three elements of the input (strings) into **integers** representing the **month, day,** and **year**.


String res = Result.findDay(month, day, year);

- Calls the `findDay` method to get the day of the week for the given date.


bufferedWriter.write(res);
bufferedWriter.newLine();

- Writes the result (day of the week) to the output file and moves to the next line.


bufferedReader.close();
bufferedWriter.close();

- Closes the `BufferedReader` and `BufferedWriter` to free up resources.

That’s the simple breakdown! This code essentially takes a date as input, calculates the day of the week, and writes that result to an output file.
*/
