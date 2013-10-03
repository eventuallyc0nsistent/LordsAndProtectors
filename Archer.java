import java.util.*;

class Archer extends Warrior
{

	/*
	name of the archer
	strength of the archer
	employement status of the archer
	the Noble who hired the archer
	 */

	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;

	/*
	The archer constructor
	@param : name String the name of the archer
	@param : strength double the strength of the archer
	 */
	public Archer(String name, double strength)
	{
		super(name,strength);
		
	}

	/*
	the battle cry of the archer
	@return : battleCry the cry of the archer!
	 */
	public String fight()
	{
		Lord employer = this.getEmployer();
		String battleCry = "TWANG!  "+this.getName()+" says: Take that in the name of my lord, "+employer.getName();
		return battleCry;
	}


}