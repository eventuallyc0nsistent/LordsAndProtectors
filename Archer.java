import java.util.*;

class Archer extends Protector
{
	public Archer(String name, double strength)
	{
		super(name,strength);
	}

	public void fight()
	{
		System.out.println("TWANG!  "+this.getName()+" says: Take that in the name of my lord, "+this.protectorsNoble.getName());
	}
}