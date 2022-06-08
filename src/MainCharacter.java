import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class MainCharacter extends GameObject{
	public MainCharacter(int x, int y, int width, int height) {
		super(x, y, width,height);
		speed=1;
		}

	void update() {

velocity=velocity+gravity;
y=y+velocity;
	}
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int)x,(int)y,width,height);
			
		}
		
	}
