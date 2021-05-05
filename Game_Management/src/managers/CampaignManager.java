package managers;

import entities.Campaign;
import services.ICampaingService;

public class CampaignManager implements ICampaingService {
	
	@Override
	public void save(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya Kaydedildi: "+campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya Guncellendi: "+campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya Silindi: "+campaign.getName());
	}

}
