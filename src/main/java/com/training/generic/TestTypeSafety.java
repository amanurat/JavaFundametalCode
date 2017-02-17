package com.training.generic;

import java.util.ArrayList;
import java.util.List;

public class TestTypeSafety {
    public static void main(String[] args) {

        List<CheckAccount> checkAccounts = new ArrayList<CheckAccount>();
        checkAccounts.add(new CheckAccount("Fred")); // OK
//        checkAccounts.add(new SavingAccount("Fred")); // Compile Error!
    }
}

class Account {

}

class SavingAccount extends Account {

    public SavingAccount(String free) { }
}

class CheckAccount extends Account {

    private final String free;

    public CheckAccount(String free) {

        this.free = free;
    }
}
