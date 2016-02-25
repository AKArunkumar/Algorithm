/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myfirst;

import java.io.*;
public class Queue {
    static int front=0,rear=0;
    public static void main(String[] args)
    {
    int[] array = new int[10];
    DataInputStream in=new DataInputStream(System.in);
   try
   {
       while(true)
       {
    System.out.println("enter: 1 to enqueue\t2 to dequeue");
    int choice=Integer.parseInt(in.readLine());
    switch(choice)
    {
        case 1:
              rear++;
            if(rear>=10)
            {
                System.out.println("Queue is full");
                
            }
            else 
            {
                System.out.println("enter element to be enqueue");
                 int elem=Integer.parseInt(in.readLine());
                array[rear]=elem;
            }
        break;
        case 2: 
            if(front==rear)
            {
            System.out.println("Queue is empty");
            }
           else
            {
               int elem=array[front++];
                 System.out.println("Dequeue element is:"+elem);
            }
            break;
        default: System.out.println("Not good choice");
            break;
            
    }
       }
   }
   catch(IOException e)
   {
       System.out.println(e);
   }
}
    
}
