package muisti;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
			btKortti = new JButton(""+i);
			btKortti.addActionListener(new Press());
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

	
	class Press implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			switch (e.getActionCommand())
		    {
		    	case "0":System.out.println("0");
		    		break;
		        case "1":System.out.println("1");
		            break;
		        case "2":System.out.println("2");
		                break;
		        case "3":System.out.println("3");
		            break;
		        case "4":System.out.println("4");
		            break;
		        case "5":System.out.println("5");
	            	break;
		        case "6":System.out.println("6");
	            	break;
		        case "7":System.out.println("7");
	            	break;
		        case "8":System.out.println("8");
	            	break;
		        case "9":System.out.println("9");
	            	break;
		        case "10":System.out.println("10");
	            	break;
		        case "11":System.out.println("11");
	            	break;
		        case "12":System.out.println("12");
	            	break;
		        case "13":System.out.println("13");
	            	break;
		        case "14":System.out.println("14");
	            	break;
		        case "15":System.out.println("15");
	            	break;
		        case "16":System.out.println("16");
	            	break;
		        case "17":System.out.println("17");
	            	break;
		        case "18":System.out.println("18");
	            	break;
		        case "19":System.out.println("19");
	            	break;
		        case "20":System.out.println("20");
	            	break;
		        case "21":System.out.println("21");
	            	break;
		        case "22":System.out.println("22");
	            	break;
		        case "23":System.out.println("23");
	            	break;
		        case "24":System.out.println("24");
	            	break;
		        case "25":System.out.println("25");
	            	break;
		        case "26":System.out.println("26");
		        	break;
		        case "27":System.out.println("27");
	            	break;
		        case "28":System.out.println("28");
		        	break;
		        case "29":System.out.println("29");
	            	break;
		        case "30":System.out.println("30");
	            	break;
		        case "31":System.out.println("31");
	            	break;
		        case "32":System.out.println("32");
	            	break;
		        case "33":System.out.println("33");
	            	break;
		        case "34":System.out.println("34");
	            	break;
		        case "35":System.out.println("35");
	            	break;

		    }
			
		}
		
	}
}
