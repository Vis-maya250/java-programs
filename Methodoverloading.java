import java.util.Scanner;
class Maths
{
    void area(double r)
    {
        System.out.println("Area of the circle is= "+3.14*r*r);
    }
    void area(int l,int b)
    {
        System.out.println("Area of the rectangle= "+l*b);
    }
    void area(double base,double height)
    {
        System.out.println("Area of the triangle= "+0.5*base*height);
    }
}
public class Method
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        Maths m=new Maths();
        System.out.println("enter the radius of the circle: ");
        double r=sc.nextDouble();
        m.area(r);
        System.out.println("enter the length and breadth of the rectangle: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        m.area(l,b);
        System.out.println("enter the base and height of the triangle: ");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        m.area(base,height);
    }
}
