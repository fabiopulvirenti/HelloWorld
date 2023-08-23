import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        String[] usernames= {"Fabio", "admin", "user1", "user2", "user3"};
        String[] passwords = {"password", "pass123", "abc123", "123abc", "Password"};

        Scanner reader = new Scanner(System.in);

        boolean foundUsername = false;
        while (foundUsername == false) {
            System.out.print("Enter Username: ");
            String enteredUsername = reader.nextLine();

            for (int i = 0; i < usernames.length && foundUsername == false; i++) {
                if (usernames[i].equalsIgnoreCase(enteredUsername)) {
                    foundUsername = true;
                }
            }
        }

        boolean foundPassword = false;
        for(int counter = 0 ; counter < 3 && foundPassword == false; counter++) {
            System.out.print("Enter Password: ");
            String enteredPassword = reader.nextLine();

            for (int i = 0; i < passwords.length && foundPassword == false; i++) {
                if (passwords[i].equals(enteredPassword)) {
                    foundPassword = true;
                }
            }
        }

        if (foundPassword == true) {
            System.out.println("Welcome!!!");
        } else {
            System.out.println("Access Denied.");
        }



    }
}