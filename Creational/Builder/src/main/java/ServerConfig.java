public final class ServerConfig
{
    private final String host;
    private final int port;
    private final int timeout;
    private final boolean ssl;
    private final int maxConnections;

    // private constructor to force using the Builder
    // control the construction  to use Builder
    private ServerConfig(Builder builder)
    {
        this.host = builder.host;
        this.port = builder.port;
        this.timeout = builder.timeout;
        this.ssl = builder.ssl;
        this.maxConnections = builder.maxConnections;
    }

    public static class Builder
    {
        // Mandatory / Forcing Values
        // Required fields in the Builder constructor
        private final String host;
        private final int port;

        // default values
        private  int timeout = 5000;
        private  boolean ssl = true;
        private  int maxConnections = 50;


        public Builder(String host, int port)
        {
            this.host = host;
            this.port = port;
        }

        public Builder timeout(int timeout)
        {
//            if (timeout <= 0) {
//                throw new IllegalArgumentException(
//                  "Timeout must be positive"
//                );
//            }
            this.timeout = timeout;
            // to enable method chaining
            return this;
        }

        public Builder ssl(boolean ssl)
        {
            this.ssl = ssl;
            return this;
        }
        public Builder maxConnections(int maxConnections)
        {
//            if (maxConnections <= 0) {
//                throw new IllegalArgumentException(
//                  "Max connections must be positive"
//                );
//            }
            this.maxConnections = maxConnections;
            return this;
        }


        public ServerConfig build()
        {
            // validations , can also be put in each method
            if (maxConnections <= 0) {
                throw new IllegalArgumentException(
                  "Max connections must be positive"
                );
            }
            if (timeout <= 0) {
                throw new IllegalArgumentException(
                  "Timeout must be positive"
                );
            }




            // Builder Object will return with the provided values to construct the parent Object
            // the resulted Object is immutable
            return new ServerConfig(this);
        }
    }
}
