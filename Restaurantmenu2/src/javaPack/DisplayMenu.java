package javaPack;

public class DisplayMenu 
{
	public DisplayMenu()
	{
		String title = "Welcome to the Restaurant \n";
		String line = "--------------------------\n\n";
		
		String bmenu = "Breakfast Menu:\n"; 
		bmenu += "\t1. Pancakes --------- $4.50 \n ";
		bmenu += "\t2. Scrambled eggs --- $2.00 \n ";
		bmenu += "\t3. Bacon  ----------- $2.50 \n ";
		bmenu += "\t4. Bagel  ----------- $4.50 \n ";
		bmenu += "\t3. Waffles  --------- $4.50 \n"
				+ "-----------------------------------\n ";
		
		String lmenu = "Lunch Menu:\n"; 
		lmenu += "\t1. Ham Sandwhich ---- $4.50 \n ";
		lmenu += "\t2. Salad ------------ $8.50 \n ";
		lmenu += "\t3. Soup  ----------- $13.50 \n ";
		lmenu += "\t4. Burger ----------- $8.00 \n ";
		lmenu += "\t3. Rice  ----------- $15.50 \n "
				+ "-----------------------------------\n ";
		
		String dmenu = "Dinner Menu:\n"; 
		dmenu += "\t1. Spaghetti -------- $4.50 \n ";
		dmenu += "\t2. Lasagna ---------- $2.00 \n ";
		dmenu += "\t3. Steak  ----------- $2.50 \n ";
		dmenu += "\t4. Chicken  --------- $4.50 \n ";
		dmenu += "\t3. Burrito  --------- $4.50 \n"
				+ "-----------------------------------\n ";
		
		String quote = "\"yay\"\n\n";
		
		String fullmsg = title + line + bmenu + lmenu + dmenu + quote;
		System.out.println(fullmsg);
		
	}
	
	
	

}