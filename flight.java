import java.util.Scanner;
class Demo
{
	static boolean seatbooking[]=new boolean[10];
	static int firstclass=0;
	static int economy=5;
	int option;
	
	void firstClass()
	{
		int remaining_seats=5-firstclass;
		Scanner sc=new Scanner(System.in);
		if(firstclass>4)
		{
			System.out.println("Sorry Sir/Mam,firstclass is FULL");
			System.out.println(" IF You Want To Book Ticket In Economy (1=YES and 2 and other=NO)");
			int no=sc.nextInt();
			if(no==1)
			{
				Demo d=new Demo();
				d.economy();
			}
			else
			{
				System.out.println("THANK YOU! VISIT AGAIN");
				System.out.println("Note:Next Flight leaves in 3 hours");
			}
		}
		else
		{
			System.out.println("Enter no.of seats");
			int seatno=sc.nextInt();
			if(remaining_seats>=seatno)
			{
				//System.out.println("Enter no.of seats");
				//int seatno=sc.nextInt();
				for(int i=0;i<5;i++)
				{	
					if(i<seatno)
					{
						if(firstclass<5)
						{
							if(seatbooking[firstclass]==false)
							{
								seatbooking[firstclass++]=true;
								System.out.println("Your seat number is: "+firstclass+" for firstclass and price of "+firstclass+" Ticket is "+(i+1)*2000);
							}
						}
					}
				}
			}
			else
			{
				System.out.println("Sorry Sir,We have only "+remaining_seats+" seats");
				System.out.println(" IF You Want To Book Ticket In Economy (1=YES and 2 and other=NO)");
				int no=sc.nextInt();
				if(no==1)
				{
					Demo d=new Demo();
					d.economy();
				}
				else
				{
					System.out.println("THANK YOU! VISIT AGAIN");
					System.out.println("Note:Next Flight leaves in 3 hours");
				}
			}
			
		}
		
		/*System.out.println("array is:");
		for(int i=0;i<seatbooking.length;i++)
		{
			System.out.println(seatbooking[i]);
		}*/
	}
	
	
	
	
		
	void economy()
	{
		int remaining_seats=10-economy;
		if(economy>9)
		{
			System.out.println("Sorry Sir/Mam,Economy is FULL");
			System.out.println("Next Flight leaves in 3 hours");
		}
		else
		{
			System.out.println("Enter no.of seats");
			Scanner sc=new Scanner(System.in);
			int seatno=sc.nextInt();
			if(remaining_seats>=seatno)
			{
				for(int i=0;i<5;i++)
				{
					if(i<seatno)
					{
						if(economy<10)
						{
							if(seatbooking[economy]==false)
							{
								seatbooking[economy]=true;
								economy++;
								System.out.println("Your seat number is: "+economy+" for economy and price of "+economy+" Ticket is "+(i+1)*1000);
							}
						}
					}
				}
			}
			else
			{
				System.out.println("Sorry Sir,We have only "+remaining_seats+" seats");
			}
		}
		/*System.out.println("array is:");
		for(int i=0;i<seatbooking.length;i++)
		{
			System.out.println(seatbooking[i]);
		}*/
		//System.out.println("economy");
	}
	
	
	
	
	
	
	
		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println();
			System.out.println("-----Airline Application By Saurabh-----");
			System.out.println("1.To Book A Ticket In First Class(Rs.2000)");
			System.out.println("2.To Book A Ticket In Economy(Rs.1000)");
			System.out.println("0.EXIT");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			Demo d=new Demo();
			
			switch(choice)
			{
				case 1:d.firstClass();
					   break;
				case 2:d.economy();
					   break;
				case 0:System.out.println("exit");
					   break;
				default:System.out.println("Invalid Choice");
			}
		}while(choice!=0);
	}
}
