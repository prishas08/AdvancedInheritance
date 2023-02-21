import java.util.ArrayList;

public class Healer extends Player {
	
	public Healer(String s)
	{		
		super(s, 120); 
	}	
	
	public void heal(ArrayList<Player> group)
	{
		for(Player p: group)
		{
			p.changeHitPoints(-25);
		}
	}
	
	public String battleCry()
	{
		return "You guys go get hurt!";
	}
	
	public String toString()
	{
		return "Class: Healer\n" + super.toString();
	}

}
