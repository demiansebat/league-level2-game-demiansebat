import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SetupGame {
	JFrame frame;
	GameScreens panel; 
	public static JLabel label= new JLabel();
	public static final int WIDTH = 750;
	public static final int HEIGHT = 600;

	public static void main(String[] args) {
		SetupGame create = new SetupGame();
		create.setup();
	}

	SetupGame() {
		frame = new JFrame();
		panel = new GameScreens();
		frame.addKeyListener(panel);
		panel.add(label);
frame.setTitle("League Level 2 Game");
	}

	void setup() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}


}
