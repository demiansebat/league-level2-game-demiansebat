import java.awt.Rectangle;

public class GameObject {
	double x;
	double y;
	int width;
	int height;
	int speed;
	boolean isActive;
	double gravity;
	double velocity;
	Rectangle collisionBox;
	

	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		speed = 3;
		isActive = true;
		this.gravity=2.4/10.0;
		this.velocity=0;
		collisionBox= new Rectangle(x,y,width,height);
	}
	 void update() {
		 collisionBox.setBounds((int) x, (int) y, width, height);
	 }
}
