
/*
 * User: Avinash Vijayvargiya
 * Date: 28/04/24
 * Time: 2:55 am
 */

import hello.Hello;
import hello.HelloImpl;

public class Main {
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        System.out.println(new HelloImpl().getHello());;
    }
}
