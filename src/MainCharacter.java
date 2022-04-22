import java.awt.Color;
import java.awt.Graphics;

public class MainCharacter extends GameObject{
	public MainCharacter(int x, int y, int width, int height) {
		super(x, y, width,height);
		speed=10;
		}
	void update() {
		 y+=speed;
	}
	
}
