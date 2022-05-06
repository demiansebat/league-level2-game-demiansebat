import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Obstacle extends GameObject{
	public Obstacle(int width, int height) {
		super(SetupGame.WIDTH-10, SetupGame.HEIGHT/2-40, width, height);
	}
	void update() {
		x-=speed;
	}
	void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}
	}
