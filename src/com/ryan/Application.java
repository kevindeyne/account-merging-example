package com.ryan;

import java.math.BigDecimal;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        //some data to setup
        Account account1 = new Account(1, "John Doe", "Halifax", BigDecimal.valueOf(1000));
        Account account2 = new Account(1, "John William Doe", "HLIFX, CA", BigDecimal.valueOf(1000));
        Account account3 = new Account(1, "John W. Doe", "HLIFX", BigDecimal.valueOf(0.89));

        Account account4 = new Account(2, "Rebecca Almaci", "Toronto", BigDecimal.valueOf(2345));
        Account account5 = new Account(2, "Rebecca A", "TR, CA", BigDecimal.valueOf(1));

        Account account6 = new Account(3, "Kevin Deyne", "Lake Forest, US", BigDecimal.valueOf(123));

        //add this data to a list (not part of solution)
        List<Account> accounts = Arrays.asList(account1, account2, account3, account4, account5, account6);
        Collections.shuffle(accounts); //can't know for sure if the data is in the above order, so randomize it (not part of solution)

        //solution
        Collection<Account> mergedAccounts = new Calculation().mergeAccounts(accounts);

        //result
        for(Account mergedAccount : mergedAccounts) {
            System.out.println(mergedAccount);
        }
    }

}
