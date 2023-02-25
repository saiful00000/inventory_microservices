package shaiful.io.master.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean("catalogClient")
    public WebClient catalogClient(){
        return  WebClient.builder().baseUrl("http://localhost:8081").build();
    }

    @Bean("detailsClient")
    public WebClient detailsClient(){
        return  WebClient.builder().baseUrl("http://localhost:8082").build();
    }
}
