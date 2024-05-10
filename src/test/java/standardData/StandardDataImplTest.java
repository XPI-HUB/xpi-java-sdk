package standardData;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestClient;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.platform.commons.function.Try.success;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StandardDataImplTest {

    @InjectMocks
    private StandardDataImpl standardDataImpl;

    @Mock
    private RestClient restClient;

    @Mock
    private RestClient mockRestClient;


//    @Test
//    public void test_getAllCountries(){
//        List<String> expectedCurrencies = Arrays.asList("USD", "EUR", "INR");
//
//        // Mock successful response
//        when(mockRestClient.get())
//            .thenReturn(given().when().get("/getAllCurrency"))
//            .thenReturn(success().body(expectedCurrencies));
//
//        // Call the method under test
//        List<?> actualCurrencies = standardData.getAllCurrency();
//
//        // Assertions
//        assertEquals(expectedCurrencies.size(), actualCurrencies.size());
//        assertTrue(actualCurrencies.containsAll(expectedCurrencies));
//
//        // Verify interactions
//        verify(mockRestClient).get();
//
//    }

}