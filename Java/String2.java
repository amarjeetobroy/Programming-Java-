//Q. check How many vowels in String 


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.print("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char []chars=str.toCharArray();
		
		int count = 0;
		
		for(char c :chars){
		    switch (c){
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		            count++;
		            break;
		    }
		}
		
		System.out.println("Number of vowels in string: " +count);
	}
}

/* Output
  Enter any String: amarjeet
Number of vowels in string: 4 String
  */
