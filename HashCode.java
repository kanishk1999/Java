// program for toString method

import static java.lang.System.out;

class University
{
  String uniName;
  String services;
  long contactNo;
 

 University(String uniName,String services,long contactNo)
 {
   this.uniName=uniName;
   this.services=services;
   this.contactNo=contactNo;
  }

{
  // intialisation block
   int MAX=1000;
  out.println("intialisaton block is executed"+MAX);
 }

 static
 {
   out.println("Welcome!!!");
 }

 public String toString()
 {
   return uniName+" "+services+" "+contactNo;
  }

 public void finalize()
 {
   out.println("Finalize method is executed");
 }
}
 class HashCode
 {
   public static void main(String...ar)
   {
     University uni=new University("davv","xyz",4546);
     out.println(uni);

  //  out.println(new University("davv","xyz",4546));
  System.gc();
  }

}
  