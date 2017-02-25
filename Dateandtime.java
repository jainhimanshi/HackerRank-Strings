package w3stringsolutions;
import java.util.Date;
import java.util.*;
import java.text.*;
public class Dateandtime {

   public static void main(String args[]) {
      Date dNow = new Date( );
      System.out.println(dNow.toString());
      //give a format
      SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

          System.out.println("Current Date: " + ft.format(dNow));
   }
}