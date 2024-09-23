package AccountManagement;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread user1 = new Thread(new User(account, true, 200));
        Thread user2 = new Thread(new User(account, false, 300));
        Thread user3 = new Thread(new User(account, true, 150)); 
        Thread user4 = new Thread(new User(account, false, 500));

        user1.start();
        user2.start();
        user3.start();
        user4.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        System.out.println("Final Balance: " + account.getBalance());
    }
}
