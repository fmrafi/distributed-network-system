import java.io.*;

import java.net.*;

import com.sun.net.httpserver.*;

public class parameter {
 
public static int V1;
	public static int V2;
 public static void main(String[] args) throws IOException {
   
	  
 HttpServer server = HttpServer.create(new InetSocketAddress(8500), 0);
     
 HttpContext context1 = server.createContext("/a");
  
 HttpContext context2 = server.createContext("/b");
   
  context1.setHandler(parameter::handleRequesta);
 
 context2.setHandler(parameter::handleRequestb);
     
 server.start();
  
}

  
private static void handleRequesta(HttpExchange exchange) throws IOException {
    
  URI requestURI = exchange.getRequestURI();
    
  printRequestInfo1(exchange);
    
  String response = "This is the response at " + requestURI;
  
    exchange.sendResponseHeaders(200, response.getBytes().length);
   
   OutputStream os = exchange.getResponseBody();
   
   os.write(response.getBytes());
    
  os.close();
  
}

  
private static void handleRequestb(HttpExchange exchange) throws IOException {
    
  URI requestURI = exchange.getRequestURI();
    
  printRequestInfo2(exchange);
    
  String response = "This is the response at " + requestURI;
  
    exchange.sendResponseHeaders(200, response.getBytes().length);
   
   OutputStream os = exchange.getResponseBody();
   
   os.write(response.getBytes());
    
  os.close();
  
}

  
private static void printRequestInfo1(HttpExchange exchange) {
    
  System.out.println("-- query --");
    
  URI requestURI = exchange.getRequestURI();
  
    String query = requestURI.getQuery();
      System.out.println(query);



 V1=Integer.valueOf(query); 
}


private static void printRequestInfo2(HttpExchange exchange) {
    
  System.out.println("-- query --");
    
  URI requestURI = exchange.getRequestURI();
  
    String query = requestURI.getQuery();
      System.out.println(query);



 V2=Integer.valueOf(query); 
 System.out.println(V2+V1);


}

}
