import java.awt.Color;
import java.awt.Graphics;

public class MainCharacter extends GameObject{
	public MainCharacter(int x, int y, int width, int height) {
		super(x, y, width,height);
		speed=1;
		}

	void update() {
velocity=velocity+gravity;
y=y-velocity;
//Use getBounds(){} and collisionBox, boundingBox to create collision when sprites intersect.
//Then work on movement with gravity, add images, other stuff and game will be done.
	}
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int)x,(int)y,width,height);
	}
}
