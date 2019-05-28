import java.util.Scanner;

class Info{

 public static void main(String...ar){

 Scanner sc=new Scanner(System.in);
 
 System.out.println("enter roll no of students");
 int rollNo=sc.nextInt();
 
 System.out.println("enter name of student");
 String studName=sc.next();

 System.out.println("enter college name");
 String collegeName=sc.next();

 System.out.println("enter course name");
 String courseName=sc.next();

 System.out.println("enter college year");
 int collegeYear=sc.nextInt();

 System.out.println("enter your branch name");
 String branchName=sc.next();

 System.out.println("enter your semester");
 int sem=sc.nextInt();

 System.out.println("enter subject name 1:");
 String sub1=sc.next();

  System.out.println("enter subject name 2:");
 String sub2=sc.next();

  System.out.println("enter subject name 3:");
 String sub3=sc.next();

  System.out.println("enter subject name 4:");
 String sub4=sc.next();

  System.out.println("enter subject name 5:");
 String sub5=sc.next();

 System.out.println("enter max marks ");
 int maxMarks=sc.nextInt();

 System.out.println("enter minimun marks");
 int minMarks=sc.nextInt();

 System.out.println("enter marks obtained in sub1:");
 int sub1Marks=sc.nextInt();

  System.out.println("enter marks obtained in sub2:");
 int sub2Marks=sc.nextInt();

 System.out.println("enter marks obtained in sub3:");
 int sub3Marks=sc.nextInt();

 System.out.println("enter marks obtained in sub4:");
 int sub4Marks=sc.nextInt();

 System.out.println("enter marks obtained in sub5:");
 int sub5Marks=sc.nextInt();

 double percentage=(sub1Marks+sub2Marks+sub3Marks+sub4Marks+sub5Marks)/5;

 System.out.println("Percentage obtained:"+percentage);

 if(percentage>=90)
 {
  System.out.println("A grade");
   System.out.println("TCS");
   System.out.println("4 lakh");
 }

 else if(percentage>=80)
 {
  System.out.println("B grade");
    System.out.println("Capgemini");
   System.out.println("10 lakh");
 
  
 }

 else if(percentage>=70)
 {
 System.out.println("C grade");
   System.out.println("Facebook");
   System.out.println("50 lakh");
 
 }

 
 else
 {

 System.out.println("Fail");
   System.out.println("Google");
   System.out.println("1 Crore");
 
 }



   }

}
