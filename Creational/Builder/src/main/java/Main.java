public class Main
{
    public static void main(String[] args)
    {
        ServerConfig serverConfig =
          new ServerConfig.Builder("Host 1 " , 1337)
            .maxConnections(20)
            .ssl(true)
            .timeout(30)
            .build();

        ApiClient client = new ApiClient.Builder("Key 1" , "URL")
          .maxRetries(20)
          .userAgent("Agent 1")
          .build();
    }
}
