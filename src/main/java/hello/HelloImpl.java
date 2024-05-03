package hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestClient;

import java.util.Map;

public class HelloImpl implements Hello{
    public String getHello(){
        return RestClient.create().get()
                .uri("http://localhost:8080/hello")
                .retrieve()
                .body(String.class);
    }

    public Map<?,?> postHello(Map<String, String> map){
        return RestClient.create().post()
                .uri("http://localhost:8080/hello")
                .body(map)
                .retrieve()
                .body(Map.class);
    }
}
