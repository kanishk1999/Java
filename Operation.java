import java.util.Scanner;

class Vararg{

 void set(int...var)
 {
 for(int i=0;i<var.length;i++)
   {
   System.out.println(var[i]);
   }
 }

 void oper1(int...var)
 {
 for(int list:var)
 {
    if(list%2==0)
  {
   System.out.println("Following are the even no's:"+list);
   }
  else
 {
  System.out.println("Following are the odd no's:"+list);
 }
}
}

 void oper2(int...var)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the element to be searched");
 int key=sc.nextInt();
 for(int i=0;i<var.length;i++)
 {
  if(key==var[i])
  {
   System.out.println("element found :"+key);
   }
 }

  System.out.println("element not found");
 

}

 void oper3(int...var)
 {
  for(int i=0;i<var.length;i++)
  {
    System.out.println("Original order\n:"+var[i]);
    
    



}

class Operation{
 
 public static void main(String...ar)
 {

  Vararg obj1=new Vararg();
   obj1.set(100,20,15,45,78,50,36);

   obj1.oper1(100,20,15,45,78,50,36);
   obj1.oper2(100,20,15,45,78,50,36);
 }

}
     