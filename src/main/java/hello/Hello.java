package hello;

import org.springframework.web.client.RestClient;

public class Hello {
    public String sayHello(){
        RestClient restClient = RestClient.create();
        String result = restClient.get()
                .uri("https://example.com")
                .retrieve()
                .body(String.class);

        System.out.println(result);
    }
}
