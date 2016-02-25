package myfirst;
import java.io.*;
public class Star_Naming 
{
    public static void main(String[] args)
    {
     DataInputStream s =new DataInputStream(System.in); 
     System.out.println("enter your Name(Max 9 Lettar)");
     try
     {
     String name=s.readLine();
     
     }
     catch(IOException e)
     {
     System.out.println(e);
    }  
    }
}
