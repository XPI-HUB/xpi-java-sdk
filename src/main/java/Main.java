
/*
 * User: Avinash Vijayvargiya
 * Date: 28/04/24
 * Time: 2:55 am
 */

import hello.HelloImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import standardData.StandardDataImpl;


public class Main {
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        System.out.println(new HelloImpl().getHello());;
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        System.out.println(new HelloImpl().postHello(map));

        System.out.println(new StandardDataImpl().getAllCountries());
        System.out.println("***********************************");
        System.out.println(new StandardDataImpl().getAllCurrency());
        System.out.println("***********************************");
        System.out.println(new StandardDataImpl().getTimeZone());
        System.out.println("getTimeZone() ----> ***********************************");
        List<String> id = new ArrayList<>();
        id.add("IN");
        System.out.println(new StandardDataImpl().getTimeZoneFromIds(id));
    }
}
