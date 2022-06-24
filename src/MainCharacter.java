import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class MainCharacter extends GameObject{
public boolean doublejump=false;


	public MainCharacter(int x, int y, int width, int height) {
		super(x, y, width,height);
		speed=1;
		
	}

	void update() {
super.update();
velocity=velocity+gravity;
Rectangle box= new Rectangle((int)x,(int)(y+velocity),width,height);
boolean hasCollided=false;
for (int k = 0; k < GameScreens.grounds.size(); k++) {
	if (GameScreens.grounds.get(k).collisionBox.intersects(box)) {
		velocity=0;
		hasCollided=true;
		doublejump=true;
	}
}
if (hasCollided==true) {
	
}
else {
	y=y+velocity;
}
	}
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int)x,(int)y,width,height);
			
		}
	}
