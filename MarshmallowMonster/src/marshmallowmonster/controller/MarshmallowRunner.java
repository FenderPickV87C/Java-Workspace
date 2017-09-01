package marshmallowmonster.controller;

import marshmallowmonster.model.*;

public class MarshmallowRunner 
{
	public static void main(String[] args)
	{
		Marshmallow myMarshmallow = new Marshmallow("Geralt", 6, 8, 3, false);
		System.out.println(myMarshmallow);
	}
}
