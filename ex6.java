import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();  // May throw InputMismatchException if a non-integer is entered
            System.out.println("You entered: " + num);

            // Simulating division by zero exception
            int result = 100 / num;
            System.out.println("100 divided by " + num + " is: " + result);
        } 
        catch (ArithmeticException e) {  // Handling division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (Exception e) {  // Catching other exceptions
            System.out.println("Invalid input! Please enter a valid number.");
        } 
        finally {
            scanner.close();  // Ensuring resource cleanup
            System.out.println("Execution completed.");
        }
    }
}
