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
		speed = 6;
		isActive = true;
		this.gravity=10/10.0;
		this.velocity=0;
		collisionBox= new Rectangle(x,y,width,height);
	}
	 void update() {
		 collisionBox.setBounds((int) x, (int) y, width, height);
	 }
}
