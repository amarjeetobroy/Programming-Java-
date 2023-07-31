import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        int size,loc,item;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter array Elements:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
    }
    System.out.println("Enter array location:");
    loc=sc.nextInt();

    for(int i=loc;i<size-1;i++){
        a[i]=a[i+1];
    }
    size--;
      System.out.println("Your Ans : ");
    for(int i=0;i<size;i++){
        System.out.println(a[i]+" ");
    }
}
}
/*
Output
  Enter Array Size:
5
Enter array Elements:
6
3
6
5
4
Enter array location:
2
Your Ans:
6
3
5
4
  */
