// program for date, date format,Simple dateformat

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import static java.lang.System.out;

class DateLogic{

 public static void main(String...ar)
  {
   Date ref=new Date();
   out.println(ref);
  
   SimpleDateFormat sdf=new SimpleDateFormat(" dd/mm/yyyy  hh:mm:ss");
   out.println(sdf.format(ref));

   //DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
   DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT); 
   //DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
   
   out.println(df1.format(ref));

  DateFormat df=DateFormat.getDateInstance(DateFormat.FULL); 
  out.println(df.format(ref));

 

  }

}