package muisti;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import muisti.Peli.Press.Viive;


public class Peli extends JFrame {

	int piste = 0;
	
	private JPanel paPisteet = new JPanel(new FlowLayout());
	private JPanel alapalkki = new JPanel();
	
	private JLabel lbPisteet = new JLabel("Pisteet: " + piste);	
	private JPanel paKortit = new JPanel(new GridLayout(6,6));
	private ArrayList <JButton> kortit = new ArrayList<JButton>();
	private ArrayList <ImageIcon> kuvat = new ArrayList<ImageIcon>();
	
	private JButton btKortti;
	private JButton btUusiPeli = new JButton("Uusi peli");
	private JButton btExit = new JButton("Poistu pelistä");
	
	int kortti1, kortti2;
	JButton klikkaus1, klikkaus2;
	
	private Viive viive = null;
	
	public Peli(){
		//luodaan ikkuna ja asetellaan buttonit listaan
		setSize(640,640);
		setResizable(false);
		setLocation(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Muistipeli");
		ImageIcon img = new ImageIcon("images/brain.png");
		setIconImage(img.getImage());
		
		for(int i = 0; i < 36; i++){
			btKortti = new JButton(""+i);
			btKortti.addActionListener(new Press());
			kortit.add(btKortti);
		}
		
		for (int i = 0; i < 18; i++){
			
			for (int x = 0; x < 2; x++){
				ImageIcon pic = new ImageIcon("images/image" + i + ".png");
				kuvat.add(pic);
			}
		}
		Collections.shuffle(kuvat);
		
		setVisible(true);
		
		asetteleKomponentit();
		
		

	}
	
	public void asetteleKomponentit(){
		//asetellaan komponentit ikkunaan
		Container sisalto = this.getContentPane();
		sisalto.setLayout(new BorderLayout());
		
		paPisteet.add(lbPisteet);
		
		btExit.addActionListener(new Press());
		btUusiPeli.addActionListener(new Press());
		
		alapalkki.add(btUusiPeli);
		alapalkki.add(btExit);
		
		sisalto.add(paPisteet, BorderLayout.NORTH);
		sisalto.add(alapalkki, BorderLayout.SOUTH);
		
		sisalto.add(paKortit);
		
		for (int i = 0; i < 36; i++){
			paKortit.add(kortit.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		Peli ikkuna = new Peli();
	}

	
	class Press implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for (int i = 0; i < 36; i ++){
				if (e.getSource().equals(kortit.get(i))){
					
					if(klikkaus1 == null){
						if(kortit.get(i).getIcon() == null){
						klikkaus1 = kortit.get(i);
						 kortit.get(i).setIcon(kuvat.get(i));
						}
					}
					else if (klikkaus1 != null && klikkaus2 == null){
						if(kortit.get(i).getIcon() == null){
							klikkaus2 = kortit.get(i);
							 kortit.get(i).setIcon(kuvat.get(i));
						}
					}
					else if (klikkaus1 != null && klikkaus2 != null){
						viive.LopetaViive();
					}
						
				}
				else if(e.getSource().equals(btExit)){
					System.out.println("You are Terminated");
					System.exit(0);
					
				}
				else if(e.getSource().equals(btUusiPeli)){
					Reset();
				}
				
			}
			if(klikkaus1 != null && klikkaus2 != null){
				TarkistaKuvat();
			}
			
		   
		}
		
		public void Reset(){
			for (int i = 0; i < 36; i++){
				kortit.get(i).setIcon(null);
			}
			Collections.shuffle(kuvat);
			klikkaus1 = null;
			klikkaus2 = null;
			piste = 0;
			lbPisteet.setText("Pisteet: " + piste);
		}
		
		public void TarkistaKuvat(){
			if(klikkaus1.getIcon().toString().equals(klikkaus2.getIcon().toString())){
				piste = piste + 10;
				lbPisteet.setText("Pisteet: " + piste);
				
				klikkaus1 = null;
				klikkaus2 = null;
			}
			else{
				piste = piste -1;
				lbPisteet.setText("Pisteet: " + piste);
				
				viive = new Viive(2);
				
			
				
				
				
			}
			
		}
		
		public void Piilota(){
			for (int i = 0; i < 36; i ++){
				if(kortit.get(i).equals(klikkaus1)){
					 kortit.get(i).setIcon(null);
					 klikkaus1 = null;
				}
				else if(kortit.get(i).equals(klikkaus2)){
					 kortit.get(i).setIcon(null);
					 klikkaus2 = null;
				}
			}
			
		}
		
		public void Voitto(){
			
		}
		
		public class Viive {
			Timer aika;

			public Viive(int sekunnit) {
				aika = new Timer();
				aika.schedule(new RemindTask(), sekunnit * 1000);
			}
				
				public void LopetaViive() {
					aika.cancel();
					Piilota();
				}

				class RemindTask extends TimerTask {
					public void run() {
						aika.cancel();
						Piilota();
					}
			}
		}
	}
	
}


