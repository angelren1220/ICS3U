/* Write algorithm for a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered. The program must allow user to continue for another input or quit the program.	 */

// 1. Initialize two variables, 'largest' and 'smallest', with MIN and MAX respectively.
// 2. Begin an infinite loop:
//     2.1. Prompt the user to enter a number or a special keyword (e.g., 'quit') to exit.
//     2.2. If the user enters the keyword 'quit':
//         2.2.1. Break out of the loop.
//     2.3. Convert the user input to a number.
//     2.4. If 'largest' is MIN or the user's number is greater than 'largest':
//         2.4.1. Set 'largest' to the user's number.
//     2.5. If 'smallest' is MAX or the user's number is less than 'smallest':
//         2.5.1. Set 'smallest' to the user's number.
// 3. If 'largest' is not MIN and 'smallest' is not MAX:
//     3.1. Display the values of 'largest' and 'smallest' to the user.
// 4. End.

import java.util.Scanner;

public class LargestAndSamllest {
  public static void main(String[] args) {
    int largestNumber = Integer.MIN_VALUE;
    int smallestNumber = Integer.MAX_VALUE;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a number or press 'q' to quit.");
      String input = scanner.nextLine();

      if (input.equals("q")) {
        scanner.close();
        break;
      } else {
        int number = Integer.parseInt(input);

        if ((largestNumber == Integer.MIN_VALUE) || (number > largestNumber)) {
          largestNumber = number;
        }

        if ((smallestNumber == Integer.MAX_VALUE) || (number < smallestNumber)) {
          smallestNumber = number;
        }
      }
    }

    if ((largestNumber != Integer.MIN_VALUE) && (smallestNumber != Integer.MAX_VALUE)){
      System.out.println("Largest number: " + largestNumber + "\nSmallest number: " + smallestNumber);
    }
  }
}
