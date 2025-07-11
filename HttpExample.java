package Aufin;

import java.io.*;
import java.net.*;

public class HttpExample {
    public static void main(String[] args) {
        try {
            URI uri = URI.create("https://example.com");
            URL url = uri.toURL();
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            while ((line = in.readLine()) != null)
                System.out.println(line);
            in.close();
            con.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

