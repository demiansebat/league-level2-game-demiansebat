import java.awt.Rectangle;

public class GameObject{
	 int x;
	 int y;
	 int width;
	 int height;
	 int speed;
	 boolean isActive;
	public  GameObject(int x, int y, int width, int height) {
			this.x=x;
			this.y=y;
			this.width=width;
			this.height=height;
			speed=3;
			isActive=true;
	 }
}
