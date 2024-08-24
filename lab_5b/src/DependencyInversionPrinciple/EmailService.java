package DependencyInversionPrinciple;

public class EmailService implements MessageService {
  
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email with message: " + message);
    }
}
