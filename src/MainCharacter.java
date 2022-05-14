import java.awt.Color;
import java.awt.Graphics;

public class MainCharacter extends GameObject{
	public MainCharacter(int x, int y, int width, int height) {
		super(x, y, width,height);
		speed=1;
		}
	void update() {
		x-=speed;
	}
	void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x,y,width,height);
	}
}
