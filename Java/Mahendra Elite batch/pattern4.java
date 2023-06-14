
import java.util.Scanner;
public class pattern4{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t=1;
		for(int row=0;row<n;row++){
			for(int col=0;col<t;col++){
				if(col==0||row==n-1||col==t-1)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			t=t+2;
			System.out.println();
		}
	}

// 	5
// *
// * *
// *   *
// *     *
// *
