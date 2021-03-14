import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Are you a User or an Admin?\n");
        String user = input.nextLine();
        if(user.contentEquals("User")) {
            System.out.println("What would you like to do?");
            System.out.println("1. Search\n2. Checkout\n3. Return\n4. Check Balance, Pay Balance and late fees\n5. Log Out\n");
            int userInput = input.nextInt();
            if(userInput == 1){
                System.out.println("Enter your Book Title: ");
            } else if (userInput == 2) {
                System.out.println("Checkout goes here!");
            } else if (userInput == 3) {
                System.out.println("Return goes here!");
            } else if (userInput == 4) {
                System.out.println("Check balance, pay balance and late fees goes here!");
            } else {
                System.out.println("Command not recognised");
            }
        } else if (user.contentEquals("Admin")) {
            int userInput = input.nextInt();
            if(userInput == 1){
                System.out.println("Locate Title here! ");
            } else if (userInput == 2) {
                System.out.println("Update inventory (add/delete/update titles)");
            } else if (userInput == 3) {
                System.out.println("Check user balance and apply late fees");
            } else if (userInput == 4) {
                System.out.println("Generate Reports");
            } else {
                System.out.println("Command not recognised");
            }
        }
        input.close();
    }
}

