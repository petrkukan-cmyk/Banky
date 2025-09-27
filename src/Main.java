public class Main {


    public static void main(String[] args) {


        Bank CSOB = new Bank("169", "CSOB");




        Human client = new Human("Honimir", "Novak", 9999);




        BankAccount firstAccount = new BankAccount(client, 1, 100000000, CSOB);




        System.out.println(CSOB.countCustomers());




        System.out.println(CSOB.aggregateBalance());




        System.out.println(firstAccount.hasOverdraft());




    }


}
