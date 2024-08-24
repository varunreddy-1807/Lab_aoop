package lab_1b;

public class BankAccount {

 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public void viewBalance() {
     UserSession session = UserSession.getInstance();
     if (session.isLoggedIn()) {
         System.out.println("Current balance: $" + balance);
     } else {
         System.out.println("Please log in to view balance.");
     }
 }

 public void deposit(double amount) {
     UserSession session = UserSession.getInstance();
     if (session.isLoggedIn()) {
         if (amount > 0) {
             balance += amount;
             System.out.println("Deposited $" + amount + ". New balance: $" + balance);
         } else {
             System.out.println("Invalid deposit amount.");
         }
     } else {
         System.out.println("Please log in to deposit money.");
     }
 }

 public void withdraw(double amount) {
     UserSession session = UserSession.getInstance();
     if (session.isLoggedIn()) {
         if (amount > 0 && amount <= balance) {
             balance -= amount;
             System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
         } else {
             System.out.println("Invalid withdrawal amount or insufficient funds.");
         }
     } else {
         System.out.println("Please log in to withdraw money.");
     }
 }
}
