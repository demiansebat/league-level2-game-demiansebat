import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreens extends JPanel implements KeyListener,ActionListener {
	Font titleFont;
	Font headingfont;

	public static void main(String[] args) {
	}

	GameScreens() {
		titleFont = new Font("Arial", Font.PLAIN, 48);
		headingfont = new Font("Arial", Font.PLAIN, 20);
	}
	


	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
