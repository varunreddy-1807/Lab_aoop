package com.financialtransactionsystem;

public class Clerk implements AuthorizationHandler {
    private AuthorizationHandler nextHandler;

    @Override
    public boolean approve(Transaction transaction) {
        return transaction.getAmount() <= 1000;
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Transaction transaction) {
        if (approve(transaction)) {
            System.out.println("Clerk approved transaction: " + transaction.getTransactionType() + " of " + transaction.getAmount());
        } else if (nextHandler != null) {
            nextHandler.handle(transaction);
        } else {
            System.out.println("Transaction not approved");
        }
    }
}

 class Manager implements AuthorizationHandler {
    private AuthorizationHandler nextHandler;

    @Override
    public boolean approve(Transaction transaction) {
        return transaction.getAmount() <= 5000;
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Transaction transaction) {
        if (approve(transaction)) {
            System.out.println("Manager approved transaction: " + transaction.getTransactionType() + " of " + transaction.getAmount());
        } else if (nextHandler != null) {
            nextHandler.handle(transaction);
        } else {
            System.out.println("Transaction not approved");
        }
    }
}

 class Director implements AuthorizationHandler {
    @Override
    public boolean approve(Transaction transaction) {
        return transaction.getAmount() > 5000;
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler) {
       
    }

    @Override
    public void handle(Transaction transaction) {
        if (approve(transaction)) {
            System.out.println("Director approved transaction: " + transaction.getTransactionType() + " of " + transaction.getAmount());
        } else {
            System.out.println("Transaction not approved");
        }
    }
}

