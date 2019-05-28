// program for assertion 

import java.util.Scanner;
import static java.lang.System.out;

class AssertionDemo
{
  int var=0;
  void set(int var)
  {
    this.var=var;
     show();
   }

 void show()
 {
   var=var*100;
   assert(var==1000):"Tumse na ho payga";
   out.println(var);
  }
}

 class Assertion
 {
   public static void main(String...ar)
    {
      AssertionDemo obj=new AssertionDemo();
      obj.set(100);
    }
 }