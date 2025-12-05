package vecka49.Singleton;

public class Main {

    static void main(String[] args) {
        // skapar logger för user inloggning
        // Logger loginLogger = new Logger();
        Logger loginLogger = Logger.getInstance();
        // logger för betalningar
       // Logger paymentLogger = new Logger();
        Logger paymentLogger = Logger.getInstance();

        loginLogger.log("Användaren loggade in");
        paymentLogger.log("Betalning genomförd");

        System.out.println(loginLogger == paymentLogger);
    }
}
