import java.awt.Color;
import java.awt.Graphics;

public class MainCharacter extends GameObjectThing{
	public MainCharacter(int x, int y, int width, int height) {
		speed=10;
		}
	
	public void down() {
		y+=speed;
	}

	public void up() {
		y-=speed;
	}
	
	public void left() {
		x-=speed;
	}

	public void right() {
		x+=speed;
	}
	void draw(Graphics g) {
		g.drawRect(250, 250, 75, 75);
		g.setColor(Color.BLUE);
    	g.fillRect(250, 250, 75, 75);
    	
	}
	
	
}
