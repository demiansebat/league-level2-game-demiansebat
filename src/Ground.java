import java.awt.Color;
import java.awt.Graphics;

public class Ground extends GameObject{
	public Ground(int width, int height) {
		super(SetupGame.WIDTH-10, SetupGame.HEIGHT/2, width, height);
		
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
