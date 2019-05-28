// program for an audio file
 
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
import javax.media.Player;
import javax.media.Manager;
import java.io.File;
import java.util.*;

class VarArg
{
  static void setValue(int...ar)//holding element
  {
    Arrays.sort(ar);
    
    for(int data:ar)
    {
      out.println(data);
     }
   }
}


class PlayAudio extends Thread
 {
 public static void main(String...ar)throws Exception
  {
  Player play=Manager.createRealizedPlayer(new File("G:/Joker.wav").toURI().toURL());

  play.start();
  Thread.sleep(5000);//time in milli sec
  play.stop();
 
 VarArg.setValue(1,3,2,11,8,6,7,9,2,1,20,25);

  System.exit(0);// it shut down JVM
 
  }

}
   