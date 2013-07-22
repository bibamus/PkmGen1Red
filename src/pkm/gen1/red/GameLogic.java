package pkm.gen1.red;

public class GameLogic {

	private Hero hero;

	public GameLogic() {
		doInit();
	}

	private void doInit() {
		hero = new Hero();
	}
	public Hero getHero() {
		return hero;
	}
}
