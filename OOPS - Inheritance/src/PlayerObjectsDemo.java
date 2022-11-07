
public class PlayerObjectsDemo {

	public static void main(String[] args) {
		
		Player sachin = new Player();
		sachin.name = "Sachin Tendulkar";
		sachin.sport = "Cricket";
		sachin.noOfMatches = 420;
		
		sachin.display();
		
		Player stefi = new Player();
		stefi.name = "Stefi Graf";
		stefi.sport = "Tennis";
		stefi.noOfMatches = 200;
		stefi.display();
		
		CricketBatsman kohli = new CricketBatsman();
		
		// Properties
		kohli.name = "Virat Kohli";
		kohli.average = 55.5F;
		kohli.noOfMatches = 350;
		kohli.noOf100s = 40;
		kohli.noOf50s = 70;
		
		// Methods
//		kohli.hitSix();
//		kohli.takeASingle();
		kohli.display();
		
		/*CricketBatsman hardhik = new CricketBatsman();
		
		hardhik.name = "Hardhik Pandya";
		hardhik.average = 33.67F;
		kohli.noOfMatches = 180;
		
		CricketBowler bumra = new CricketBowler();
		bumra.name = "Bumra";
		bumra.average = 20;
		bumra.noOfMatches = 250;
		
//		bumra.takeWicket();
		bumra.display();
		*/
	}
}
