// program for verifying two email id's 

import static java.lang.System.out;
import java.util.Scanner;

class Emailid
 {
  public static void main(String...ar)
   {
      Scanner sc=new Scanner(System.in);
      
      out.println("Enter EmailId");
      String emailId=sc.next();
      String str="kanishkdave@gmail.com";

       if(str.equals(emailId))
       {
        out.println("The entered emailId is of valid format");
        }
     
        else
       {
         out.println("Invalid emailId");
       }
     
    }
}