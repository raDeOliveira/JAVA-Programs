package trabalho1;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Le
{
    private Le() {}

    public static int umInt()
    {
        while( true )
        {
          try{
            return Integer.valueOf(umaString().trim()).intValue();
            }
            catch( Exception e ){
              System.out.println( "Nao e um inteiro");
            }
          }
      }

    public static float umFloat()
    {
        while( true )
        {
          try{
            return Float.valueOf(umaString().trim()).floatValue();
            }
            catch( Exception e ){
              System.out.println( "Nao e um float");
            }
          }
      }

    public static double umDouble()
    {
        while( true )
        {
          try{
            return Double.valueOf(umaString().trim()).doubleValue();
            }
            catch( Exception e ){
              System.out.println( "Nao e um double");
            }
          }
      }


      public static String umaString()
      {
        String s = "";
        try {
          BufferedReader in = new BufferedReader( new
              InputStreamReader( System.in ), 1);
          s = in.readLine();
          } catch( IOException e ) {
            System.out.println(" Error " );
          }
          return s;
      }
}
