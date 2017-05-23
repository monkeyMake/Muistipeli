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

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	private JButton btPoistuPelista = new JButton("Poistu pelistä");
	
	int kortti1, kortti2;
	int klikkaus1, klikkaus2;
	
	public Peli(){
		//luodaan ikkuna ja asetellaan buttonit listaan
		setSize(640,640);
		setResizable(false);
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
		
		alapalkki.add(btUusiPeli);
		alapalkki.add(btPoistuPelista);
		
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
			
			switch (e.getActionCommand())
		    {
		    	case "0":System.out.println("0");
		    	
		    	
		    	kortit.get(0).setIcon(kuvat.get(0));
		    	System.out.println("0");
		    	
		    		break;
		        case "1":System.out.println("1");
		        kortit.get(1).setIcon(kuvat.get(1));
		            break;
		        case "2":System.out.println("2");
		        kortit.get(2).setIcon(kuvat.get(2));
		                break;
		        case "3":System.out.println("3");
		        kortit.get(3).setIcon(kuvat.get(3));
		            break;
		        case "4":System.out.println("4");
		        kortit.get(4).setIcon(kuvat.get(4));
		            break;
		        case "5":System.out.println("5");
		        kortit.get(5).setIcon(kuvat.get(5));
	            	break;
		        case "6":System.out.println("6");
		        kortit.get(6).setIcon(kuvat.get(6));
	            	break;
		        case "7":System.out.println("7");
		        kortit.get(7).setIcon(kuvat.get(7));
	            	break;
		        case "8":System.out.println("8");
		        kortit.get(8).setIcon(kuvat.get(8));
	            	break;
		        case "9":System.out.println("9");
		        kortit.get(9).setIcon(kuvat.get(9));
	            	break;
		        case "10":System.out.println("10");
		        kortit.get(10).setIcon(kuvat.get(10));
	            	break;
		        case "11":System.out.println("11");
		        kortit.get(11).setIcon(kuvat.get(11));
	            	break;
		        case "12":System.out.println("12");
		        kortit.get(12).setIcon(kuvat.get(12));
	            	break;
		        case "13":System.out.println("13");
		        kortit.get(13).setIcon(kuvat.get(13));
	            	break;
		        case "14":System.out.println("14");
		        kortit.get(14).setIcon(kuvat.get(14));
	            	break;
		        case "15":System.out.println("15");
		        kortit.get(15).setIcon(kuvat.get(15));
	            	break;
		        case "16":System.out.println("16");
		        kortit.get(16).setIcon(kuvat.get(16));
	            	break;
		        case "17":System.out.println("17");
		        kortit.get(17).setIcon(kuvat.get(17));
	            	break;
		        case "18":System.out.println("18");
		        kortit.get(18).setIcon(kuvat.get(18));
	            	break;
		        case "19":System.out.println("19");
		        kortit.get(19).setIcon(kuvat.get(19));
	            	break;
		        case "20":System.out.println("20");
		        kortit.get(20).setIcon(kuvat.get(20));
	            	break;
		        case "21":System.out.println("21");
		        kortit.get(21).setIcon(kuvat.get(21));
	            	break;
		        case "22":System.out.println("22");
		        kortit.get(22).setIcon(kuvat.get(22));
	            	break;
		        case "23":System.out.println("23");
		        kortit.get(23).setIcon(kuvat.get(23));
	            	break;
		        case "24":System.out.println("24");
		        kortit.get(24).setIcon(kuvat.get(24));
	            	break;
		        case "25":System.out.println("25");
		        kortit.get(25).setIcon(kuvat.get(25));
	            	break;
		        case "26":System.out.println("26");
		        kortit.get(26).setIcon(kuvat.get(26));
		        	break;
		        case "27":System.out.println("27");
		        kortit.get(27).setIcon(kuvat.get(27));
	            	break;
		        case "28":System.out.println("28");
		        kortit.get(28).setIcon(kuvat.get(28));
		        	break;
		        case "29":System.out.println("29");
		        kortit.get(29).setIcon(kuvat.get(29));
	            	break;
		        case "30":System.out.println("30");
		        kortit.get(30).setIcon(kuvat.get(30));
	            	break;
		        case "31":System.out.println("31");
		        kortit.get(31).setIcon(kuvat.get(31));
	            	break;
		        case "32":System.out.println("32");
		        kortit.get(32).setIcon(kuvat.get(32));
	            	break;
		        case "33":System.out.println("33");
		        kortit.get(33).setIcon(kuvat.get(33));
	            	break;
		        case "34":System.out.println("34");
		        kortit.get(34).setIcon(kuvat.get(34));
	            	break;
		        case "35":System.out.println("35");
		        kortit.get(35).setIcon(kuvat.get(35));
	            	break;

		    }
			
		}
		
	}
}
