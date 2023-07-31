import java.util.Scanner;
import java.lang.*;
public class areaoftrangle {
    public static void main(String[] args) {
        int a,b,c,sp; double area;
        System.out.println("Enter the area of trangle:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        sp=(a+b+c)/2;

         area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
         System.out.println("Area of trangle:"+area);
    }
    
}
/*
Output
  Enter the area of trangle:
5
6
3
Area of trangle:7.483314773547883
  */
