import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive integer (0 to exit): ");
            number = scanner.nextInt();

            if (number > 0) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        } while (number != 0);

        System.out.println("Exiting the program.");
    }
}
/* Output
Enter a positive integer (0 to exit): 65
65 is not a prime number.
Enter a positive integer (0 to exit): 5
5 is a prime number.
Enter a positive integer (0 to exit): 7 
7 is a prime number.
Enter a positive integer (0 to exit): 6
6 is not a prime number.
Enter a positive integer (0 to exit): 2
2 is a prime number.
Enter a positive integer (0 to exit): 
*/
