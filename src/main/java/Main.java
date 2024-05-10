
/*
 * User: Avinash Vijayvargiya
 * Date: 28/04/24
 * Time: 2:55 am
 */

import hello.HelloImpl;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import standardData.StandardDataImpl;
import javax.imageio.ImageIO;


public class Main {
    public static void main(final String[] args) throws IOException {
//        System.out.println("Hello World!");
//        System.out.println(new HelloImpl().getHello());;
//        Map<String, String> map = new HashMap<>();
//        map.put("hello", "world");
//        System.out.println(new HelloImpl().postHello(map));
//
//        System.out.println(new StandardDataImpl().getAllCountries());
//        System.out.println("***********************************");
//        System.out.println(new StandardDataImpl().getAllCurrency());
//        System.out.println("***********************************");
//        System.out.println(new StandardDataImpl().getTimeZone());
//        System.out.println("getTimeZone() ----> ***********************************");
//        List<String> id = new ArrayList<>();
//        id.add("IN");
//        System.out.println(new StandardDataImpl().getTimeZoneFromIds(id));

//        File input = new File(String.valueOf(new StandardDataImpl().generateBarcode("helloo")));


        File input = new File((new StandardDataImpl().generateBarcode("helloo")
            .getFile();
        BufferedImage img = ImageIO.read(input);
        File output = new File("barcode.jpg");
        try {
            ImageIO.write(img, "jpg", output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }
}
