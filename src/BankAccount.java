public class BankAccount {


    private final int number;


    private int balance;


    private final Bank bank;


    private final Human owner;





    public BankAccount(Human owner, int number, int initialBalance, Bank bank) {


        this.owner = owner;


        this.number = number;


        this.balance = initialBalance;


        this.bank = bank;


        linkToBank();


    }





    private void linkToBank() {


        bank.registerAccount(number, owner, balance);


    }





    public boolean hasOverdraft() {


        return balance < 0;


    }





}
