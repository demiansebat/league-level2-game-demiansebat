import java.awt.Color;
import java.awt.Graphics;

public class Ground extends GameObject{
	public Ground(int width, int height) {
		super(SetupGame.WIDTH, SetupGame.HEIGHT-150, width, height);
		
		
	}
void update() {
	x-=speed;
}
void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);
}
}
