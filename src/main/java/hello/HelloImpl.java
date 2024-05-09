package hello;

import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

public class HelloImpl implements Hello {

    private final RestClient restClient;

    public HelloImpl() {
        restClient = RestClient
                .builder()
                .baseUrl("http://localhost:8080/api")
                .build();
    }

    public String getHello() {
        return restClient
                .get()
                .uri("/hello")
                .retrieve()
                .body(String.class);
    }

    public Map<?, ?> postHello(final Map<String, String> map) {
        return restClient
                .post()
                .uri("/hello")
                .contentType(MediaType.APPLICATION_JSON)
                .body(map)
                .retrieve()
                .body(Map.class);
    }
}
