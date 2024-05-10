package standardData;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.springframework.core.io.Resource;
import org.springframework.web.client.RestClient;

public class StandardDataImpl implements StandardData {

    private final RestClient restClient;

    public StandardDataImpl() {
        this.restClient = RestClient
            .builder()
            .baseUrl("http://localhost:8080/api/")
            .build();
    }

    public Set<?> getAllCountries(){
        return restClient
            .get()
            .uri("getAllCountries")
            .retrieve()
            .body(Set.class);
    }

    public List<?> getAllCurrency() {
        return restClient
            .get()
            .uri("getAllCurrency")
            .retrieve()
            .body(List.class);
    }

    public HashMap<?, ?> getTimeZone() {
        return restClient
            .get()
            .uri("getTimeZone")
            .retrieve()
            .body(HashMap.class);
    }

    public HashMap<?, ?> getTimeZoneFromIds(final List<String> ids) {
        return restClient
            .post()
            .uri("getTimeZoneFromIds")
            .body(ids)
            .retrieve()
            .body(HashMap.class);
    }

    public Resource generateBarcode(final String barcode) {
        return restClient
            .get()
            .uri("barcode?text={text}", "1234")
            .retrieve()
            .body(Resource.class);
    }
}
