public class ExceptionDemo
{
    public static void main(String args[])
    {
        int firstnumber,secondnumber;
        try{
            firstnumber=0;
            secondnumber=56/firstnumber;
            System.out.println(secondnumber);
            System.out.println("Hey I'm at the end of try block");
        }
        catch(ArithmeticException e)
        {
            System.out.println("You should not divide a number by zero");
        }
        finally{
            System.out.println("I'm finally block,exception can't block my execution");
        }
        }
}
