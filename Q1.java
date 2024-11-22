import java.util.*;
import java.lang.Math;
class Q1
{
    public static void main(String args[])
    {
        System.out.println("Ambrish Kalia 2230143");
        double x,y,i;
        for (i=0; i<=1.0; i+=0.1)
        {
            
            y = Math.exp(-i);
            i = Math.floor(i*100)/100;
            y = Math.floor(y*1000)/1000;
            System.out.println("For x = "+i+", the value of y = "+y);
        }
        
    }
}