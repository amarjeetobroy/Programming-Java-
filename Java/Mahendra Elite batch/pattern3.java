
import java.util.Scanner;
public class patternjava{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=0;row<n;row++){
			for(int space=0;space<row;space++)
				System.out.print(" ");
				for(int col=row;col<n;col++)
					System.out.print(col-row+1);
				
				System.out.println();
			}
		}
}

/* Output
5
12345
 1234
  123
   12
    1
    */
