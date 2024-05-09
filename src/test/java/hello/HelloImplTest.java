package hello;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class HelloImplTest {

    @InjectMocks
    private HelloImpl hello;

    @Test
    public void test_getHello() {
        String result = hello.getHello();
        assertEquals("Hello", result);
    }

    @Test
    public void test_postHello() {
        HashMap<String, String> mapOfRequest = new HashMap<>();
        mapOfRequest.put("Hello", "World");
        Map<?, ?> mapOfResponse = hello.postHello(mapOfRequest);
        assertEquals("World", mapOfResponse.get("Hello"));
    }
}
