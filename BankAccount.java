class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccountsCreated = 0;
    private static double totalAmount = 0;

    public BankAccount(){
        numberOfAccountsCreated++;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public static int getnumberOfAccountsCreated(){
        return numberOfAccountsCreated;
    }

    public static double getTotalAmount(){
        return totalAmount;
    }

    public void depositFunds(String account,double amount){
        if (account.equals("checkingAcct")){
            checkingBalance += amount;
        }else if (account.equals("savingsAcct")){
            savingsBalance += amount;
        }
        totalAmount +=amount;
    }

    public void withdrawFunds(String account, double amount)
    {
        if (account.equals("checkingAcct") && checkingBalance >= amount)
        {
            checkingBalance -= amount;
        } else if (account.equals("savingsAcct") && savingsBalance >= amount)
        {
            savingsBalance -= amount;
        } else {
            System.out.println("Sorry, you have insufficient funds.");
        }
        totalAmount -= amount;
    }

    public void displayTotalBalance(){
        System.out.println("Checking Account Balance: " + checkingBalance + "Savings Account Balance: " + savingsBalance);
    }
}