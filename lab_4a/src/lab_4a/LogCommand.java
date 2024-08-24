package lab_4a;

public class LogCommand implements Command {
    private LogHandler handler;
    
    public LogCommand(LogHandler handler) {
        this.handler = handler;
    }
    
    @Override
    public void execute(String message) {
        if (handler != null) {
            handler.handleRequest(message);
        }
    }
}
