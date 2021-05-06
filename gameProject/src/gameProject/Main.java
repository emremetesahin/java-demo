package gameProject;

public class Main {

	public static void main(String[] args) {
		Player player1=new Player();
		player1.setId(1);
		player1.setName("Emre");
		player1.setBirthOfYear("1997");
		player1.setNationalityId("300");
		player1.setPoint(100);
		PlayerService playerManager=new PlayerManager(new FakePersonCheckManager());
		playerManager.add(player1);
		
		Game game1=new Game(1,"Lol",100);
		GameService gameManager=new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1=new Campaign(1,"Bir alana hiç bedava",100);
		CampaignService campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		
		gameManager.sell(game1, campaign1, player1);
		gameManager.sell(game1,player1);

		


	
	}

}
