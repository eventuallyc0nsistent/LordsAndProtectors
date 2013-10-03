import java.util.*;

class Archer extends Warrior
{

	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;

	public Archer(String name, double strength)
	{
		super(name,strength);
		
	}

	public String fight()
	{
		Lord employer = this.getEmployer();
		String battleCry = "TWANG!  "+this.getName()+" says: Take that in the name of my lord, "+employer.getName();
		return battleCry;
	}


}