import java.util.Scanner;
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}


public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueChoice;
        
        do {
            System.out.println("Eligibility Test for Election Voting");
            
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            
            
            try {
                checkAge(age); 
                System.out.println("Age is valid: " + age);
            } catch (AgeException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {

                System.out.println("I am finally block ... I am always here...");
            }
            

            System.out.print("Do you want to continue? Type Y or N: ");
            continueChoice = sc.next();
        } while (continueChoice.equalsIgnoreCase("Y"));
        
        sc.close();
    }

    // Step 7: Method to check age validity
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be at least 18 years old.");
        }
    }
}

