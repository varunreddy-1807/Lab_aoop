package lab_4a;

public class InfoHandler extends LogHandler {
    
    public InfoHandler() {
        super(LogLevel.INFO);
    }

    @Override
    public void handleRequest(String message) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        }
        super.handleRequest(message);
    }
}
