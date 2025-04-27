import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        bank_system b1 = new bank_system("ownerName", 0);
        Scanner input = new Scanner(System.in);
        int inp;

        while(true)
        {
            System.out.print("--Please select the operation you want to perform--\n" +
                    "1)Deposit money\n" +
                    "2)Withdraw money\n" +
                    "3)View balance\n" +
                    "4)Exit\n" +
                    "---------------------------------------------------\n" + "Answer: ");
            inp = input.nextInt();
            switch (inp) {
                case 1: b1.setDeposit(1000); break;
                case 2: b1.setWithDraw(2000); break;
                case 3: b1.displayBalance(); break;
                case 4: System.exit(0);
                default:
                    System.out.println("Invalid Operation!");
            }
        }
    }
}
