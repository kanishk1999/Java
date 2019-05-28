// program for IO operation

 class IOConcept
  {
    out.println("Enter Data");
    static public void main(Srting...ar)throws Exception 
     {
       InputStreamReader isr=new InputStreamReader(System.in);
 
       BufferedReader br=new BufferedReader(isr);
       String data=br.readline();

       FileWriter fw=new FileWriter("data.txt");
       fw.write(data);
       fw.close();
  
       FileReader fr=new FileReader("data.txt");
      
     
      



