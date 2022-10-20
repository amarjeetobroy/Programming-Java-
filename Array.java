/*
Enter size:                                                                                                    5                                                                                                              enter number:
25 65 98 65 36 56
your ans:
25
65
98
65
36
*/

import java.util.Scanner;

public class aArray {
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();

         int number[]=new int[size];

         System.out.println("enter number:");

         for(int i=0;i<size;i++){
             number[i]=sc.nextInt();
      
         }
         System.out.println("your Ans:");
         for(int i=0;i<size;i++){
            System.out.println(number[i]);
         }
    }
    
}
