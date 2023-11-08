package org.example;

import java.io.*;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    public static final String KEY = "service.weather.url";
    public static final Properties PROPERTIES = new Properties();


    public static void loadProperties() {
        try (InputStream inputStream = App.class.getClassLoader().getResourceAsStream("config.properties")) {
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }    public static void main(String[] args) {


        

   //    File file = Path.of("src", "main", "resources", "config.properties").toFile();
// //      File file = Path.of("src", "target",  "classes","org","config.properties").toFile();
   //    try (FileInputStream fileInputStream = new FileInputStream(file)) {
   //        byte[] bytes = new byte[fileInputStream.available()];
   //        int count = 0;
   //        byte currentbByte;
   //        while ((currentbByte = (byte) fileInputStream.read()) != -1) {
   //            bytes[count++] = currentbByte;
   //        }
   //        String address = new String(bytes);
   //        System.out.println(address);
   //    } catch (IOException e) {
   //        e.printStackTrace();
   //    }

        loadProperties();
        String property = PROPERTIES.getProperty("service.weather.url");
        System.out.println(property);


    }


}
