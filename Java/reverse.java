import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter sentence: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();//"Geeks for Geeks";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
    }
}
/* Output

Enter sentence:
 amarjeet
 teejrama
 */
