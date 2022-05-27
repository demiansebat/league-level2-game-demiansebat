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
	

	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		speed = 3;
		isActive = true;
		this.gravity=1.0/3.0;
		this.velocity=0;
	}
}
