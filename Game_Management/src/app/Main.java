package app;

import entities.Campaign;
import entities.Game;
import entities.Gamer;
import managers.CampaignManager;
import managers.GamerCheckManager;
import managers.GamerManager;
import managers.SalesManager;

public class Main {
	public static void main(String[] args) {
		Gamer gamer1 =new Gamer();
		gamer1.setFirstName("Necati");
		Game game1=new Game(1,"Valorant", 150);
		
		Campaign campaign1=new Campaign(1,"Kodlama.Io Kampanyasi",90);
		
		SalesManager salesManager=new SalesManager(campaign1);
		
		salesManager.sell(game1,gamer1);
		System.out.println("------------------------------------------------");
		
		GamerCheckManager gamerCheckManager=new GamerCheckManager();
		
		GamerManager gamerManager1=new GamerManager(gamerCheckManager);
		gamerManager1.save(gamer1);
		System.out.println("------------------------------------------------");
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.save(campaign1);
	}

}
