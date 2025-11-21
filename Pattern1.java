class Logger
{
    private static Logger instance; 
    private Logger()
    {
        System.out.println("This is the private constructr");
    }
    public static Logger getInstance()
    {
        if(instance == null)
        {
            instance = new Logger();
        }
        return instance;
    }
    public void printer(String message)
    {
        System.out.println("Log: "+message);
    }
}
class Authentication
{
    void Auth_Printer()
    {
        Logger log = Logger.getInstance();
        log.printer("Login Successful");
        
    }
}
class Data_Access
{
    void Data_access_printer()
    {
        Logger log = Logger.getInstance();
        log.printer("Connection Successful");
    }
}

public class Pattern1 {
    public static void main(String[] args) {
        Authentication obj_Auth = new Authentication();
        obj_Auth.Auth_Printer();
        Data_Access obj_Data = new Data_Access();
        obj_Data.Data_access_printer();
    }
    


    
}