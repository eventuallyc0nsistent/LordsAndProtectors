import java.util.* ;

/*
 The Noble Class
 */
abstract class Noble {

	/*
	the name of noble
	the strength of the noble's army
	status of death of the noble
	A list of Protectors for a Lord
	 */
	private String name;
	private double armyStrength;
	private Boolean dead;

	private ArrayList<Protector> lordProtectors = new ArrayList<Protector>();
	
	/*
	Constructor function for a Noble
	We set then name of the noble man
	We set that Noble is not dead
	@param : nobleName String name of the Noble
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
	@return : Boolean value of the Noble's dead status - true when dead
	 */
	public Boolean isDead()
	{
		return this.dead;
	}

	/*
	set the noble status to the value
	@param status Boolean the status of the Noble
	 */
	public void setDead(Boolean status)
	{
		this.dead = status;
	}

	/*
	kill the army in the battle
	 */
	public abstract void killArmy();

	/*
	For the Nobles who win but have hurt themselves in battle
	@param : armyStrengthRatio is the ratio by which every warrior in Lord or PersonWithStrength will hurt himself in battle
	 */
	public abstract void hurtArmy(double armyStrengthRatio);

	/*
	abstract class to get the strength of the army
	@return : double armyStrength will be a decimal value
	 */
	public abstract double getArmyStrength();

	/* 
	abstract class to set the strength of the army
	@param : strength double will be set to the decimal value
	*/
	public abstract void setArmyStrength(double strength);

	/*
	when a noble goes to battle with an enemy
	@param : enemy Noble
	 */
	public void battle(Noble enemy)
	{
		System.out.println(this.name+" battles "+enemy.name);

		// check if Nobles are dead already before battle
		if(enemy.isDead() || this.isDead())
		{
			// check if both are dead
			if(this.isDead() && enemy.isDead())
			{
				System.out.println("Oh, NO! They're both dead!  Yuck!");
			}

			// check if enemy is dead
			else if (enemy.isDead()) 
			{
				System.out.println("He's dead "+this.name);
			}

			// check if the noble who started battle is dead
			else 
			{
				System.out.println("He's dead "+enemy.name);
			}
		} 
		else 
		{
			// eqaul strength of armies
			if(this.getArmyStrength() == enemy.getArmyStrength())
			{
				// kill both armies in battle
				this.killArmy();
				enemy.killArmy();

				System.out.println("Mutual Annihilation: "+this.name+" and "+enemy.name+" die at each other's hands");

			}

			// noble whose started battle's strength of army greater than enemy army
			else if(this.getArmyStrength() > enemy.getArmyStrength())
			{
				double enemyArmyStrength = enemy.getArmyStrength();
				double fighterArmyStrength = this.getArmyStrength();
				double armyStrengthRatio = (fighterArmyStrength/enemyArmyStrength);

				// since enemy is overpowered - KILL HIM
				// but the noble is hurt by the ratio
				enemy.killArmy();
				this.hurtArmy(armyStrengthRatio);
				
				System.out.println(this.name+" defeats "+enemy.name);

			}
			
			// enemy's strength of army greater than noble whose started battle's
			else 
			{
				double enemyArmyStrength = enemy.getArmyStrength();
				double fighterArmyStrength = this.getArmyStrength();
				double armyStrengthRatio = (fighterArmyStrength/enemyArmyStrength);
				
				// since Noble is overpowered - KILL HIM
				// but the enemy is hurt by the ratio
				this.killArmy();
				enemy.hurtArmy(armyStrengthRatio);
				
				System.out.println(enemy.name+" defeats "+this.name);

			}

		}

	}

}
