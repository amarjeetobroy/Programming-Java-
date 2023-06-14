import java.util.Scanner;
public class pattern6{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int row=1-n;row<n;row++){
			for(int col=1-n;col<n;col++){
				if(Math.abs(row)>Math.abs(col))
					System.out.print(Math.abs(row)+1);
				else					
				System.out.print(Math.abs(col)+1);
			}
			System.out.println();

		}
	}
}

/* Output
	5
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555
  */


