// program for string operations

import static java.lang.System.out;
import java.util.Scanner;

class StringOp
{
  public static void main(String...ar)
  {
    String str="why so serious";
    out.println(str.toUpperCase());

     String str1="JOKER";
     out.println(str1.toLowerCase());
  
    String str2="I am Batman";
    out.println(str2.replace('B','F'));
  
    String str3="    The Watchful Guardian     ";
    out.println(str3.trim());

   String str4="abc";
   String str5="abc";
  
   if(str4==str5)
    {
      out.println("same");// because of String pool
    }

  else
  {
    out.println("not same");
   }
   
  if(str4.equals(str5)) //check values 
    {
      out.println("same");
    }

   else 
    {
      out.println("not same");
    }

   if(str4.compareTo(str5==0))
   {
    out.println("same");
   }
   
   else
   {
     out.println("not same");
   }
  }

}

   
