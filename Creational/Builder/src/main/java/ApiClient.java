import java.time.Duration;
import java.util.Map;

public final class ApiClient
{
    // required
    private final String baseUrl;
    private final String apiKey;

    // optional
    private final Duration timeout;
    private final int maxRetries;
    private final boolean followRedirects;
    private final String userAgent;
    private final Map<String, String> headers;

    private ApiClient(Builder builder)
    {
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.timeout = builder.timeout;
        this.maxRetries = builder.maxRetries;
        this.followRedirects = builder.followRedirects;
        this.userAgent = builder.userAgent;
        this.headers = builder.headers;
    }

    public static class Builder
    {

        // required
        private final String baseUrl;
        private final String apiKey;
        // optional
        private Duration timeout;
        private int maxRetries;
        private boolean followRedirects;
        private String userAgent;
        private Map<String, String> headers;

        public Builder(String apiKey, String baseUrl)
        {
            this.apiKey = apiKey;
            this.baseUrl = baseUrl;
        }

        public Builder timeout(Duration timeout)
        {
            this.timeout = timeout;
            return this;
        }

        public Builder maxRetries(int maxRetries)
        {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder followRedirects(boolean followRedirects)
        {
            this.followRedirects = followRedirects;
            return this;
        }

        public Builder userAgent(String userAgent)
        {
            this.userAgent = userAgent;
            return this;
        }

        public Builder headers(Map<String, String> headers)
        {
            this.headers = headers;
            return this;
        }

        public ApiClient build()
        {
            return new ApiClient(this);
        }
    }
}