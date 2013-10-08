package com.in6k.paysys;

import java.sql.*;
import java.util.Date;

public class Transaction {
    private String debetAccount;
    private String creditAccount;
    private int amount;

    public Transaction(String sender, String receiver, int amount) {
        this.debetAccount = receiver;
        this.creditAccount = sender;
        this.amount = amount;
    }

    public String getDebetAccount() {
        return debetAccount;
    }

    public String getCreditAccount() {
        return creditAccount;
    }

    public int getAmount() {
        return amount;
    }

}
