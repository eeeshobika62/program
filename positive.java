package logic;

import java.util.Scanner;

public class positive {
	
	public static void main(String[] args) {
		
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int a= s.nextInt();
		if(a>0)
		{
			System.out.println("The given number is positive number");
			
		}
		else if(a<0)
		{
			System.out.println("The given number is negative number ");
		}
		else if(a==0)
		{
			System.out.println("neither positive or negative");
		}
		
		
		
	}
	

}
