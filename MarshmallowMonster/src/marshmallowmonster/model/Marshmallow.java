package marshmallowmonster.model;

public class Marshmallow 
{ 
	private String monsterName;
	private int eyes;
	private int arms;
	private double legs;
	private boolean buttons;
	
	public Marshmallow()
	{
		monsterName = "";
		eyes = 0;
		arms = 0;
		legs = 0.0;
		buttons = false;
	}
	
	public Marshmallow(String monsterName, int eyes, int arms, double legs, boolean buttons)
	{
		this.monsterName = monsterName;
		this.eyes = eyes;
		this.arms = arms;
		this.legs = legs;
		this.buttons = buttons;
	}
	
	public String toString()
	{
		String str = "";
		if (monsterName != "")
		{
			str = monsterName + " has " + eyes + " eyes, " + arms + " arms and, " + legs + " legs.";
			if (buttons)
			{
				str = str + " He is trying to be extremely terrifying, but his buttons only make his efforts adorable. ";
			}
			else
			{
				str = str + " He is extremely terrifying! ";
			}
		}
		return str;
	}
}
