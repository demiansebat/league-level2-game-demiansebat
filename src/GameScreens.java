 import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameScreens extends JPanel implements KeyListener, ActionListener {
	Font titleFont;
	Font headingfont;
	Timer switchScreen;
	public static final int MENU = 0;
	public static final int GAME = 1;
	public static final int END = 2;
	public static int currentState = MENU;

	public static void main(String[] args) {
	}

	GameScreens() {
		titleFont = new Font("Arial", Font.ITALIC, 48);
		headingfont = new Font("Arial", Font.ITALIC, 20);
		switchScreen = new Timer(1000 / 60, this);
		switchScreen.start();
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
			System.out.println("THE KEY WAS PRESSED"+currentState);
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

	}

	void updateEndState() {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == END) {
			updateEndState();
		}
		repaint();
	}

}
