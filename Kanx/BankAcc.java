public class BankAcc
{
    double minimum_balance, balance;
    
    BankAcc(int balance)
    {
        this.minimum_balance = 5000.0;
        this.balance = balance;
    }

    void withdrawl(double amount)
    {
        try
        {
            if(amount > this.balance)
            {
                throw new LessBalanceException("Withdrawl amount is more than balance!");
            }
            else
            {
                this.balance -= amount;
                System.out.println("Transaction Complete");
            }
        }
        catch(LessBalanceException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        BankAcc acc1 = new BankAcc(10000);
        BankAcc acc2 = new BankAcc(50000);
        acc1.withdrawl(11000);
        acc2.withdrawl(60000);
    }
}

class LessBalanceException extends Exception
{
    LessBalanceException(String s)
    {
        super(s);
    }
}
