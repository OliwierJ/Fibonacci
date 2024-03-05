import java.math.BigInteger;
import java.util.*;
public class fibonacci extends Thread
{
    public static String toTime(int index, double why)
    {
        String myString;
        myString = "";
        if (index >= 60)
            {
                myString = myString + index / 60 + "m " + why % 60 + " sec";
            }
        else
            {
                myString = myString + why + " sec";
            }
        return myString;
    }
    public static void main(String[] args) throws InterruptedException
    {
        fibonacci thread = new fibonacci();
        
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;    
        int stop;
        int index;
        double x2;
        double y2;

        System.out.print("Enter number of the fibonacci sequence you want to find: ");
        stop = EasyIn.getInt();
        Date date1 = new Date();
        x2 = date1.getTime();

        thread.start();

        for (index = 0; index < stop; index++)
            {
                b = a;
                a = b.add(c); 
                c = b;

            }
        Date date2 = new Date();
        y2 = (date2.getTime()-x2)/1000;
        System.out.println(a+ "\n\ntime taken: " + toTime(( (int) y2), y2));
        System.exit(0);
        
    }

    public void run()
    {   
        int index = 0;
        while (true)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } 
                index ++;
                System.out.println(toTime(index, (double) index));    
            }
    }    
}
