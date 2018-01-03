package runner;

import bean.Flower;
import logic.BotanicEncyclopedia;
import logic.FortuneTeller;

public class MainApp {

	public static void main(String[] args) {

		
		BotanicEncyclopedia enc = new BotanicEncyclopedia();
		Flower flower = new Flower("Commomile", 20, 1);

		//System.out.println("-------------------------------------------");
		//System.out.println("New flower born");
		//enc.printFlowerIn(flower);

		//System.out.println("-------------------------------------------");
		//System.out.println("New flower grow");
		flower.grow(25, 3, 5);
		//enc.printFlowerIn(flower);

		//System.out.println("-------------------------------------------");
		//System.out.println("New flower bloom");
		flower.bloom(8, "yellow");
		//enc.printFlowerIn(flower);

		//System.out.println("-------------------------------------------");
		//System.out.println("Flower wither");
		flower.wither(4, 1, 0, "grey");
		//enc.printFlowerIn(flower);
		
	
		FortuneTeller witcher = new FortuneTeller();
		witcher.predictWithFlower(flower);
	}

}
