package com.AREP.Parcial;

import com.sun.net.httpserver.HttpServer; 
import java.io.IOException; 
import java.io.OutputStream; 
import java.net.InetSocketAddress; 
import java.util.ArrayList; 
import java.util.List;

public class PellHttp {

public static void main(String[] args) throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
    server.createContext("/pellseq", new PellHandler());
    server.setExecutor(null);
    server.start();
}

public static void main(String[] args) throws IOException {

        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { 
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
    }

     String json = "{\n" +
                "  \"operation\": \"Secuencia de Pell\",\n" +
                "  \"input\": " + n + ",\n" +
                "  \"output\": " + sequence.toString() + "\n" +
                "}";

}