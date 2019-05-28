// program to check given string is palindrome or not

import static java.lang.System.out;
import java.util.Scanner;

class Palindrome
{
  public static void main(String...ar)
  {  
     Scanner sc=new Scanner(System.in); 
    
     out.println("enter the string"); 
     String str1=sc.next();

      //finding the length of the string 
 
      int len=str1.length();
      out.println("the length of the string is:"+str1.length());  
      char ch1[]=new char[len];

       for(int i=0;i<len;i++)
        {
         ch1[i]=str1.charAt(i);
        }
     
     int COUNT=0;
     for(int i=0;i<len/2;i++)
    {
       if(ch1[i]==ch1[len-1-i])
        {
          ++COUNT;
         }
       
      }
      
    if(COUNT==(len/2))
      { 
       out.println("The given string is palindrome");
      }

    else
    {
     out.println("not palindrome");
    }   
 
  }
  
} 