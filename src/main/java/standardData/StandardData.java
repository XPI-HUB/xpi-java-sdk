package standardData;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface StandardData {

    Set<?> getAllCountries();

    List<?> getAllCurrency();

    HashMap<?, ?> getTimeZone();

    HashMap<?,?> getTimeZoneFromIds(List<String> ids);
}
