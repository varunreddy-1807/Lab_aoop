package com.financialtransactionsystem;

public class FinancialTransactionSystem {
    public static void main(String[] args) {
        
        Director director = new Director();
        Manager manager = new Manager();
        Clerk clerk = new Clerk();
        
        clerk.setNextHandler(manager);
        manager.setNextHandler(director);

      
        Transaction txn1 = new Transaction("Deposit", 500);
        Transaction txn2 = new Transaction("Withdrawal", 2000);
        Transaction txn3 = new Transaction("Transfer", 6000);

       
        TransactionCollection collection = new TransactionCollection();
        collection.addTransaction(txn1);
        collection.addTransaction(txn2);
        collection.addTransaction(txn3);

        TransactionIterator iterator = collection.getIterator();

        
        while (iterator.hasNext()) {
            Transaction transaction = iterator.next();
            clerk.handle(transaction);
        }

    
        Account account = new Account(1000);
        Command depositCommand = new DepositCommand(account, 500);
        Command withdrawCommand = new WithdrawCommand(account, 200);

     
        TransactionInvoker invoker = new TransactionInvoker();

        invoker.setCommand(depositCommand);
        invoker.executeCommand();

        invoker.setCommand(withdrawCommand);
        invoker.executeCommand();
    }
}
