import java.util.Scanner;
import java.util.ArrayList;
public class main
{
    public static void main(String[] args)
    {
        ArrayList<BankSystem> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String accountName;
        double initialBalance;
        int inp;

        while(true)
        {
            System.out.print(
                    "--Please select the operation you want to perform--\n" +
                    "1)Create account" +
                    "2)Deposit money\n" +
                    "3)Withdraw money\n" +
                    "4)View balance\n" +
                    "5)Exit\n" +
                    "---------------------------------------------------\n" + "Answer: ");
            inp = scanner.nextInt();
            switch (inp) {
                case 1: System.out.print("Enter owner's name: ");
                        accountName = scanner.nextLine();
                        System.out.print("Enter initial balance: ");
                        initialBalance = scanner.nextDouble();
                        accounts.add(new BankSystem(accountName,initialBalance));

                case 2:
                case 3:
                case 4:
                case 5: System.exit(0);
                default:
                    System.out.println("Invalid Operation!");
            }
        }
    }
}
