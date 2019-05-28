//program for thread 

import static java.lang.System.out;

class Newthread extends Thread
{
   String name;
   Newthread(String name) //copy constructor
   {
     this.name=name;
     start();
    }
 
   public void run()
   {
     Thread.set(name);
    }
 }

 class Thread
 {
   static void set(String name)
    {
      out.println(name+"started");
     
      try