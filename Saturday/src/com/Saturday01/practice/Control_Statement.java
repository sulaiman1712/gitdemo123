package com.Saturday01.practice;

public class Control_Statement 
{
	public static void main(String[] args) 
	{
			
		int age=17;
		


		if(age>18)    //10<=18
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("He/She is not Eligible to vote");
		}
		
		
		
		//CAR PARKING
		
	    int onehour=25;  //for one hour
		int twohour=30;
		int threehour=35;

		
		
		int TotalTiming=2;
		
		
		
		if(TotalTiming<=1)
		{
			int charges1=onehour*1;
			System.out.println("Charges for one hour:"+charges1);
		}
		else if(TotalTiming<=2)
		{
			int charges2=twohour*2;
			System.out.println("Charges for two hour:"+charges2);
		}
		else if(TotalTiming<=3)
		{
			int charges3=threehour*3;
			System.out.println("Charges for three hour:"+charges3);
		}
		else if(TotalTiming<=4)
		{
			int charges4=threehour*4;
			System.out.println("Charges for four hour:"+charges4);
		}
		else
		{
			int charges4=150;
			System.out.println("fullday charges:"+charges4);
		}
		
		
		
		
		int a=5596;
		
		int b=10569;
		
		int c=4569;
		
		if((a>b)&&(a>c))//  f  &&  f
		{
			System.out.println("A is greater:"+a );
		}
		else if((b>a) && (b>c)) //  t && f
		{
			System.out.println("B is greater:"+b);
		}
		else
		{
			System.out.println("C is greater:"+c);
		}
		
		
		
		
		
		
		
		//do-while while forloop
		
		
		
		int a1=10;
		while(a1<=14)
		{
			
			System.out.println("MOHAN G");
			a1++;
			
		}
		// 11>15
		
		for (int b1 = 1; b1 <=5; b1++)
		{
			System.out.println("Mohan Raj");
			
		}
		
		//4 3 2 1  
		//4 3 2
		//4 3
		//4
		
		for (int i = 1; i <=4; i++) //1<=4   2<=4  3<=4  4<=4  5<=4
		{
			for (int j = 4; j >=i; j--)  //4>=1  3>=1  2>=1  1>=1
			{                            //4>=2
				                        //4>=3
				System.out.print(j);    // 4  3  2  1
			}                           // 4  3  2
			System.out.println();       // 4  3 
		}                               // 4 
		
		
		//1 2 3 4
		//1 2 3
		//1 2
		//1
		//
		//
		
		for (int i =4 ; i >=1; i--) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		
		for (int j = 1; j <=4; j++) 
		{
			System.out.println();// 1 2 3 4
			
		}
		
		
		
		
		
		
		

	}

	
}
