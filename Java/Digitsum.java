import java.util.Scanner;

public class DigitSum {
    public static void main(String[]args){
        int sum=0;
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n>0){
            int r=n%10;
             sum=sum+r;
            n=n/10;
        }
        System.out.println("sum of digit:" +sum);
    }
    
}
/* Output
  Enter any number:
8652
sum of digit:21
  */
