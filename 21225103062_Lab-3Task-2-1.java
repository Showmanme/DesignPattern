class Logger {
    private static Logger instance;
    private Logger() { }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
class Authentication {
    public void doLogin() {
        Logger logger = Logger.getInstance();
        logger.log("Authentication: User logged in");
    }
}
class DataAccess {
    public void fetchData() {
        Logger logger = Logger.getInstance();
        logger.log("DataAccess: Data fetched from database");
    }
}
class UI {
    public void render() {
        Logger logger = Logger.getInstance();
        logger.log("UI: Screen rendered");
    }
}
