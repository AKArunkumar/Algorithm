package myfirst;
import java.io.*;
import java.util.*;


public class ArraySum { 
    public static void main(String[] args)
    {
        int[] newarray=new int[6];
        int sum=0;
        Scanner numscan=new Scanner(System.in);
        for(int i=0;i<6;i++)
    {
            newarray[i]=numscan.nextInt();
            
        }
          for(int i=0;i<6;i++)
              {
              sum+=newarray[i];
          }
        System.out.println(sum);
    }
}
    
