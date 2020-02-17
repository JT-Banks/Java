package dev.Zonger.RPG_Game.gfx;

import java.awt.image.BufferedImage;

public class Assests {
	
	public static BufferedImage player, enemy, background;

	public static void init() {
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		
	}
}
