package stringmanipulation.controller;

import java.util.Scanner;

public class StringCommands 
{
	Scanner myScanner = new Scanner(System.in);
	
	public StringCommands()
	{
		
	}
	
	public void charles()
	{
		System.out.println("Enter your name:");
		String reply = myScanner.nextLine();
		if (reply.equalsIgnoreCase("Charles"))
		{
			System.out.println("Hi, Charles!");
		}
		else
		{
			System.out.println("I don't know you! Where is Charles?");
		}
	}
}
