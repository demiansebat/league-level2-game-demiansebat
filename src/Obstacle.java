import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

public class Obstacle extends GameObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	public Obstacle(int width, int height) {
		super(SetupGame.WIDTH-10, SetupGame.HEIGHT/2+140, width, height);
		if (needImage) {
			loadImage("coneObstacle.png");
		}
	}
	void loadImage(String imageFile) {
		if (needImage) {
			try {
				image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
				gotImage = true;
			} catch (Exception e) {

			}
			needImage = false;
		}
	}
	void update() {
		x-=speed;
		super.update();
	}
	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, (int) x, (int) y, width, height, null);
		}
		else {
			g.setColor(Color.GREEN);
		g.fillRect((int)x,(int)y, width, height);
	}
	}
	}
