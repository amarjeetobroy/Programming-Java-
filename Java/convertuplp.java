import java.util.Scanner;

public class convert {
    public static void main(String[]args){
        char ch,ch2;
        System.out.println("Enter any character:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);

         System.out.println("Your Ans:");
        if(ch>='A' && ch<='Z'){
           ch2= Character.toLowerCase(ch);
           System.out.println("LowerCase:"+ch2);
        }
        else{
            ch2=Character.toUpperCase(ch);
            System.out.println("UpperCase:"+ch2);
        }

    }
    
}
/*
Output
  Enter any character:
a
Your Ans:
A
Your Ans:
LowerCase:a
  */
