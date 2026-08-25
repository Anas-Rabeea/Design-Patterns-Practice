
public final class Configuration
{
    // EAGER INITIALIZATION - The instance is created whether it is used or not
    private static final volatile INSTANCE = new Configuration();
    private Configuration()
    {
        System.out.println("Loading A Single Configuraion Logic For The Whole App");
    }
    public static Configuration getInstance()
    {
        return INSTANCE;
    }

    public void print(String text)
    {
        System.out.println();
    }
}