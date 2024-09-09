package com.financialtransactionsystem;

import java.util.ArrayList;
import java.util.List;

public class TransactionCollection {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public TransactionIterator getIterator() {
        return new ConcreteTransactionIterator(transactions);
    }
}
