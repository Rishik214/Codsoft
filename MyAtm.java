import java.util.Scanner;

public class MyAtm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000, deposit = 0, withdrawal = 0;

        System.out.println("Welcome to our ATM");
        while (true) {
            System.err.println("Choose 1 to check your Balance");
            System.out.println("Choose 2 to deposit your amount");
            System.out.println("Choose 3 to withdraw money");
            System.out.println("Choose 4 to Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The available Balance is : " + balance);
                    break;

                case 2:
                    System.out.println("Enter the amount to be deposited : " + deposit);
                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("The required Balance is " + balance);
                    break;

                case 3:
                    System.out.println("Enter the amount you want to withdraw : " + withdrawal);
                    withdrawal = sc.nextInt();

                    if (balance >= withdrawal) {
                        balance = balance - withdrawal;
                        System.out.println("The available balance is " + balance);
                    } else {
                        System.out.println("Insufficient funds");
                    }

                case 4:
                    // System.out.println("Thank You for visiting our ATM");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid");
                    break;

            }
        }

    }
}
