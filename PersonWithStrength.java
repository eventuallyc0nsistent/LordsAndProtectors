class PersonWithStrength extends Noble{
	/*
	the name of noble
	the strength of the noble's army
	status of death of the noble
	 */
	private String name;
	private double armyStrength;
	private Boolean dead;
	
	public PersonWithStrength(String name,double armyStrength)
	{
		super(name);
		this.armyStrength = armyStrength;
	}

	public void killArmy()
	{
		setDeadStatus(true);
	}


	public void hurtArmy(double armyStrengthRatio)
	{
		double strength;
		strength = this.getArmyStrength() - armyStrengthRatio*this.getArmyStrength();
		this.setArmyStrength(strength);
	}

	/*
	Fetches the strength of the army of the Noble by adding the strength of the warriors
	@return : the strength of the army for the given Noble
	 */
	public double getArmyStrength()
	{
		return this.armyStrength;
	}

	public void setArmyStrength(double strength)
	{
		this.armyStrength = strength;
	}

	public void setDeadStatus(Boolean state)
	{
		// set the dead status of the Noble man to 'true'
		this.dead = state;
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