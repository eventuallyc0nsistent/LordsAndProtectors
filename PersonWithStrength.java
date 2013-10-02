class PersonWithStrength extends Noble{

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

}