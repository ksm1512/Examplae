import java.io.*;
import java.util.*;
import java.util.Scanner;
class Caterers
{
	
	public static void starter()
	{
		int total=0,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Now Please Enter the no. of items for Starter you want:");
		int n=sc.nextInt();
		for(i=1;i<n+1;i++)
		{
			System.out.println("Please Enter " +i + " item:  ");
			
			String str=sc.next();
			
			System.out.print("Please Enter The Price for " +str + " item " );
			int price= sc.nextInt();
			total+=price;
		}
		System.out.println("The total of starter is : " +total);
	}
}
class Main extends Caterers
{
  public static void main(String[] args)
  {
	System.out.println("\t\t\t\t Hello ...! ");
	System.out.println("\t\t Please Choose Your Function from below given choice");
	System.out.println("1) Marriage_Function \n2) Birthday_Party \n3) Vastu_Pujan \n4) Reception_Function");
	int choice;
	Scanner sc= new Scanner(System.in);
	choice=sc.nextInt();

    // switch statement to check a function
    switch (choice) 
	{
      case 1:
		System.out.println("Okay ...! So This is the Menu_List for your Marriage_Function" );
        break;

      case 2:
        System.out.println("Okay ...! So This is the Menu_List for your Birthday_Party");
        break;
		
      case 3:
        System.out.println("Okay ...! So This is the Menu_List for your Vastu_Pujan Funtion");
        break;

      case 4:
        System.out.println("Okay ...! So This is the Menu_List for your Reception_Function");
        break;
      
      default:
        System.out.println("You have Choose an invalid choice....");
        break;

    }	 
	Caterers obj= new Caterers();
	obj.starter();
  }
}