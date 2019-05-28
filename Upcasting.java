// program for upcasting

import static java.lang.System.out;

abstract class A //broader category
{
  abstract void show();
 }

class B extends A //Narrower Category
 {
   void show()
   {
     out.println("Show B");
   }
}

class C extends A
 {
  void show()
  {
   out.println("show C");
  }
}

class Upcasting
 {
   public static void main(String...ar)
   {
     A ref1=new C();
     ref1.show();
    }
}