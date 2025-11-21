class Logger{
    private static Logger instance;

    private Logger()
    {
        System.out.println("Successfully Logged in");
    }
    public static Logger getInstance()
    {
        if(instance == null)
        {
            instance = new Logger();
        }
        return instance;
    }
    public void Printer(String message)
    {
        System.out.println("Log:"+message);
    }
    
}
class Authentication
{
    void loggedIn()
    {
        Logger log = Logger.getInstance();
        log.Printer("Successfully Logged in, Thank you");
    }
}
class Data_Access
{
    void database_access()
    {
    Logger log = Logger.getInstance();
    log.Printer("Successfully Connected with the database");
    }
}

class UI
{
    void UI_opener()
    {
        Logger log = Logger.getInstance();
        log.Printer("Initial UI activated");
    }
}
class Singleton_Pattern
{
    public static void main(String[] args) {
       Authentication auth = new Authentication();
       auth.loggedIn();
       Data_Access db = new Data_Access();
       db.database_access();
       UI ui = new UI();
       ui.UI_opener();

    }
}
