import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class VentanaInicio extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ALTO=600,ANCHO=900;
	private JButton btn1,btn3,inicio;
	private	ImageIcon img1,img3,img4,img5;
	private Reproductor R;
		
	public VentanaInicio(){
		img1 = new ImageIcon("img/logo.gif");
		img5 = new ImageIcon("img/gent.jpeg");
		img3 = new ImageIcon("img/calaca.gif");
		img4 = new ImageIcon("img/start.jpg");
		
		R = new Reproductor();
		this.setTitle("BOOM BOOM X");
		this.setSize(ANCHO,ALTO);
		this.getContentPane().setBackground(Color.black);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
				
		btn1 = new JButton();
		btn1.setIcon(img5);
		btn1.setBounds(0,0,900,600);
		btn1.setBorder(null);
		btn1.setFocusable(false);
		
				
		btn3 = new JButton();
		btn3.setIcon(img1);
		btn3.setBounds(50,50,781,90);
		btn3.setBorder(null);
		btn3.setFocusable(false);
		btn3.setBackground(Color.black);
					
		inicio = new JButton();
		inicio.setIcon(img4);
		inicio.setBounds(50,325,150,150);
		inicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					R.Stop();
					new VentanaJuego(1);
					 dispose();
				} catch (Exception e1){}
			}
		});
		inicio.setBorder(null);
		inicio.setFocusable(true);
		
		this.add(inicio);
		this.add(btn1);
		this.add(btn3);
		
		 try {
				R.AbrirFichero("raw/inicio.mp3");
				R.Play();
				} catch (Exception e) {
			}	
		 this.setVisible(true);
		
	}
}
