import java.util.* ;

/*
 The Noble Class
 */
abstract class Noble {

	/*
	the name of noble
	the strength of the noble's army
	status of death of the noble
	 */
	protected String name;
	protected double armyStrength;
	protected Boolean dead;
	
	/*
	Constructor function for a Noble
	We set then name of the noble man
	We set that Noble is not dead
	@param : String type of name
	 */
	public Noble(String nobleName)
	{
		this.name = nobleName;
		this.dead = false;
	}

	/*
	Fetches the Name of the Noble man
	@return : name String name of Noble
	 */
	public String getName()
	{
		return this.name;
	}

	/*
	check if the Nobleman is dead 
	@return : Boolean value of the Noble's dead status 
	 */
	public Boolean isDead()
	{
		return this.dead;
	}

	/*
	abstract class to killArmy of Noble
	 */
	public abstract void killArmy();

	/*
	For the Nobles who win but have hurt themselves in battle
	@param : armyStrengthRatio is the ratio by which every warrior in Lord/PersonWithStrength will hurt himself in battle
	 */
	public abstract void hurtArmy(double armyStrengthRatio);

	//abstract class to get the strength of the army
	public abstract double getArmyStrength();

	//abstract class to set the strength of the army
	public abstract void setArmyStrength(double strength);

	/*
	when a noble goes to battle with an enemy
	@param : enemy Noble
	 */
	/*
	when a noble goes to battle with an enemy
	@param : enemy Noble
	 */
	public void battle(Noble enemy)
	{
		System.out.println(this.name+" battles "+enemy.name);

		// check if the enemy is dead already before battle
		if(enemy.isDead() || this.isDead())
		{
			if(this.isDead() && enemy.isDead())
			{
				System.out.println("Oh, NO! They're both dead!  Yuck!");
			}
			else if (enemy.isDead()) 
			{
				System.out.println("He's dead "+this.name);
			}
			else 
			{
				System.out.println("He's dead "+enemy.name);
			}
		} 
		else 
		{
			// eqaul strength of armies
			if(this.armyStrength == enemy.armyStrength)
			{
				// kill both armies in battle
				this.killArmy();
				enemy.killArmy();

				System.out.println("Mutual Annihilation: "+this.name+" and "+enemy.name+" die at each other's hands");

			}
			// noble's strength of army greater than enemy
			else if(this.armyStrength > enemy.armyStrength)
			{
				System.out.println(this.armyStrength);
				System.out.println(enemy.armyStrength);
				double armyStrengthRatio = (enemy.armyStrength/this.armyStrength);
				
				// since enemy is overpowered - KILL HIM
				// but the noble is hurt by the ratio
				enemy.killArmy();
				this.hurtArmy(armyStrengthRatio);
				
				System.out.println(this.name+" defeats "+enemy.name);

			}
			// enemy's strength of army greater than noble's
			else 
			{
				System.out.println(this.armyStrength);
				System.out.println(enemy.armyStrength);
				double armyStrengthRatio = (this.armyStrength/enemy.armyStrength);
				
				// since Noble is overpowered - KILL HIM
				// but the enemy is hurt by the ratio
				this.killArmy();
				enemy.hurtArmy(armyStrengthRatio);
				
				System.out.println(enemy.name+" defeats "+this.name);

			}


		}

	}

}
