import java.util.*;

class Wizard extends Protector
{

	/*
	name of the wizard
	strength of the wizard
	employement status of the wizard
	the Noble who hired the wizard
	 */
	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;

	/*
	The wizard constructor
	@param : name String the name of the wizard
	@param : strength double the strength of the wizard
	 */
	public Wizard(String name, double strength)
	{
		super(name,strength);
		
	}

	/*
	the battle cry of the wizard
	@return : battleCry the cry of the warrior!
	 */
	public String fight()
	{
		String battleCry = "POOF!";
		return battleCry;
	}

	
}