import java.net.*;
import java.io.*;
public class server{
      public static void main(String[] args)
      {
        try{
        ServerSocket ss=new  ServerSocket(6666); 
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String str=(String)dis.readUTF();
        System.out.println("client message send,message is: "+str);

        ss.close();
}
catch(Exception e)
{
   System.out.println(e);    
}
}
}