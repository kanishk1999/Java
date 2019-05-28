// program for generics

import static java.lang.System.out;

class Generics<Why,So,Serious>
{
  Why var1; //declaring globally
   So var2;    
   Serious var3;
  
   void set(Why va1,So va2,Serious va3)
   {
     var1=va1;
     var2=va2;
      var3=va3;
    }

   void show()
   {
     out.println(var1+" "+var2+" "+var3);
    }
}

  class MainGenerics
 {
   public static void main(String...ar)
    {
      Generics ref=new Generics();
       ref.set("abcd",12.55,45288);
       ref.show();
    }
 }
    

  