import java.util.Scanner;


public class Armostrang {
    public static void main(String[] args) {
        int n,r,res=0,c;
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;

        while(n>0){
            r=n%10;
            res=(r*r*r)+res;
            n=n/10;
        }
        if(res==c){
            System.out.println("Armostrang number");
        }
        else{
            System.out.println("Not Armostrang number");
        }
    }
    
}
/* Output
  Enter any number:
5
Not Armostrang number
  */
