package lab_1b;

public class BankingApp {

 public static void main(String[] args) {
     UserSession session = UserSession.getInstance();
     
     BankAccount account = new BankAccount(1000.00);
     
     account.viewBalance();
     
     session.login();
     
     account.viewBalance();
     account.deposit(500.00);
     account.withdraw(200.00);
     
     session.logout();
     
     account.viewBalance();
     account.deposit(100.00);
     account.withdraw(50.00);
 }
}
