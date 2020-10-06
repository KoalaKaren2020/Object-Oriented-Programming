public class Account {
    private int balance;
    //constructer
    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount){
        if(amount <=0)
            System.out.println("Amount must be greater than 0!");
        else if (amount > balance)
            System.out.println("Amount must be smaller than balance!");
        else
        balance -= amount;
    }

    public void deposit(int amount){
        if(amount <=0)
            System.out.println("Must deposit a positive amount!");
        else
            balance += amount;
    }
}
