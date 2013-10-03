import java.util.*;

class Swordsman extends Warrior
{
	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;

	public Swordsman(String name, double strength)
	{
		super(name,strength);

		
	}

	public String fight()
	{
		Lord employer = this.getEmployer();
		String battleCry = "CLANG!  "+this.getName()+" says: Take that in the name of my lord, "+employer.getName();
		return battleCry;
	}
	
}