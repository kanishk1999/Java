// program for dynamic array

import java.util.ArrayList;
import static java.lang.System.out;

 class Array
{
  public static void  main(String...ar)
  {
    ArrayList list=new ArrayList();
     list.add(520);
     list.add("abcd");
     list.add(5.214);
     list.add(4548464);
     list.add('k');
     
     out.println(list.get(4));
 
     for(int i=0;i<list.size();i++)
     {
      out.println(list.get(i));
      }

  }

}

