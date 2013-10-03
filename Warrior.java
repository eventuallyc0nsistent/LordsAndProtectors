import java.util.*;

/*
abstract class Warrior who extends protectors
 */
abstract class Warrior extends Protector{
	
	/*
	name of the warrior
	strength of the warrior
	employement status of the warrior
	the Noble who hired the warrior
	 */
	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;
	
	/*
	The warrior constructor
	@param : name String the name of the Warrior
	@param : strength double the strength of the warrior
	 */
	public Warrior (String name, double strength)
	{
		super(name,strength);
	}

	// the battle cry of the warrior
	public abstract String fight();

}