package cebyrdfootball.controller;

import cebyrdfootball.model.*;

public class TeamRunner 
{
	public static void main(String[] args)
	{
		Team myTeam = new Team("Yellow Jackets", 1.0, 60, false);
		System.out.println(myTeam);
		
		Team otherTeam = new Team("Stallions", 9000.0, 55, true);
		System.out.println(otherTeam);
		
		
	}
}
