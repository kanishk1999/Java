// program for static array
import java.util.Scanner;
import static java.lang.System.out;
class StaticArray
{
  public static void main(String...ar)
  {
    Scanner sc=new Scanner(System.in);
    out.println("enter size of an array");

    
     int size=sc.nextInt();
     int arr[]=new int[size]; 

    out.println("enter elements now");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
     }

   out.println("displaying the elements of array");
   for(int i=0;i<size;i++)
   {
     out.println(ar[i]);
   }

  out.println("now displaying 1 d array");
  
  out.println("enter total no of rows and coloumn");
  int row=sc.nextInt();
  int col=sc.nextInt();

 int arra[][]=new int[row][col];
 
 out.println("enter the elements in array");
 for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
     arra[i][j]=sc.nextInt();
   }
 }
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    out.print(arra[i][j]);
   }
  out.println();
  }

 


 }

}
   