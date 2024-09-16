import java.util.Scanner;
public class Frequency
  {
     public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string: ");
      String str=sc.nextLine();
      System.out.println("Enter the character: ");
      char ch=sc.next().charAt(0);
      int count=0;
      int len=str.length();
      for(int i=0;i<len;i++)
      {
          if(str.charAt(i)==ch)
          {
              count++;
          }
      }
      System.out.println("Frequency of the character is: "+count);
    }
  }
