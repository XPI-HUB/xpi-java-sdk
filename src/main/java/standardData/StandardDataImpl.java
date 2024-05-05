package standardData;

import org.springframework.web.client.RestClient;

import java.util.*;

public class StandardDataImpl implements StandardData {

    private final RestClient restClient;

    public StandardDataImpl() {
        this.restClient = RestClient
                .builder()
                .baseUrl("http://localhost:8080")
                .build();
    }

    public Set getAllCountries(){
        return restClient
                .get()
                .uri("/api/getAllCountries")
                .retrieve()
                .body(Set.class);
    }

    @SuppressWarnings("unchecked")
    public List<Currency> getAllCurrency(){
        return restClient
                .get()
                .uri("/api/getAllCurrency")
                .retrieve()
                .body(List.class);
    }

    public HashMap<String, String> getTimeZone(){
        return restClient
                .get()
                .uri("/api/getTimeZone")
                .retrieve()
                .body(HashMap.class);
    }

    public HashMap getTimeZoneFromIds(List<String> ids){
        return restClient
                .post()
                .uri("/api/getTimeZoneFromIds")
                .body(ids)
                .retrieve()
                .body(HashMap.class);
    }
}
