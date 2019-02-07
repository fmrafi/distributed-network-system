import java.io.*;
import java.net.*;
import com.sun.net.httpserver.*;
public class httpserver 
	{
	public static void main(String[] args) throws IOException
		{
		HttpServer ob = HttpServer.create(new InetSocketAddress(8500),0);
		//HttpServer ob=HttpServer.create("localhost:8500",0);

		HttpContext con = ob.createContext("/id");
		HttpContext con1 = ob.createContext("/name");
		con.setHandler(httpserver::handleRequest);
		con1.setHandler(httpserver::handleRequest1);
		ob.start();
		}
	private static void handleRequest(HttpExchange e) throws IOException{
		String response="Welcome to my httpserver.My ID is : 151311041";
		e.sendResponseHeaders(400,response.getBytes().length);
		OutputStream o=e.getResponseBody();
		o.write(response.getBytes());
		o.close();
		}
	private static void handleRequest1(HttpExchange f) throws IOException{
		String response="Welcome to my httpserver.My Name is : Ashique";
		f.sendResponseHeaders(400,response.getBytes().length);
		OutputStream p=f.getResponseBody();
		p.write(response.getBytes());
		p.close();
		}
	}