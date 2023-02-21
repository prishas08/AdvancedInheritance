
public class Fighter extends Player {		
	
	public Fighter(String s)
	{		
		super(s, 150); 
	}
	
	public Fighter(String s, int hp)
	{
		super(s, hp);
	}
	
	public int attack()
	{		    
		return (int)(Math.random() * 18) + 1; 
	}
	
	public String battleCry()
	{
		return "Taste my steel!";
	}
	
	public String toString()
	{
		return "Class: Fighter\n" + super.toString();
	}
}
