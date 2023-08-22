import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Password";

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = reader.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = reader.nextLine();
//
        if (username.equals(enteredUsername) && (password.equals(enteredPassword))) {
            System.out.println("Welcome...");
        } else {
            System.out.println("Access Denied");
        }
    }
}