import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Ground extends GameObject {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;

	public Ground(int x, int y, int width, int height) {
		super(x, y, width, height);
		if (needImage) {
			loadImage("road.png");
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
		x -= speed;
		super.update();
	}

	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, (int) x, (int) y, width, height, null);
		} else {
			g.fillRect((int) x, (int) y, width, height);
		}
	}
}
