
// Enter two number:
// 5
// 9
// sum is: 14




import java.util.Scanner;
class function {
  public static int calculatesum(int a,int b){
      int sum=a+b;
      return sum;
  }
  public static void main(String[]args){
      System.out.println("Enter two number:");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int sum=calculatesum(a, b);
      System.out.println("sum is: " +sum);
  }
}
