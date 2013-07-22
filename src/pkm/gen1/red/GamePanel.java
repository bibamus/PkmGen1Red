package pkm.gen1.red;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = -133046307980325189L;
	private Game game;

	public GamePanel(Game game) {
		this.game = game;
		setPreferredSize(new Dimension(480,480));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int j=0;j<60;j++){
			for(int i=0;i<60;i++){
				g.drawImage(
						TileLoader.getTile(
								game.getWorldMap().getTileId(
										j+game.getGameLogic().getHero().getxPos(),
										i+game.getGameLogic().getHero().getyPos()
										)
								),
								j*8,i*8,null
						);
			}
		}
	}

}
