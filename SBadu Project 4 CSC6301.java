import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * This program reads a list of integer numbers from the standard input, 
 * stores them in a LinkedList, sorts them in ascending order, and prints 
 * the sorted list to the console.
 * 
 * <p>
 * The program is designed to run from the command line and does not 
 * require an IDE to execute.
 * </p>
 * 
 * @author Your Name
 * @version 1.0
 */
public class SortedLinkedList {

    /**
     * The main method reads integers from standard input, sorts them, and prints the result.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<>();

        System.out.println("Enter numbers (separated by space), then press Enter:");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        // Sort the LinkedList
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println("Sorted Numbers: " + numbers);
    }
}
