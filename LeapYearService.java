import java.util.InputMismatchException;
import java.util.Scanner;

// OOP Class for Leap Year logic
class LeapYearService {

    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}

// Main class
public class LeapYearCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LeapYearService service = new LeapYearService();

        boolean continueChecking = true;

        System.out.println("📅 Leap Year Checker");

        while (continueChecking) {
            try {
                System.out.print("\nEnter a year: ");
                int year = sc.nextInt();

                if (year <= 0) {
                    throw new IllegalArgumentException("Year must be positive.");
                }

                if (service.isLeapYear(year)) {
                    System.out.println(year + " is a Leap Year ✅");
                } else {
                    System.out.println(year + " is NOT a Leap Year ❌");
                }

                System.out.print("\nDo you want to check another year? (y/n): ");
                char choice = sc.next().toLowerCase().charAt(0);

                if (choice != 'y') {
                    continueChecking = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a valid number.");
                sc.next(); // clear invalid input
            } catch (IllegalArgumentException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }

        System.out.println("\nThank you for using Leap Year Checker 😊");
        sc.close();
    }
}
