import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
import java.util.Scanner;
import java.math.*;
// Creating Remote interface for our application
public static final Scanner askScanner = new Scanner(System.in);
public static double answer;
public static double firstNumber;
public static double secondNumber;
public void n()
{
System.out.println("First number?");
        firstNumber = askScanner.nextDouble();
        System.out.println("Second Number?");
        secondNumber = askScanner.nextDouble();
        answer=firstNumber + secondNumber;
}
public interface Hello extends Remote {
//void getNumbers() throws RemoteException;
n();
 void printMsg() throws RemoteException;
}
