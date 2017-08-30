package cebyrdfootball.model;

public class Team 
{
	private String teamName;
	private double avgPPG;
	private int numberOfPlayers;
	private boolean winningRecord; 
	
	public Team()
	{
		teamName = " ";
		avgPPG = 0.0;
		numberOfPlayers = 0;
		winningRecord = false;
	}
	
	public Team(String teamName, double avgPPG, int numberOfPlayers, boolean winningRecord)
	{
		this.teamName = teamName;
		this.avgPPG = avgPPG;
		this.numberOfPlayers = numberOfPlayers;
		this.winningRecord = winningRecord;
	}
	
	public String toString()
	{
		String str = "This team doesn't exist.";
		if (teamName != "")
		{
			str = teamName + "has" + numberOfPlayers + "and is scoring" + avgPPG;
		}
		return str;
	}
}
