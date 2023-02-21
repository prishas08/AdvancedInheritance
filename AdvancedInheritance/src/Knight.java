
public class Knight extends Fighter {
	
	private int defense;
	
	public Knight(String s)
	{
		super(s);
		defense = 5;
		super.changeHitPoints(15);
	}
	
	public void changeHitPoints(int a)
	{
		super.changeHitPoints(a - defense);
	}
	
	public int attack()
	{	
		int d = super.attack() -2;
		if(d < 0)
			return 1;
		return d; 
	}

}
