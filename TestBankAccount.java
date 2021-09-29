public class TestBankAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.depositFunds("checkingAcct", 15666.99);
        account1.depositFunds("savingsAcct", 35000.35);
        account1.withdrawFunds("checkingAcct", 210);

        System.out.println("Here is your total balance:");
        System.out.println("$" + BankAccount.getTotalAmount());
    }
}