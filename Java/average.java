import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        System.out.println("Enter five subject marks:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int sum=a+b+c+d+e;
        System.out.println("your total marks:"+sum);

        double avg=sum/5.0;
        System.out.println("Average marks:"+avg);
    }
    
}
/* Output
  Enter five subject marks:
96
56
89
78
83
your total marks:402
Average marks:80.4
  */
