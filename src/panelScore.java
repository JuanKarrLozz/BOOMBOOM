import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class panelScore {
	private JPanel panelScore;
	private JButton btn1,btn4,btn2,btn3,btn5;
	private ImageIcon img1,img2,img3,img4,img5;
		
	panelScore(){
		img1 = new ImageIcon("img/barravida.jpg");
		img2 = new ImageIcon("img/barravida2.jpg");
		img4 = new ImageIcon("img/barravida3.jpg");
		img5 = new ImageIcon("img/barravida4.jpg");
		
		img3 = new ImageIcon("img/barradisparo.jpg");
		
		panelScore = new JPanel();
		panelScore.setLayout( new GridBagLayout());
		panelScore.setBackground(Color.black);
		btn1 = new JButton();
		btn1.setIcon(img3);
		btn1.setSize(1,1);
		btn1.setBorder(null);
		btn1.setFocusable(false);
		
		btn4= new JButton();
		btn4.setText("");
		btn4.setFont(new java.awt.Font("Tahoma", 0,30));
		btn4.setForeground(Color.orange);
		btn4.setBackground(Color.black);
		btn4.setSize(1,1);
		btn4.setBorder(null);
		
		btn2= new JButton();
		btn2.setIcon(img1);
		btn2.setSize(1,1);
		btn2.setBorder(null);
	
		btn3= new JButton();
		btn3.setText("");
		btn3.setFont(new java.awt.Font("Tahoma", 0,30));
		btn3.setForeground(Color.white);
		btn3.setBackground(Color.black);
		btn3.setSize(1,1);
		btn3.setBorder(null);
		
		btn5= new JButton();
		btn5.setText("");
		btn5.setFont(new java.awt.Font("Tahoma", 0,30));
		btn5.setForeground(Color.white);
		btn5.setBackground(Color.black);
		btn5.setSize(1,1);
		btn5.setBorder(null);
				
		panelScore.add(btn1);
		panelScore.add(btn4);
		panelScore.add(btn2);
		panelScore.add(btn3);
		//panelScore.add(btn5);
	}			 
	
	public void setTime(int time){
		String ti = Integer.toString(time);
		//btn3.setText(" Time :["+ti+"]");
	}
	public void setScore(int score){
		String sc = Integer.toString(score);
		btn5.setText(" Score :["+sc+"]");
	}
	public void setDisparo(int disparo){
		String disp = Integer.toString(disparo);
		btn4.setText(disp);
	}
	
	
	
	public void setVida(int c){
		switch(c){
		 case 1:{
			 btn2.setIcon(img1);
		 }
		 break;
		 case 2:{
			 btn2.setIcon(img2);
		 }
		 break;
		 case 3:{
			 btn2.setIcon(img4);
		 }
		 break;
		 case 4:{
			 btn2.setIcon(img5);
		 }
		 break;
		}
	}
		
	public JPanel getPanel(){
		return panelScore;
	}
}
