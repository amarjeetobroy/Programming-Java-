//count the string in given

import java.util.Scanner;
public class problem{	
public static void main(String[] args) {
  System.out.println("Enter any Name:");
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		char arr[]=str.toCharArray();
		//int size=sc.nextInt();

		for(int i=0;i<str.length();i++){
			int count=1;
			for(int j=i+1;j<str.length();j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j]='*';
				}
			}
			if(arr[i]!='*')
				System.out.println(arr[i]+"-" +count);
		}
	}

}
/* Output
Enter any Name:
amarjeet
a-2
m-1
r-1
j-1
e-2
t-1
*/
