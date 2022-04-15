import java.awt.Color;
import java.awt.Graphics;

public class MainCharacter extends GameObjectThing{
	public MainCharacter(int x, int y, int width, int height) {
		speed=10;
		}
	
	public void up() {
		y-=speed;
	}
	void draw(Graphics g) {
	
    	
	}
	
	
}
