 // program for daily petrol consumption 

  import java.util.Scanner;
 
class Petrol{

	     public static void main(String...ar)
                      {
	 	Scanner sc=new Scanner(System.in);

                  	System.out.println("enter total volume of petrol"); 
                  	double totalPetrol=sc.nextDouble();

                   	System.out.println("enter average of vehicle");
                   	double average=sc.nextDouble();

                    	System.out.println("enter distance travelled in one day");
                    	double disOneDay=sc.nextDouble();

                    	double perDayConsumption=disOneDay/average;
                    	System.out.println("petrol consumed in one day in litres"+perDayConsumption);

                                   double noOfDays=totalPetrol/perDayConsumption;
                                    System.out.println("no of days after petrol will be consumed"+noOfDays);

                    }


  	}