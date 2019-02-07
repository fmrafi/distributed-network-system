import java.net.*;
import java.io.*;
public class client{
      public static void main(String[] args)
      {
        try{ 
        Socket s=new Socket("172.168.1.58",6666);
        DataOutputStream dis=new DataOutputStream(s.getOutputStream());
        dis.writeUTF("Server is here");
        dis.flush();
        dis.close();
        s.close();
}
catch(Exception e)
{
   System.out.println(e);    
}
}
}