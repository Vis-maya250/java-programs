import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continueFlag;

        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Arithmetic operation");
            System.out.println("2. Array access");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
              
                    try {
                        System.out.println("Enter the number to be divided:");
                        int num = sc.nextInt();
                        System.out.println("Enter the divisor:");
                        int divisor = sc.nextInt();

                        
                        int result = num / divisor;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        
                        System.out.println("Caught an exception: Division by zero is not allowed.");
                    } finally {
                        System.out.println("Arithmetic operation ended.");
                    }
                    break;

                case 2:
                    
                    try {
                        int[] array = {1, 2, 3, 4, 5};
                        System.out.println("Enter the index to access:");
                        int index = sc.nextInt();

                      
                        System.out.println("Array element: " + array[index]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        
                        System.out.println("Caught an exception: Invalid array index.");
                    } finally {
                        System.out.println("Array access operation ended.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please choose 1 or 2.");
                    break;
            }

            
            System.out.println("Do you want to continue? (y/n)");
            continueFlag = sc.next().charAt(0);

        } while (continueFlag == 'y' || continueFlag == 'Y');

        System.out.println("Program has ended.");
        sc.close();
    }
}
