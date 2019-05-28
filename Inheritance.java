// program for inheritance

import static java.lang.System.out;

class College
{
  String collName;
  String services;
  final int MAX=1000;

 void set(String collName,String services)
  {
    this.collName=collName;
    this.services=services;
   }

 void show()
 {
   out.println("....parent class....");
   out.println(collName+" "+services+" "+MAX);
 }
}

 class Student extends College
 {
  int StudentRno;
  String StudentName;
 
 void set(int StudentRno,String StudentName)
  {
    super.set("Davv","yeah");// parent class
    this.StudentRno=StudentRno;
    this.StudentName=StudentName;
   }

 void show()
 {
   super.show();
   out.println("....child class....");
    out.println(StudentRno+" "+StudentName);
  }
}

 class Inheritance
  {
    static public void main(String...ar)
    {
      Student student=new Student();
      student.set(101111,"HOLA");
      student.show();
    }
}
  