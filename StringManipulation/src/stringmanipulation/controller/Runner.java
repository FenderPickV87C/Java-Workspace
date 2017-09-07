package stringmanipulation.controller;

public class Runner 
{
	public static void main(String[] args) 
	{
		StringCommands myProgram = new StringCommands();
		
		System.out.println(myProgram.orToOur("color"));
		
		WordReverser myReverser = new WordReverser();
		System.out.println(myReverser.reverse("Race Car"));
		
	}
}
