package managers;

import entities.Campaign;
import entities.Game;
import entities.Gamer;
import services.ISalesService;

public class SalesManager implements ISalesService {

	private Campaign campaing;
	
	public SalesManager() {
		
	}
	public SalesManager(Campaign campaign) {
		this.campaing=campaign;
	}
	@Override
	public void sell(Game game, Gamer gamer) {
		if(campaing!=null) {
		double price=game.getPrice();
		double discount=campaing.getDiscount();
		double indirimliFiyati=price-(price*discount)/100;
		
		System.out.println("Kampanya uygulandi..");
		System.out.println("Oyun Fiyati: "+price);
		System.out.println("Kampanya yuzde orani: "+ discount);
		System.out.println("Kampanya indirim orani: "+ (price*discount)/100);
		System.out.println("indirimli fiyati: "+indirimliFiyati);
		}else {
			System.out.println("Kampanya mevcut degill");
		}
		
		System.out.println("Game: "+game.getName());
		System.out.println("Gamer: "+gamer.getFirstName());
	}

}
