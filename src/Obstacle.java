import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Obstacle extends GameObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	public Obstacle(int width, int height) {
		super(SetupGame.WIDTH-10, SetupGame.HEIGHT/2-40, width, height);
	}
	void update() {
		x-=speed;
		super.update();
	}
	void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int)x,(int)y, width, height);
	}
	}
