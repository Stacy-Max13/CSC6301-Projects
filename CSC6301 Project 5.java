import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

/**
 * This program reads a list of integer numbers from the standard input,
 * stores them in a Stack in sorted order, and prints the sorted numbers.
 * 
 * <p>
 * The program is designed to run from the command line and does not
 * require an IDE to execute.
 * </p>
 * 
 * @author Your Name
 * @version 2.0 (Modified from LinkedList to Stack)
 */
public class SortedStack {

    /**
     * The main method reads integers from standard input, sorts them, and stores them in a stack.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (separated by space), then press Enter:");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        // Sort the numbers
        Collections.sort(numbers);

        // Push sorted numbers onto a stack
        Stack<Integer> stack = new Stack<>();
        for (int num : numbers) {
            stack.push(num);
        }

        // Print the sorted numbers from the stack
        System.out.println("Sorted Numbers: " + stack);
    }
}
