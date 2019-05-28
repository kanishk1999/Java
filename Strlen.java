// program for counting string length without using built in method

import static java.lang.System.out;

class Strlen
 {
   public static void main(String...ar)
   {
    
      String str="Hell yeah";
      
      int i=0;
     // char ch[]=new char[i];
       int COUNT=0;
      
       for(   ;i>=0;   )
      {
        str.charAt(i);
          i++;
          COUNT++;
       }

    out.println(COUNT);
   }

}