import java.util.Scanner;                    //imported the scanner for input
public class RandomNumber {                  // class of Random number
    public static void main(String[] args) { // main function
        int number,
            excludeNumber; // declared variables number and exclude number
        boolean choose;    // choose variable to make the program user driven
        Scanner scanner = new Scanner(
            System.in);         // created the scanner to take input from user
        do {                    // starting of do while loop
            System.out.println( // displaying the Random number generator
                                // message to user
                "<------------------------------Random number generator game --------------------------------");
            System.out.println(
                "Enter the minimum number:"); // taking the minimum number of
                                              // range from user
            int min = scanner.nextInt();
            System.out.println(
                "Enter the maximum number:"); // taking maximum number of range
                                              // from user
            int max = scanner.nextInt();
            if (min >= max) { // minimum number cannot be greater or equal to
                              // max so i did this to handle that error
                System.out.println(
                    "Minimum number cannot be greater than or equal to maximum number\nKindly try again."); // displaying related message to user that the input was invalid
                continue; // continue to skip the further statement as input is
                          // invalid
            }
            System.out
                .println( // if iput is invalid displaying the message to user
                          // to enter the number of random number to generate
                    "Enter the number of random numbers you like to generate:");
            int limit = scanner.nextInt(); // taking input of number of random
                                           // numbers in limit
            System.out.println( // presenting two options to user either to
                                // display all numbers or exclude a number from
                                // the range
                "Enter:\n'1'to generate random number without any exclusion.\n'2' to generate random numbers with exclusion.");
            int choice = scanner.nextInt(); // taking input for that choice
            if (choice == 1) { // choice 1 deals with displaying all random
                               // numbers without any exclusion
                System.out.println("Your random numbers are:");
                for (int i = 0; i < limit; i++) { // using for number as it is
                                                  // fixed number of iteration
                    number = (int)(Math.random() * (max - min + 1)) +
                             min; // method to generate the random int number
                    System.out.println(number); // displaying the number
                }

            } else if (choice == 2) { // choice 2 deals with displaying random
                                      // numbers with exclusion
                while (true) {
                    System.out.println( // displaying the message to tell a
                                        // number to exclude
                        "Enter the number you would like to exclude:");
                    excludeNumber = scanner.nextInt();
                    if (excludeNumber > max ||
                        excludeNumber <
                            min) { // to check the number must be in range
                        System.out.println(
                            "Your number is not in the range of " + min +
                            " and " + max +
                            "\nTry Again"); // if not displaying message
                    } else
                        break; // otherwise breaking the loop
                }
                System.out.println("Your random numbers are:"); /*displaying the
                                                                random numbers*/
                for (int i = 0; i < limit; i++) {
                    number = (int)(Math.random() * (max - min + 1)) +
                             min; // generating the random number
                    if (number ==
                        excludeNumber) { /*if number is equal to exclude it
                                          will skip the iteration and
                                          decrement the counter*/

                        i--;
                        continue;
                    }
                    System.out.println(
                        number); // otherwise displaying the number
                }

            } else
                System.out
                    .println(/*  to handle the error case if user enters
                              any choice other than 1 or 2 */
                             "You have entered a wrong input for choice\nTry Again");
            System.out.println(
                "Would u like to continue(true/false):"); /*  giving user choice
                                                           to either continue
                                                           to play this game
                                                           or not*/
             choose = Boolean.valueOf(scanner.nextLine());
            if (choose == false) {
                break;
            }
        } while (true);
        scanner.close(); // closing the scanner
    }
}
