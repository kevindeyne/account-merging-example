package com.ryan;

import java.math.BigDecimal;
import java.util.*;

public class Calculation {


    private final Map<Integer, Account> accountMap = new HashMap<>();
    private final Map<Integer, Set<BigDecimal>> accountBalancesUsedPerAccount = new HashMap<>();

    public Collection<Account> mergeAccounts(List<Account> accountsToMerge) {

        for(Account accountToMerge : accountsToMerge) {
            final int id = accountToMerge.getId();
            Account existingAccount = accountMap.get(id);

            if(existingAccount == null) {
                //this means this id has not yet occurred, so place just store the value we have
                accountMap.put(id, accountToMerge);

                //we also store our account balance in a list per id, so we can compare if it has been used before
                Set<BigDecimal> initialBalanceUsed = new HashSet<>();
                initialBalanceUsed.add(accountToMerge.getAccountBalance());
                accountBalancesUsedPerAccount.put(id, initialBalanceUsed);
            } else {
                //so an account exists, so we need to merge - but do we know if the money value is used already?
                Set<BigDecimal> accountBalancesAlreadyUsed = accountBalancesUsedPerAccount.get(id);

                if(!accountBalancesAlreadyUsed.contains(accountToMerge.getAccountBalance())) {
                    //not yet used, so we remember we use it + merge the value
                    existingAccount.setAccountBalance(existingAccount.getAccountBalance().add(accountToMerge.getAccountBalance()));
                } else {
                    //no work here, we already used it - so we'll ignore merging it!
                }

                accountMap.put(id, existingAccount);
            }
        }

        return accountMap.values();
    }
}
