class PersonWithStrength extends Noble{
	
	/*
	the name of PersonWithStrength
	the strength of the PersonWithStrength
	status of death of the PersonWithStrength
	 */
	private String name;
	private double armyStrength;
	private Boolean dead;
	
	/* 
	constructor for PersonWithStrength from super Class Noble
	@param : name String The name of the Noble
	*/
	public PersonWithStrength(String name,double armyStrength)
	{
		super(name);
		this.armyStrength = armyStrength;
	}

	/*
	to kill the Army of a PersonWithStrength
	 */
	public void killArmy()
	{
		this.setDead(true);
	}

	/*
	For the Nobles who win but have hurt themselves in battle
	@param : armyStrengthRatio is the ratio by which PersonWithStrength will hurt himself in battle
	 */
	public void hurtArmy(double armyStrengthRatio)
	{
		double strength;
		strength = this.getArmyStrength() - armyStrengthRatio*this.getArmyStrength();
		this.setArmyStrength(strength);
	}

	/*
	Fetches the strength of the army of the Noble by getting Person with Strength's strength
	@return : the strength of the army for the given Noble
	 */
	public double getArmyStrength()
	{
		return this.armyStrength;
	}

	/*
	For the PersonWithStrength we set the strength of the army he has
	@param : the strength of the army 
	 */
	public void setArmyStrength(double strength)
	{
		this.armyStrength = strength;
	}


	/*
	 To override the toString method of the Nobles Class
	 Append all results to StringBuilder and display when called for the Noble
	 */
	@Override public String toString(){

		StringBuilder result = new StringBuilder();
		result.append(this.getName()+" : "+this.getArmyStrength()+"\n");

		return result.toString();
	}

}