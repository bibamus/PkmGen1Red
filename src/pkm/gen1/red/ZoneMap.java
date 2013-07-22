package pkm.gen1.red;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ZoneMap {



	private int[][] tiles;
	private int xSize;
	private int ySize;

	public ZoneMap(String filename) {
		readMap(filename);
		xSize = tiles.length;
		ySize = tiles[0].length;
	}

	private void readMap(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.getClass().getClassLoader().getResource(filename).getFile()))){
			tiles = (int[][]) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int getxSize() {
		return xSize;
	}
	public int getySize() {
		return ySize;
	}

	public int getTileId(int x, int y) {
		return tiles[x][y];
	}

}
