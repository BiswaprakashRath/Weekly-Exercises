// SingletonPatternExample.java

public class SingletonPatternExample {

    // Logger class using Singleton pattern
    static class Logger {
        // holds the single instance
        private static Logger instance;

        // private constructor to stop external creation
        private Logger() { }

        // returns the only instance of Logger
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        // basic log method
        public void log(String message) {
            System.out.println("LOG: " + message);
        }
    }

    // Main method to test the Logger
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("App started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Doing some work...");

        // check if both logger1 and logger2 point to the same object
        if (logger1 == logger2) {
            System.out.println("Only one instance exists. Singleton works.");
        } else {
            System.out.println("Different instances found. Singleton failed.");
        }
    }
}
