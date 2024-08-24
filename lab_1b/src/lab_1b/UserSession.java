package lab_1b;

public class UserSession {

 private static UserSession instance;

 private boolean loggedIn;


 private UserSession() {
     this.loggedIn = false;
 }

 public static synchronized UserSession getInstance() {
     if (instance == null) {
         instance = new UserSession();
     }
     return instance;
 }

 public void login() {
     this.loggedIn = true;
     System.out.println("User logged in.");
 }

 public void logout() {
     this.loggedIn = false;
     System.out.println("User logged out.");
 }

 public boolean isLoggedIn() {
     return loggedIn;
 }
}
