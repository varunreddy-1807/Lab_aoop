package lab_4a;

public class DebugHandler extends LogHandler {
    
    public DebugHandler() {
        super(LogLevel.DEBUG);
    }

    @Override
    public void handleRequest(String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        }
        super.handleRequest(message);
    }
}
