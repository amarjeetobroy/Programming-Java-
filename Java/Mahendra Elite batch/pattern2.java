
import java.util.Scanner;
public class patternjava{	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=1;row<=n;row++){
			for(int col=1;col<=row;col++){
				System.out.print(row);
			}
			System.out.println();
		}
	}
}
/* Output
5
1
22
333
4444
55555
*/
