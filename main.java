import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        ArrayList<BankSystem> accounts = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String accountName;
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
            inp = input.nextInt();
            switch (inp) {
                case 1: System.out.print("Please enter the account name: ");
                        accountName = input.NextString();
                case 2: b1.setDeposit(1000); break;
                case 3: b1.setWithDraw(2000); break;
                case 4: b1.displayBalance(); break;
                case 5: System.exit(0);
                default:
                    System.out.println("Invalid Operation!");
            }
        }
    }
}
