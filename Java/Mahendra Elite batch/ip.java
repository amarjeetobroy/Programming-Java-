 // indentyfy  given ip address valid or not

import java.util.Scanner;
public class ip{  
public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	String str;
        	int flag=0;
        	str=sc.nextLine();
        	String[] strArr=str.split("\\.");
        	for(String s:strArr){
        		//System.out.println(s);
        		int n=Integer.parseInt(s);
        		if(n<=0||n>=255){
        			flag=1;
        		}        		
        	}
        	if(flag==0)
        	System.out.println("valid");
        	else
        	System.out.println("Invalid");
        }
}
/* Output
123.145.213.5
valid
*/
