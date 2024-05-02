package hello;

import org.springframework.web.client.RestClient;

import java.util.ArrayList;

public class HelloImpl implements Hello{
    public String getHello(){
        return RestClient.create().get()
                .uri("http://localhost:8080")
                .retrieve()
                .body(String.class);
    }
}
