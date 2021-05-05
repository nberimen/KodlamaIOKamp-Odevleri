package managers;

import entities.User;
import services.IGamerService;

public class GamerManager implements IGamerService  {

	private GamerCheckManager gamerCheckManager;
	
	
	public GamerManager(GamerCheckManager gamerCheckManager) {
		this.gamerCheckManager = gamerCheckManager;
	}

	@Override
	public void save(User user) {
		if(gamerCheckManager.checkIfRealGamer(user)) {
			System.out.println("Gamer Kaydedildi: "+user.getFirstName());
		}
		else {
			System.out.println("Fake Kulanici..");
		}
	}

	@Override
	public void update(User user) {
		System.out.println("Gamer Guncellendi: "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Gamer Silindi: "+user.getFirstName());
		
	}



}
