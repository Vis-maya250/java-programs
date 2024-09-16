import java.util.Scanner;
public class Factorial
  {
     public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int fact=1,i;
      System.out.println("Enter the number: ");
      int num=sc.nextInt();
      for(i=1;i<=num;i++)
        {
           fact=fact*i;
        }
      System.out.println("Result is "+fact);
    }
  }


      
