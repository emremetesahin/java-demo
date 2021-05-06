package gameProject;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void sell(Game game,Campaign campaign,Player player);
	void sell(Game game,Player player);

	

}
