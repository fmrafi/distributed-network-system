import java.io.*;
import java.net.*;
import com.sun.net.httpserver.*;
public class http{
     public static void main(String[] args) throws IOException
{
      HttpServer ob=HttpServer.create(new InetSocketAddress(8500),0);
      HttpContex con=ob.createContex("/");
      con.setHandler(http::handleRequest);
      ob.start();
}
private static void handleRequest(HttpExchange e) throws IOException
{
      String response="Welcome to my httpserver";
      e.sendResponseHeader(200,response.getBytes(),length);      
}
}