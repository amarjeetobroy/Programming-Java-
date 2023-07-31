/*print ASCII value of charcter */

//input A===65
import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character");
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
        int a = ch;
        System.out.println("ASCII value of" + ch + " is " + a);
    }
}
/*
Output
  Enter any character
A
ASCII value ofA is 65
  */
