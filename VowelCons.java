// program for finding total no of vowels and consonents in a sentance.

import java.util.Scanner;
import static java.lang.System.out;

 class VowelCons
 {
   public static void main(String...ar)
    {
      Scanner sc=new Scanner(System.in);
      out.println("Enter the Sentance");
      //String str="Either you die like a hero or you live long enough to see yourselves become a villain";  
      String str=sc.nextLine();    
      out.println(str);
      int len=str.length();
      char ch[]=new char[len];
      
      int COUNT=0;//for vowels 
      int COUNT1=0;// for consonents
      int COUNT2=0;// for space
      for(int i=0;i<len;i++)
      {
        ch[i]=str.charAt(i);

        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u')
         {
           ++COUNT;
          }
      
         else if(ch[i]==' ')
          {
             
           }
          
          else
          {
            ++COUNT1;
           }
    
       }

      out.println("total no of vowels are:"+COUNT);
      out.println("total no of consonents are:"+COUNT1);
      
      
     }
}

           
 

