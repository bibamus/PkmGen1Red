package pkm.gen1.red;

import javax.swing.JFrame;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Game();

	}



	private ZoneMap worldMap;
	private GamePanel gamePanel;
	private GameLogic gameLogic;
	
	
	
	public Game() {
		doInit();
	}
	private void doInit() {
		worldMap = new ZoneMap("worldmap");
		gameLogic = new GameLogic();
		gamePanel = new GamePanel(this);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gamePanel);
		frame.pack();
		frame.setVisible(true);
		
	}
	public GamePanel getGamePanel() {
		return gamePanel;
	}
	public ZoneMap getWorldMap() {
		return worldMap;
	}
	public GameLogic getGameLogic() {
		return gameLogic;
	}

}
