import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            if(digit==2||digit==3||digit==5||digit==7){
            System.out.println(digit);
            sum=sum*10+digit;
            }
            n=n/10;
        }
        while(sum>0){
            int digit=sum%10;
            System.out.println(digit);
            sum=sum/10;
        }
        //System.out.print(sum+" ");
}
}

/* Output
     123456
     5
     3
     2
     2
     3
     5
