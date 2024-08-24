package lab_4a;

public class ErrorHandler extends LogHandler {
    
    public ErrorHandler() {
        super(LogLevel.ERROR);
    }

    @Override
    public void handleRequest(String message) {
        if (level == LogLevel.ERROR) {
            System.err.println("ERROR: " + message);
        }
        super.handleRequest(message);
    }
}

