package lab_logger;


	public class main {

	    public static void main(String[] args) {
	        Logger logger = Logger.getInstance();
	        
	        logger.log("Application started");
	        
	        doWork();
	        
	        logger.log("Application ended");
	    }
	    
	    private static void doWork() {
	        Logger logger = Logger.getInstance();
	        logger.log("Doing some work...");
	        
	    }
	}


