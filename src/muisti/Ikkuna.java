package muisti;

import java.awt.Color;

import javax.swing.JFrame;

public class Ikkuna extends JFrame {
	
	public Ikkuna(){
		
		setTitle("Muistipeli");
		setSize(700, 500);
		setResizable(false);
		setLocation(350, 150);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
}
