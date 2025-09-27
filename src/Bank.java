import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Bank {


    public String code;


    private String title;


    private List<Integer> accountIds = new ArrayList<>();


    private List<Human> accountHolders = new ArrayList<>();


    private List<Integer> accountBalances = new ArrayList<>();





    public Bank(String code, String title) {


        this.code = Objects.requireNonNull(code);


        this.title = title;


    }





    public void registerAccount(int accountId, Human holder, int initialBalance) {


        accountIds.add(accountId);


        accountHolders.add(holder);


        accountBalances.add(initialBalance);


    }





    public int countCustomers() {


        return accountHolders.size();


    }





    public int aggregateBalance() {


        int total = 0;


        for (int i = 0; i < accountBalances.size(); i++) {


            total += accountBalances.get(i);


        }


        return total;


    }





}
