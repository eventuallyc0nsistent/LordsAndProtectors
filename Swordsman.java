import java.util.*;

class Swordsman extends Protector
{
	public Swordsman(String name, double strength)
	{
		super(name,strength);
	}

	public void fight()
	{
		System.out.println("CLANG!  "+this.getName()+" says: Take that in the name of my lord, "+this.protectorsNoble.getName());
	}
}