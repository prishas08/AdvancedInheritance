
public class Mage extends Player {

	public Mage(String s) 
	{
		super(s, 75); 
	}
	
	public int castSpell()
	{
		return (int)(Math.random() * 31) + 5; 
	}
	
	public String battleCry()
	{
		return "Yol Toor Shol";
	}
	
	public String toString()
	{
		return "Class: Mage\n" + super.toString();
	}
	
}
