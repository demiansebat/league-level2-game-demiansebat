import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameScreens extends JPanel implements KeyListener, ActionListener {
	Font titleFont;
	Font headingfont;
	Timer switchScreen;
	Timer roadSpawn;
	public static final int MENU = 0;
	public static final int GAME = 1;
	public static final int END = 2;
	Random place = new Random();

	ArrayList<Ground> grounds = new ArrayList<Ground>();
	public static int currentState = MENU;

	GameScreens() {
		titleFont = new Font("Arial", Font.ITALIC, 48);
		headingfont = new Font("Arial", Font.ITALIC, 20);
		switchScreen = new Timer(1000 / 60, this);
		switchScreen.start();
		roadSpawn = new Timer(500, this);
		roadSpawn.start();
	}

	void addGround() {
		grounds.add(new Ground(100,100));
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, SetupGame.WIDTH, SetupGame.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.GREEN);
		g.drawString("*INSERT INTERESTING TITLE*", 20, 100);
		g.setFont(headingfont);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, SetupGame.WIDTH, SetupGame.HEIGHT);
		g.setColor(Color.BLUE);
		for (Ground ground : grounds) {
			ground.draw(g);
		}
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, SetupGame.WIDTH, SetupGame.HEIGHT);
	}

	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);

		} else if (currentState == GAME) {
			drawGameState(g);

		} else if (currentState == END) {
			drawEndState(g);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("THE KEY WAS PRESSED" + currentState);
			if (currentState == END) {
				currentState = MENU;
			} else {
				currentState++;
			}
		}
	}

	void updateMenuState() {

	}

	void updateGameState() {
		for (Ground ground : grounds) {
			ground.update();
		}
	}

	void updateEndState() {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == (switchScreen)) {
			if (currentState == MENU) {
				updateMenuState();
			} else if (currentState == GAME) {
				updateGameState();
			} else if (currentState == END) {
				updateEndState();
			}
			repaint();
		} else if (e.getSource() == (roadSpawn)) {
			addGround();
		}
	}

}
