package lab_4a;

public class Client {
    public static void main(String[] args) {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();
        
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);
        
        Command infoCommand = new LogCommand(infoHandler);
        Command debugCommand = new LogCommand(debugHandler);
        Command errorCommand = new LogCommand(errorHandler);
        
        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);
        
        System.out.println("Logging INFO message:");
        logger.executeCommands("System started successfully.");
        
        System.out.println("\nLogging DEBUG message:");
        logger.executeCommands("Debugging issue with user login.");
        
        System.out.println("\nLogging ERROR message:");
        logger.executeCommands("Failed to connect to the database.");
    }
}

