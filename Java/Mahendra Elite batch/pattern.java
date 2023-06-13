import java.util.Scanner;
public class patternjava{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=0;row<n;row++){
			for(int col=0;col<n;col++){
				System.out.print(row);
			}
			System.out.println();
		}
	}
}

/* Output
5
00000
11111
22222
33333
44444
*/
