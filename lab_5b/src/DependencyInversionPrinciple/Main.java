package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        MyApplication appWithEmail = new MyApplication(emailService);
        MyApplication appWithSMS = new MyApplication(smsService);

        appWithEmail.processMessage("Hello via Email!");
        appWithSMS.processMessage("Hello via SMS!");
    }
}

