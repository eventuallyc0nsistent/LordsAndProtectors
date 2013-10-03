import java.util.* ;

class Lord extends Noble {

	/*
	the name of Lord
	the strength of the noble's army
	status of death of the noble
	A list of Protectors for a Lord
	 */
	private String name;
	private double armyStrength;
	private Boolean dead;
	private ArrayList<Protector> lordProtectors = new ArrayList<Protector>();

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
	@return : the strength of the army for the given Lord
	 */
	public double getArmyStrength()
	{
		this.armyStrength = 0;

		// sum the strength of all the warriors of the given Lord
		for(Protector p:this.getLordProtectors())
		{
			this.armyStrength = this.armyStrength + p.getStrength() ;
			
		}

		return this.armyStrength;
	}

	/*
	For the Lord we set the strength of the army he has
	@param : the strength of the army 
	 */
	public void setArmyStrength(double strength)
	{
		this.armyStrength = strength;
	}

	/*
	add Protectors to list for a given Lord
	@param : The Protector the Lord hires
	 */
	public void hire(Protector protector)
	{
		// check if the protector trying to be hired is Employed or not
		if(!protector.getEmployedStatus() && !this.isDead())
		{
			//set protector employment status 'true' to when hired
			protector.setEmployedStatus(true);

			// for the given protector set his employer to the Lord who hired him
			protector.setEmployer(this);

			// add to nobleProtector list for the given Lord and add protectors strength to armyStrength
			this.addLordProtectors(protector);

			// increment the armyStrength for the noble by adding a protectors strength
			this.armyStrength = this.armyStrength + protector.getStrength();
		
		} 

		// if the Protector is already hired
		else 
		{
			System.out.println(this.getName()+" could not hire "+protector.getName()+" !");
		}

	}

	/*
	to kill the Army of a Lord
	 */
	public void killArmy()
	{
		// set the dead status of the Lord to 'true'
		this.setDead(true);

		// for all Protectors of the given Lord
		for(Protector p:this.getLordProtectors())
		{
			// set the strength of the Protector to 0
			p.setStrength(0);

			// battle cry of the Protector !
			System.out.println(p.fight());
		}

	}

	/*
	List all the Protectors of a given Lord
	@return : the list of protectors in the ArrayList
	 */
	public ArrayList<Protector> getLordProtectors()
	{
		return this.lordProtectors;
	}

	/*
	Add theProtectors to the Lords list
	@param : protector to be added
	 */
	public void addLordProtectors(Protector p)
	{
		this.lordProtectors.add(p);
	}

	/*
	For the Nobles who win but have hurt themselves in battle
	@param : armyStrengthRatio is the ratio by which every warrior will hurt himself in battle
	 */
	public void hurtArmy(double armyStrengthRatio)
	{
		// for all Protectors for the given Lord
		for(Protector p:this.getLordProtectors())
		{
			// // set the strength of the protector
			double protectorStrength = p.getStrength() - armyStrengthRatio*p.getStrength();
			p.setStrength(protectorStrength);

			//battle cry of the Protector !
			System.out.println(p.fight());
		}

	}


	/*
	 To override the toString method of the Nobles Class
	 Append all results to StringBuilder and display when called for the Noble
	 */
	@Override public String toString()
	{

		StringBuilder result = new StringBuilder();
		result.append(this.getName()+" has an army of "+this.getLordProtectors().size()+"\n");

		for(Protector p:getLordProtectors())
		{
			result.append("\t"+p.getName()+": "+p.getStrength()+"\n");
		}

		return result.toString();
	}


}