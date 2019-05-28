// program for command line arguments


 
import static java.lang.System.out;

class Commandline{
    
 public static void main(String...ar) throws Exception
 {
  int one=Integer.parseInt(ar[0]);
  float two=Float.parseFloat(ar[1]);
  short third=Short.parseShort(ar[2]);
  boolean four=Boolean.parseBoolean(ar[3]);
  String five=ar[4];
  long six=Long.parseLong(ar[5]);
  double seven=Double.parseDouble(ar[6]);
  byte eight=Byte.parseByte(ar[7]);
  

 out.println(one+" "+two+" "+third+" "+four+" "+five+" "+six+" "+seven+" "+eight);

 }


}


  

 
  