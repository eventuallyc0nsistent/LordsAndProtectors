import java.util.*;

class Swordsman extends Warrior
{
	/*
	name of the swordsman
	strength of the swordsman
	employement status of the swordsman
	the Noble who hired the swordsman
	 */
	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;

	/*
	The swordsman constructor
	@param : name String the name of the swordsman
	@param : strength double the strength of the swordsman
	 */
	public Swordsman(String name, double strength)
	{
		super(name,strength);

		
	}

	/*
	the battle cry of the swordsman
	@return : battleCry the cry of the swordsman!
	 */
	public String fight()
	{
		Lord employer = this.getEmployer();
		String battleCry = "CLANG!  "+this.getName()+" says: Take that in the name of my lord, "+employer.getName();
		return battleCry;
	}
	
}