public class BankSystem
{
    private String ownerName;
    private double balance;

    public BankSystem(String ownerName, double balance)
    {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void setDeposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.print(amount + " deposited successfully!");
        }
        else
        {
            System.out.print("Deposit amount must be positive!");
        }
    }

    public void setWithDraw(double amount)
    {
        if(balance < 0)
        {
            System.out.print("Insufficient balance!");
        }

        else if (balance - amount < 0)
        {
            System.out.print("Insufficient balance!");
        }

        else
        {
            balance -= amount;
            System.out.print(amount + " withdraw successfully!");
        }
    }

    void displayBalance()
    {
        System.out.print("Name: " + ownerName + "\nBalance: " + balance);
    }
}
