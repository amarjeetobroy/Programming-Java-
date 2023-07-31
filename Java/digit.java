import java.util.Scanner;

public class DIGITS {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("enter no..:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("number of digits:"+count);
    }
    
}

/* Output
  enter no..:
25635986
number of digits:8
  */
