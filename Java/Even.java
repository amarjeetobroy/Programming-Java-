import java.util.Scanner;

//    print Even number in Given range

//input 10= 0 2 4 6 8 10

public class Even {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of Term");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        System.out.println("Your Ans :");

        for (int i = 0; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }
}
/* Output
  Enter number of Term
10
Your Ans :
0
2
4
6
8
10
  */
