// program for volume of cone sphere and cylinder

import java.util.Scanner;

class Volume{

 public static void main(String...ar)
  {
 
 Scanner sc= new Scanner(System.in);
   
 System.out.println("enter radius of cone");
 double rad=sc.nextDouble();

  System.out.println("enter height of cone");
 double hei=sc.nextDouble();
 
 double vol1=(3.14*rad*rad*hei)/3;
 System.out.println("volume of cone is:"+vol1);

 // volume of sphere

  System.out.println("enter radius of sphere");
 double radi=sc.nextDouble();

 double vol2=(4*3.14*radi*radi*radi)/3;
 System.out.println("volume of cone is:"+vol2);

 // volume of cylinder
 
  System.out.println("enter radius of cylinder");
 double radius=sc.nextDouble();

  System.out.println("enter height of cylinder");
 double height=sc.nextDouble();
 
 double vol3=(3.14*rad*rad*hei);
 System.out.println("volume of cone is:"+vol3);
 

 }

}

 