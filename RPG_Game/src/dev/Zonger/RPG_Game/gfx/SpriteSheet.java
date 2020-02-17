package dev.Zonger.RPG_Game.gfx;

import java.awt.image.BufferedImage;
public class SpriteSheet {

	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage Sheet) {
		this.sheet = sheet;
	}
	
	public BufferedImage crop(int x, int y, int width, int height) {
		return sheet.getSubimage(x, y, width, height);
	}
}

