import bank.operations.createAccount;
import bank.operations.options;
import bank.operations.withdraw;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;

        options options = new options();

        do {
            System.out.println("Please choose an option: ");
            options.choices();
            choose = scanner.nextInt();

            switch(choose){
                case 1:
                createAccount account = new createAccount();
                account.saveAccountDetails();
                break;

                case 2:
                withdraw withdraw = new withdraw();
                break;

                case 3:
                System.out.println("Exit");
                break;

                default:
                System.out.println("Invalid choice, please try again");

            }    
        } while (choose !=3 );
        scanner.close();
    }
}