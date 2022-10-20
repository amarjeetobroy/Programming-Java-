import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int a,b,c,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("your choice");
        ch = sc.nextInt();

        switch(ch){
            case 1: c = a+b;
            System.out.println("Addition"+c);
            break;
            case 2: c = a-b;
            System.out.println("subtraction" +c);
            break;
            case 3: c = a*b;
            System.out.println("multiplication" +c);
            break;
            case 4: c = a/b;
            System.out.println("division" + c);
            break;
            case 5: c = a%b;
            System.out.println("remainder" + c);
            break;
            default: System.out.println("invalid choice");
        }
    }
    
}
