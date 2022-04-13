import java.awt.Rectangle;

public class GameObjectThing {
	 int x;
	 int y;
	 int width;
	 int height;
	 int speed;
	 boolean isActive;
	 public void GameObject(int x, int y, int width, int height) {
			this.x=x;
			this.y=y;
			this.width=width;
			this.height=height;
			speed=0;
			isActive=true;
	 }
}
