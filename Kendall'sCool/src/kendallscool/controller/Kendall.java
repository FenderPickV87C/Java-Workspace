package kendallscool.controller;

public class Kendall 
{
	private String name;
	private int hotnesslevel;
	private boolean amazing;
	
	public Kendall()
	{
		name = "";
		hotnesslevel = 0;
		amazing = false;
	}
	
	public Kendall(String name, int hotnesslevel, boolean amazing)
	{
		this.name = name;
		this.hotnesslevel = hotnesslevel;
		this.amazing = amazing;
	}
	
	public String toString()
	{
		String str = "This person doesn't exist.";
		if (name != "")
		{
			str = name + " is so hot she is a " + hotnesslevel + " out of 10.";
			if (amazing)
			{
				str = str + " She is so fucking great. I love her.";
			}
			else
			{
				str = str + " She isn't that awesome actually...";
			}
		}
		return str;
	}
}
