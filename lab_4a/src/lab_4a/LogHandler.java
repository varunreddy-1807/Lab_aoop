package lab_4a;

public abstract class LogHandler {
    protected LogHandler nextHandler;
    protected LogLevel level;

    public LogHandler(LogLevel level) {
        this.level = level;
    }

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String message) {
        if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }
}

