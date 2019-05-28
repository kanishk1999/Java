import java.util.Scanner;
import java.text.NumberFormat;

class Area{

 public static void main(String...ar){

  Scanner sc=new Scanner(System.in);
  System.out.println("enter radius");

  double rad=sc.nextDouble();

 double area1=3.14*rad*rad;
 NumberFormat nf=NumberFormat.getNumberInstance();
  nf.setMaximumFractionDigits(4);
  System.out.println(nf.format(area1));

 System.out.println("Area of Circle is:"+area1);

 System.out.println("enter length");
 int length=sc.nextInt();

 System.out.println("enter breadth");
 int breadth=sc.nextInt();

 int area2=length*breadth;

 System.out.println("Area of rectangle is:"+area2);

 System.out.println("enter base");
 double base=sc.nextDouble();

 System.out.println("enter height");
 double height=sc.nextDouble();

 double area3=0.5*base*height;

 System.out.println("Area of triangle is:"+area3);
}

} 