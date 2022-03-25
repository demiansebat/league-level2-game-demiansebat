import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SetupGame {
	JFrame frame;
	GameScreens panel;
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 1600;

	public static void main(String[] args) {
		SetupGame create = new SetupGame();
		create.setup();
	}

	SetupGame() {
		frame = new JFrame();
		panel = new GameScreens();
		frame.addKeyListener(panel);
	}

	void setup() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
