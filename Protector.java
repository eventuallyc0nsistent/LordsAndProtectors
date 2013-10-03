import java.util.*;

/*
 The Protector Class
 */
abstract class Protector {
	

	/*
	the name of protector
	the strength of the protector
	employement status of the protector
	the Lord who hired the protector
	 */
	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;

	/*
	Constructor function for a Protector 
	set the name of the warrior and the strength that he has
	@param : the name of warrior
	@param : the strength of the warrior
	 */
	public Protector(String protectorName, double protectorStrength)
	{
		this.name = protectorName;
		this.strength = protectorStrength;
		this.employed = false;
		this.protectorsNoble = null;
	}

	/*
	get name of protector
	@return : String type name
	*/
	public String getName()
	{
		return name;
	}

	public abstract String fight();
	
	/* 
	get strength of protector 
	@return : double type strength
	*/
	public double getStrength()
	{
		return strength; 
	}

	/*
	set the strength for the protector
	@param : the strength calculated
	 */
	public void setStrength(double strength)
	{
		this.strength = strength; 
	}

	/*
	set Employed status for protector
	@param : employement status is set as true or false
	 */
	public void setEmployedStatus(Boolean status)
	{
		this.employed = status;
	}

	/*
	get the Employed status of the protector
	@return : boolean as true if employed else false
	 */
	public Boolean getEmployedStatus()
	{
		return this.employed;
	}

	/*
	set the Noble for the given protector
	@param : The Noble the protector is employed by
	 */
	public void setEmployer(Lord name)
	{
		this.protectorsNoble = name;
	}

	public Lord getEmployer()
	{
		return this.protectorsNoble;
	}

	/*
	runway to free employment status of protector
	 */
	public void runsaway()
	{
		if(this.getStrength()!=0)
		{
			// set employment status of protector to false
			this.setEmployedStatus(false);

			// remove protector from the list that he is hired in
			ArrayList<Protector> lordProtectors = this.protectorsNoble.getLordProtectors();
			lordProtectors.remove(this);

			// set the new strength of the Noble of the protector
			this.protectorsNoble.setArmyStrength(this.protectorsNoble.getArmyStrength());

			// Print who is running away from whom 
			System.out.println("So long "+this.protectorsNoble.getName()+". I'm out of here -- "+this.name);
		}

	}

}