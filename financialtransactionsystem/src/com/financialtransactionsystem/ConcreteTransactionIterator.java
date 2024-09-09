package com.financialtransactionsystem;

import java.util.List;
import java.util.NoSuchElementException;

public class ConcreteTransactionIterator implements TransactionIterator {
    private List<Transaction> transactions;
    private int index;

    public ConcreteTransactionIterator(List<Transaction> transactions) {
        this.transactions = transactions;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < transactions.size();
    }

    @Override
    public Transaction next() {
        if (hasNext()) {
            return transactions.get(index++);
        } else {
            throw new NoSuchElementException();
        }
    }
}
