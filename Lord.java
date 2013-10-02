import java.util.* ;

class Lord extends Noble {

	// A list of Protectors for a Lord
	ArrayList<Protector> lordProtectors = new ArrayList<Protector>();

	/* 
	constructor for Lord from super Class Noble
	@param : name String The name of the Noble
	*/
	public Lord(String name)
	{
		super(name);
	}
	

	/*
	Fetches the strength of the army of the Noble by adding the strength of the warriors
	@return : the strength of the army for the given Noble
	 */
	public double getArmyStrength()
	{
		// sum the strength of all the warriors of the given Noble
		for(Protector p:this.lordProtectors)
		{
			this.armyStrength = 0;
			this.armyStrength = this.armyStrength + p.getStrength() ;
			
		}

		return this.armyStrength;
	}

	/*
	For the Nobleman we set the strength of the army he has
	@param : the strength of the army 
	 */
	public void setArmyStrength(double strength)
	{
		this.armyStrength = strength;
	}

	/*
	add warriors to list for a given Noble
	@param : The warrior the Noble hires
	 */
	public void hire(Protector protector)
	{
		// check if the protector trying to be hired is Employed or not
		if(!protector.getEmployedStatus())
		{
		
			//set protector employment status 'true' to when hired
			protector.setEmployedStatus(true);

			// for the given protector set his employer to the Nobleman who hired him
			protector.setEmployer(this);

			// add to nobleProtector list for the given Noble and add protectors strength to armyStrength
			lordProtectors.add(protector);

			// increment the armyStrength for the noble by adding a protectors strength
			this.armyStrength = this.armyStrength + protector.getStrength();
		
		} else 
		{
			System.out.println(protector.getName()+" has been already hired, "+this.getName()+" !");
		}

	}



	/*
	to kill the Army of a Noble
	 */
	public void killArmy()
	{
		// set the dead status of the Noble man to 'true'
		this.dead = true;

		// for all warriors of the given Noble
		for(Protector p:this.lordProtectors)
		{
			// set the strength of the warrior to 0
			p.setStrength(0);
		}

	}

	/*
	For the Nobles who win but have hurt themselves in battle
	@param : armyStrengthRatio is the ratio by which every warrior will hurt himself in battle
	 */
	public void hurtArmy(double armyStrengthRatio)
	{

		for(Protector p:this.lordProtectors)
		{
			// set the strength of the protector
			double protectorStrength = p.getStrength() - armyStrengthRatio*p.getStrength();
			p.setStrength(protectorStrength);
			p.fight();
		}

	}


	/*
	 To override the toString method of the Nobles Class
	 Append all results to StringBuilder and display when called for the Noble
	 */
	@Override public String toString(){

		StringBuilder result = new StringBuilder();
		result.append(this.getName()+" has an army of "+this.lordProtectors.size()+"\n");

		for(Protector p:lordProtectors)
		{
			result.append("\t"+p.getName()+": "+p.getStrength()+"\n");
		}

		return result.toString();
	}


}