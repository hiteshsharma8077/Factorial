import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = obj.nextInt();
        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long fac = 1; // Use long to avoid overflow for larger numbers
            for (int i = 1; i <= n; i++) {
                fac *= i;
            }
            System.out.println("Factorial is " + fac);
        }
        obj.close(); // Close the Scanner object
    }
}
