package com.financialtransactionsystem;

public interface AuthorizationHandler {
    boolean approve(Transaction transaction);
    void setNextHandler(AuthorizationHandler nextHandler);
    void handle(Transaction transaction);
}
