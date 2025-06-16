import java.util.*;
class Food
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("***Welcome to Swiggy****");
		System.out.println("Hotel names");
		System.out.println("1.A2B");
		System.out.println("2.Buhari");
		System.out.println("3.Thalapakatti");
		
		System.out.println("Select the hotel numbers(1-3):");
		int number=sc.nextInt();
		
		switch (number)
		{
		case 1:
		System.out.println("You are selected the A2B hotel");
		System.out.println("Menu from A2B..........");
		System.out.println("1.Idly");
		System.out.println("2.Vada");
		System.out.println("3.Dosa");
		System.out.println("What you want sir/mam");
		System.out.print("Enter the food numbers(1-3):");
		int num=sc.nextInt();
		int Idlyprice=10;
		int vadaprice=5;
		int dosaprice=15;
		if (num==1)
		{
			System.out.println("Idly price:"+Idlyprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=Idlyprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		else if (num==2)
		{
			System.out.println("vada price:"+vadaprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=vadaprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		else if (num==3)
		{
			System.out.println("Dosa price:"+dosaprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=dosaprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		
		break;
		
		case 2:
		System.out.println("You are selected the Buhari hotel");
		System.out.println("Menu from Buhari..........");
		System.out.println("1.Chicken Biriyani");
		System.out.println("2.Chilli Chicken");
		System.out.println("3.Chicken Noodles");
		System.out.println("What you want sir/mam");
		System.out.print("Enter the food numbers(1-3):");
		int num1=sc.nextInt();
		int ChickenBiriyaniprice=120;
		int ChilliChickenprice=60;
		int ChickenNoodlesprice=150;
		if (num1==1)
		{
			System.out.println("Chicken Biriyani price:"+ChickenBiriyaniprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=ChickenBiriyaniprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		else if (num1==2)
		{
			System.out.println("Chilli Chicken price:"+ChilliChickenprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=ChilliChickenprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		else if (num1==3)
		{
			System.out.println("Chicken Noodles price:"+ChickenNoodlesprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=ChickenNoodlesprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		break;
		
		case 3:
		System.out.println("You are selected the Thalapakatti hotel");
		System.out.println("Menu from Thalapakatti Beef Special..........");
		System.out.println("1.Beef Biriyani");
		System.out.println("2.Beef gravy");
		System.out.println("3.Beef Chilli");
		System.out.println("What you want sir/mam");
		System.out.print("Enter the food numbers(1-3):");
		int num2=sc.nextInt();
		int BeefBiriyaniprice=110;
		int BeefGravyprice=75;
		int BeefChilliprice=65;
		if (num2==1)
		{
			System.out.println("Beef Biriyani price:"+BeefBiriyaniprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=BeefBiriyaniprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		else if (num2==2)
		{
			System.out.println("Beef Gravy price:"+BeefGravyprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=BeefGravyprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		else if (num2==3)
		{
			System.out.println("Beef Chilli price:"+BeefChilliprice);
			System.out.print("Select quantity:");
		    int quantity=sc.nextInt();
			int Total=BeefChilliprice*quantity;
			System.out.println("Total price :"+Total);
			System.out.println("Select Payment method :1.PhonePay,2.Gapy");
			int payment=sc.nextInt();
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.println("Your OTP:"+sys_otp);
			System.out.println("Enter Your OTP:");
			int OTP=sc.nextInt();
			if (OTP==sys_otp)
			{
				System.out.println("*** Your Order is confirmed and thanks for order enjoy with your swiggy food *** ");
			}
			else
				System.out.println("Sorry incorrect OTP");
		}
		break;
		}
	}
}
