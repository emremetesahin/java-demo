package gameProject;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellendi: " + game.getName());

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: " + game.getName());

	}

	@Override
	public void sell(Game game,Campaign campaign,Player player) {
		System.out.println(game.getName() +
				" Oyun " + player.getName() + 
				" adl� oyuncuya sat�ld� "+
				 campaign.getName()+
				" kampanyas� kullan�ld�");

	}
	public void sell(Game game,Player player) {
		System.out.println(game.getName() +
				" Oyun " + player.getName() + 
				" adl� oyuncuya sat�ld� kampanya kullan�lmad�");

	}

}
