import static java.lang.System.out;

class Demo{

 void set(int...var){

 for(int i=0;i<var.length;i++)
  {
    System.out.println(var[i]);
  }

 // for each loop

 for(int list:var)
 {
 out.println("\n"+list);
   }

 }

}
class Vararg{

 public static void main(String...ar){

 new Demo().set(100,50,20,10,45,60,39,86);

 }

}