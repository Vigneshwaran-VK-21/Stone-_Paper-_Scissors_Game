package javatrining;
import java.util.Scanner;
public class Day3_project_Game_of_st_pa_sr {
	
	public static int playerChoice()
	{
		System.out.println("Enter your Choice:");
		int me = new Scanner(System.in).nextInt();
		return me;
	}
	public static int computerChoice()
	{
		int computer = (int)(Math.random()*3);
		return computer;
	}
	public static void displaycomChoice(int computer) 
	{
		switch(computer) 
		{
			case 0:
			System.out.println("Computer choice: Stone");
			break;
			case 1:
			System.out.println("Computer choice: paper");
			break;
			case 2:
			System.out.println("Computer choice: Scissors");
		}
		
	}
	
	public static void displaymychoice(int me) 
	{
		if(me == 0)
			System.out.println("Your choice: Stone");
		else if(me == 1)
			System.out.println("Your  choice: paper");
		else 
			System.out.println("Your  choice: Scissors");	
	}
	public static void main(String[] args) 
	{
		//stone-- 0
		//paper-- 1
		//Scissors --2
		
		char choice;
		do{
			int computer = computerChoice();
			int me = playerChoice();
			
			displaycomChoice(computer);
			displaymychoice(me);	
			
			if(computer==0) //stone
		{
			if(me == computer) 
				System.out.println("Match Draw");
			else if (me == 1) 
				System.out.println(" You Win");
			else 
				System.out.println("Computer Win");
				
		}
		else if(computer==1) //paper
		{ 
			if(me == computer) 
				System.out.println("Match Draw");
			else if (me == 2) 
				System.out.println(" You Win");
			else 
				System.out.println("Computer Win");
				
		}
		else {

			if(me == computer) //Scissors
				System.out.println("Match Draw");
			else if (me == 0) 
				System.out.println(" You Win");
			else 
				System.out.println("Computer Win");
				
		}
		System.out.println("Do You Want To Continue Or Not:Y/N");
		choice = new Scanner(System.in).next().charAt(0);
		}while(choice!='N');	
		}
	}

