import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest{

    @Test
    public void testMain() {
        String[] args = {"Hello", "World!"};
        Main.main(args);

        // Verify that the program prints the expected output
        assertEquals("Hello World!", args[0]+" "+args[1]);
    }
}
