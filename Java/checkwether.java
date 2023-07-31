import java.util.Scanner;

public class checkwether {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                 sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("This is perfect no");
        }
        else{
            System.out.println("This is not perfect no");
        }
    }
    
}
/* Output
  5
This is not perfect no
  */
