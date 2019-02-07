import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class Client {
 private Client() {}
public static final Scanner askScanner = new Scanner(System.in);
public static double answer;
public static double firstNumber;
public static double secondNumber;
 public static void main(String[] args) {
 try {
 // Getting the registry
 Registry registry = LocateRegistry.getRegistry(null);
 // Looking up the registry for the remote object
 Hello stub = (Hello) registry.lookup("Hello");
 // Calling the remote method using the obtained object
 //int i=5, j=2;
//System.out.println("First number?");
        firstNumber = askScanner.nextDouble();
       // System.out.println("Second Number?");
        secondNumber = askScanner.nextDouble();
answer=firstNumber+secondNumber;
System.out.println(answer);
  //stub.printMsg(firstNumber,secondNumber );
 // System.out.println("Remote method invoked");
 
 } catch (Exception e) {
 System.err.println("Client exception: " + e.toString());
 e.printStackTrace();
 }
 }
}