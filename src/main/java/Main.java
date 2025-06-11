import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Plane Management application");

        System.out.println("*".repeat(49));
        System.out.println("*                  MAIN OPTIONS                 *");
        System.out.println("*".repeat(49));
        System.out.println("     1. Buy a seat");
        System.out.println("     2. Cancel a seat");
        System.out.println("     3. Find first available seat");
        System.out.println("     4. Show seating plan");
        System.out.println("     5. Print tickets information and total sales");
        System.out.println("     6. Search ticket");
        System.out.println("     7. Quit");
        System.out.println("*".repeat(49));


        Scanner input = new Scanner(System.in);
        System.out.print("Please select an option: ");
        int option = input.nextInt();

    }
}
