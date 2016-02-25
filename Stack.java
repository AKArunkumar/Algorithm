package myfirst;
import java.io.*;
public class Stack {
    static int top=-1;
    public static void main(String[] args)
    {
    int[] array = new int[10];
   DataInputStream in=new DataInputStream(System.in);
   try
   {
       while(true)
       {
    System.out.println("enter: 1 to push\t2 to pop");
    int choice=Integer.parseInt(in.readLine());
    switch(choice)
    {
        case 1:if(top>=10)
        {
        System.out.println("-------stack is overflow-------");
        }
        else
        {
            System.out.println("enter element to push");
            array[++top]=Integer.parseInt(in.readLine());
        }
        break;
        case 2:if(top<0)
        {
        System.out.println("------stack is underflow--------- ");
        }
        else
        {
        int elem=array[top--];
        System.out.println("Poped element is:"+elem);
        }
          break;
        default:
            System.out.println("invalid choice");
            break;
    }
       }
   }
   catch(IOException e)
   {
   System.out.println("Arithmetic Exception"+e);
   }
    
    }
}
