package muisti;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Peli extends JFrame {

	int piste = 0;
	private JPanel paPisteet = new JPanel(new FlowLayout());
	private JLabel lbPisteet = new JLabel("Pisteet: " + piste);
	private JLabel lbUusiPeli = new JLabel("Pist: " + piste);	
	private JPanel paKortit = new JPanel(new GridLayout(6,6));
	private ArrayList <JButton> kortit = new ArrayList<JButton>() ;
	private JButton btKortti;
	
	
	public Peli(){
		setSize(500,520);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Muistipeli");
		ImageIcon img = new ImageIcon("images/brain.png");
		setIconImage(img.getImage());
		
		
		for(int i = 0; i < 36; i++){
			btKortti = new JButton();
			kortit.add(btKortti);
			
		}
		asetteleKomponentit();
		
		setVisible(true);
	}
	
	public void asetteleKomponentit(){
		Container sisalto = this.getContentPane();
		sisalto.setLayout(new BorderLayout());
		paPisteet.add(lbPisteet);
		sisalto.add(paPisteet, BorderLayout.NORTH);
		sisalto.add(lbUusiPeli, BorderLayout.SOUTH);
		
		sisalto.add(paKortit);
		
		for (int i = 0; i < 36; i++){
			paKortit.add(kortit.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		Peli ikkuna = new Peli();
	}

	public void actionPerformed(ActionEvent event) {


	    /* switch (e.getActionCommand())
	    {
	        case "1":System.out.println("pressed button 1");
	            break;
	        case "2":System.out.println("pressed button 2");
	                break;
	        case "*":System.out.println("pressed button *");
	            break;
	        case "\u221A":System.out.println("pressed button \\u221A");
	            break;

	    }*/

	 }
}
