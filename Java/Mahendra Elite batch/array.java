import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter size:");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int size = sc.nextInt();
		System.out.println("Enter your elements:");
			int p =1;
		for(int i=0;i<size;i++){
			 arr[i]=sc.nextInt();
			 p=(arr[i])*p;

		}
		System.out.print("Your Ans: "+p);
	}
}
/* Output
Enter size
3
Enter your elements
2 3 5
Your Ans: 30
*/
