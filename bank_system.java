public class bank_system
{
    private String ownerName;
    private double balance;

    public bank_system(String ownerName, double balance)
    {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void setDeposit(double amount)
    {
        System.out.println();
        balance += amount;
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
        }
    }

    void displayBalance()
    {
        System.out.print("Name: " + ownerName + "\nBalance: " + balance);
    }
}
