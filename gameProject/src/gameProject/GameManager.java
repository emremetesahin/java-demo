package gameProject;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: " + game.getName());

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: " + game.getName());

	}

	@Override
	public void sell(Game game,Campaign campaign,Player player) {
		System.out.println(game.getName() +
				" Oyun " + player.getName() + 
				" adlý oyuncuya satýldý "+
				 campaign.getName()+
				" kampanyasý kullanýldý");

	}
	public void sell(Game game,Player player) {
		System.out.println(game.getName() +
				" Oyun " + player.getName() + 
				" adlý oyuncuya satýldý kampanya kullanýlmadý");

	}

}
