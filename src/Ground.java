import java.awt.Color;
import java.awt.Graphics;

public class Ground extends GameObject{
	public Ground(int x,int y,int width, int height) {
		super(x,y, width, height);
		
	}
void update() {
	x-=speed;
	super.update();
}
void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect((int)x, (int)y, width, height);
}
}
