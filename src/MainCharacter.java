import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class MainCharacter extends GameObject{
public boolean doublejump=false;
public static BufferedImage image;
public static boolean needImage = true;
public static boolean gotImage = false;	


	public MainCharacter(int x, int y, int width, int height) {
		super(x, y, width,height);
		speed=1;
	if (needImage) {
	    loadImage ("car1.png");
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
		  if (gotImage) {
	    		g.drawImage(image, (int)x, (int)y, width, height, null);
		  }
		  else {
		g.setColor(Color.BLACK);
		g.fillRect((int)x,(int)y,width,height);
			
		}}
	}
