package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###, ##0.00");
    // Customer ID to pin number mapping
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() throws IOException{

    }
    public void getAccountType(){
        System.out.println("Select the account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Savings Account");
        System.out.println("EXIT 3 - Quit");

        int selection = menuInput.nextInt();

        switch(selection){
            case 1: 
                getChecking();
                break;
            case 2: 
                getSavings();
                break;
            case 3:
                System.out.println("Thank you for using ATM, Goodbye! \n");
                break;
            default:
                System.out.println("\nInvalid choice...Try again");
        }
    }

    public void getChecking(){
        System.out.println("Checking Account:");
        System.out.println("Option 1 - View balance");
        System.out.println("Option 2 - Withdraw Funds");
        System.out.println("Option 3 - Deposit Funds");
        System.out.println("Option 4 - Exit");
        System.out.println("\n");
    }

}
