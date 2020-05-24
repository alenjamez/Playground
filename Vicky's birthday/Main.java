import java.io.*;
import java.util.*;
class Main
{
   public static void main(String[] args) {

        int year ;
        Scanner s = new Scanner(System.in);
        year=s.nextInt();
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("Vicky can celebrate his birthday.");
        else
            System.out.println("Vicky can't celebrate.");
    }
}