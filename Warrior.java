import java.util.*;

abstract class Warrior extends Protector{
	
	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;
	
	public Warrior (String name, double strength)
	{
		super(name,strength);
	}

	public abstract String fight();

}