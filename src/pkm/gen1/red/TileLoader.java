package pkm.gen1.red;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class TileLoader {

	private static HashMap<Integer,BufferedImage> tiles = new HashMap<Integer, BufferedImage>();

	public static BufferedImage getTile(int tileId) {
		if(!tiles.containsKey(tileId)){
			if(tileId==0){//workaround
				tiles.put(tileId, new BufferedImage(8, 8, BufferedImage.TYPE_BYTE_GRAY));
			}
			else {
				try {
					BufferedImage bi = ImageIO.read(
							TileLoader.class.getClassLoader().getResource("tiles/" + tileId + ".png")
							);
					tiles.put(tileId, bi);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return tiles.get(tileId);
	}

}
