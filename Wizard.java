import java.util.*;

class Wizard extends Protector
{
	public Wizard(String name, double strength)
	{
		super(name,strength);
		
	}

	public String fight()
	{
		String battleCry = "POOF!";
		return battleCry;
	}

	private String name;
	private double strength;
	private Boolean employed;
	private Lord protectorsNoble;
}