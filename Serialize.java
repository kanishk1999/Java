// program for serialize and deserialize
//to write data in binary format is serialization
//to read binary data is called deserialization

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import static java.lang.System.out;

class University implements Serializable
{
  String uniName;
  String services;
  long contactNo;
 

void set(String uniName,String services,long contactNo)
 {
   this.uniName=uniName;
   this.services=services;
   this.contactNo=contactNo;
  }

 void show()
 {
   out.println(uniName+" "+services+" "+contactNo);
  }

}
class Serialize
 {
   public static void main(String...ar)throws Exception
    {
      University uni=new University();
      uni.set("Davv","xyz",534);
    
     //serialization

  FileOutputStream fos=new FileOutputStream("binary.text");
  ObjectOutputStream os=new ObjectOutputStream(fos);
   os.writeObject(uni);
   os.close();

  //deserialize

  FileInputStream fis=new FileInputStream("binary.text");
   ObjectInputStream ois=new ObjectInputStream(fis);
 
 University uni1=new University(); 
 uni1=(University)ois.readObject();

 uni1.show();
 }
}
  
