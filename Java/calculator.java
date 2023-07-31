import java.util.Scanner;

public class calcalutor {
    public static void main(String []args){
        int n1,n2,ch,cal;
        System.out.println("Enter your first number:");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        System.out.println("Enter your second number:");
        n2=sc.nextInt();
        System.out.println("chose operator:(1,2,3,4,5,)");
        ch=sc.nextInt();

        if(ch==1){
            cal=n1+n2;
            System.out.println("ADDITION:"+cal);
        }
        else if(ch==2){
            cal=n1-n2;
            System.out.println("SUBTRACTION:"+cal);
        }
        else if(ch==3){
            cal=n1*n2;
            System.out.println("MULTIPLICATION:"+cal);
        }
        else if(ch==4){
            cal=n1/n2;
            System.out.println("DIVISION:"+cal);
        }
        else{
            cal=n1%n2;
            System.out.println("REMINDER:"+cal);
        }
    }
    
}

/* Output
  Enter your first number:
56
Enter your second number:
89
chose operator:(1,2,3,4,5,)
2
SUBTRACTION:-33
  */
