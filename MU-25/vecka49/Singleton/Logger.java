package vecka49.Singleton;

public class Logger {
    private static Logger instance; // Statisk variabel
    private String fileName;

    private Logger() {
        this.fileName = "system_log.txt";
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("Skriver till " + fileName + ": " + msg);
    }
}
