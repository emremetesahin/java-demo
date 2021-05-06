package gameProject;

public class PlayerManager implements PlayerService {
private PersonCheckService personCheckService;
	public PlayerManager(PersonCheckService personCheckService) {
	this.personCheckService = personCheckService;
}

	@Override
	public void add(Player player) {
		if(this.personCheckService.checkIfRealPerson(player))
		{
			System.out.println("Oyuncu sisteme eklendi: "+player.getName());
		}
		else
		{
			System.out.println("Oyuncu sisteme eklenemedi");
		}
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu sistemden silindi: "+player.getName());
		
	}

	@Override
	public void update(Player player) {
		if(this.personCheckService.checkIfRealPerson(player))
		{
			System.out.println("Oyuncu  güncellendi: "+player.getName());
		}
		else
		{
			System.out.println("Oyuncu güncellenemedi ");
		}
		
	}

}
