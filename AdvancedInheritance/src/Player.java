
public class Player {

	private String name;
	private int hitPoints;	
	
	public Player()
	{		
		name = "Player";
		hitPoints = 50;
	}
	
	public Player(String n, int h)
	{			
		name = n;
		hitPoints = h;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getHitPoints()
	{
		return hitPoints;
	}
	
	public void changeHitPoints(int a)
	{
		hitPoints -= a;
	}
	
	public String battleCry()
	{
		return "To Battle!";
	}
	
	public String toString()
	{
		return "Name: " + name + "\n" + "Hit Points: " + hitPoints + "\n";
	}
	
	
}
