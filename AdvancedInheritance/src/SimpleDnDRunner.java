import java.util.ArrayList;

public class SimpleDnDRunner {
	
	public static void shout(Player p)
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println(p.battleCry());
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Player> party = new ArrayList<Player>();
		party.add(new Fighter("Bob"));
		party.add(new Mage("Azura"));
		party.add(new Thief("Betty"));
		party.add(new Healer("Tom"));
		
		Fighter f1 = new Fighter("Bill");
		shout(f1);
		
		Thief th1 = new Thief("Arnie");
		shout(th1);
		
		Player p1 = new Fighter("Bob");			
		System.out.println(((Fighter)p1).attack());
		p1.changeHitPoints(10);	
		
		Knight p2 = new Knight("Bob");
		Player p3 = (Player)p2;
		Fighter p4 = (Fighter) p2;
		
		Player p5 = new Knight("Kim");
		Fighter p6 = (Fighter)p5;
		Knight p7 = (Knight)p5;
		//Thief p8 = (Thief)p5; //Runtime error not compile time
		
		Player p9 = new Fighter("Tory");
		//Player p10 = (Knight)p9; //error
		




	}

}
