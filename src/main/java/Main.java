
/*
 * User: Avinash Vijayvargiya
 * Date: 28/04/24
 * Time: 2:55 am
 */

import hello.Hello;
import hello.HelloImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        System.out.println(new HelloImpl().getHello());;
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        System.out.println(new HelloImpl().postHello(map));
    }
}
