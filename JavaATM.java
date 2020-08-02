import java.util.*;
class JavaATM
{
    public static void main(String args[])
    {
	Scanner input=new Scanner (System.in);
	int pin=1234;
	int balance=5000;
	System.out.println("Welcome to Java ATM\n");
 	int count=0;
	
	  for(int i=1;i<=3;i++)
	  {  	
	    System.out.println("Please enter your pin");
	    pin=input.nextInt();
	    if(pin==1234)
	    {
		System.out.println("You have succesfully enterd the pin");
		break;
	    }
		else	
		{	
		System.out.println("You have entered invalid pin");
		System.out.print("you have only " +(3-i)+" more chances left\n");
		}
		count++;
		if(count==3)
		  System.out.println("Sorry You have crossed the limit of entering pin\n Please reset your pin");
	
	   }
	  boolean t=true;
	  while(t)

	{
		if(pin==1234)
		{
		System.out.println("Please choose your option\n(1)Withdrawl\n*******************\n(2)Mini Statement\n*******************\n(3)Change password\n*******************\n(4)Deposit\n*******************\n(5)Balance\n*******************\n(6)Exit\n*******************");
		
		int amt;
		int n=0;
		n=input.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Please enter amount to withdrawl");
			amt=input.nextInt();
			if(amt%100==0)
			{
				if(amt>balance)
				{
					System.out.println("You dont have sufficient balance");
					break;
				}
				else
				{
			System.out.print("Transaction success please collect your " +amt+" rs");
			balance=balance-amt;
			break;
			}
			}else
			{
			System.out.println("please enter valid amount that is in multiple of 100");
			break;
			}
		case 2:
			System.out.println("1. 1000 wtd for cash\n 2.500 dpst cash\n 3.3000 wtd\n 4.5000 deposit\n 5.499 witdraw from atm");
			break;
		case 3:
			System.out.println("Please enter your current pin");
			int newPwd=0;
			int oldMatch=input.nextInt();
			if(pin==oldMatch)
	{
			 System.out.println("please enter your new pin");
			 newPwd=input.nextInt();		
			 
			 System.out.println("Confirm your pin");
			 if(newPwd==input.nextInt())
	{			pin=newPwd;
					System.out.println("pwd changed");
	}		else
	{
					System.out.println("pwd not matched");
	}
	}
			else
	{	
			System.out.println("you have entered wrong pin");
	}
			break;
			case 4:
			System.out.println("Please enter amount to deposit");
			amt=input.nextInt();
			if(amt%100==0)
	{
			System.out.println("You have sucessfully deposit the amount");
			balance=balance+amt;
	}
			else
	{
			System.out.println("Please deposit valid amount");
	}			
			
			break;
			case 5:
				System.out.println("Your available balance is: "+balance);
				break;
				
				case 6:
				t=false;
				System.out.println("\t\t**Thankyou***");
				break;
			default:
			System.out.println("you have enter wrong option");
	}
	}
	}	
}
	}	
	

		
		
		