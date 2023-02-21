
public class Thief extends Player {
	
	public Thief(String s)
	{		
		super(s, 100); 
	}	
	
	public int backStab()
	{		    
		return (int)(Math.random() * 36) + 1; 
	}
	
	public String battleCry()
	{
		return "To the shadows!";
	}
	
	public String toString()
	{
		return "Class: Thief\n" + super.toString();
	}

}
