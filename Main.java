import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int n, String name, double b) {
        accountNumber = n;
        accountHolderName = name;
        balance = b;
    }

    void deposit(double a) {
        balance += a;
    }

    void withdraw(double a) {
        if (a <= balance)
            balance -= a;
        else
            System.out.println("Insufficient Balance");
    }

    double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int n = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter balance: ");
        double b = sc.nextDouble();

        BankAccount a = new BankAccount(n, name, b);

        System.out.print("Enter deposit: ");
        a.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal: ");
        a.withdraw(sc.nextDouble());

        a.displayAccount();
    }
}