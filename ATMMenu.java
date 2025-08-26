import java.util.Scanner;

class Atm {
    float balance;
    final int PIN = 4567;

    // Check PIN
    public void checkpin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Invalid PIN! Please try again.");
        }
    }

    // Menu
    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int opt = sc.nextInt();

            if (opt == 1) {
                checkbalance();
            } else if (opt == 2) {
                withdrawmoney();
            } else if (opt == 3) {
                depositmoney();
            } else if (opt == 4) {  
                System.out.println("Thank you for using the ATM. Goodbye!");
                return;  
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Check Balance
    public void checkbalance() {
        System.out.println("Your balance is: " + balance);
    }

    // Withdraw Money
    public void withdrawmoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Money withdrawn successfully. Remaining balance: " + balance);
        }
    }

    // Deposit Money
    public void depositmoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        float amount = sc.nextFloat();

        balance += amount;
        System.out.println("Money deposited successfully. Total balance: " + balance);
    }
}

public class ATMMenu {
    public static void main(String[] args) {
        Atm db = new Atm();
        db.checkpin();
    }
}
