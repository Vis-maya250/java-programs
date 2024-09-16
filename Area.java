import java.util.Scanner;
public class Area
  {
     public static void main(String args[])
    {
      scanner sc=new Scanner(System.in);
      System.out,println("Enter the length of the rectangle: ");
      int l=sc.nextInt();
      System.out.println("Enter the breadth of the rectangle: ");
      int b=sc.nextInt();
      int Area=l*b;
      System.out.println("Result id "+Area);
    }
  }
