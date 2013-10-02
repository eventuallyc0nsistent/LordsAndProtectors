import java.util.*;

class Wizard extends Protector
{
	public Wizard(String name, double strength)
	{
		super(name,strength);
	}

	public void fight()
	{
		System.out.println("POOF!");
	}
}