package cebyrdfootball.model;

public class Player extends Team 
{
	private String playerName;
	private int playerNumber;
	private int age;
	private double height;
	private double weight;
	private boolean startingPlayer;
	
	public Player()
	{
		playerName = "";
		playerNumber = 0;
		age = 0;
		height = 0.0;
		weight = 0.0;
		startingPlayer = false;
	}
	
	public Player(String playerName, int playerNumber, int age, double height, double weight, boolean startingPlayer)
	{
		this.playerName = playerName;
		this.playerNumber = playerNumber;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.startingPlayer = startingPlayer;
	}
}
