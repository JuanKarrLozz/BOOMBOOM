import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaJuego extends JFrame{
	private static int ALTO=750,ANCHO=950;
	private panelMundo world;
	private panelScore puntos;
	private int punto=0;
	private int bomba = 30;
	private int tiempoFinal = 500000;
	private static int tamano=15;
	private boolean bomb = false;
	private boolean boton = false;
	private boolean escalera = false;
	private int vida=2;
	private Reproductor R;
	private int lvl;
	
	VentanaJuego(int mundo){
		lvl = mundo;
		R = new Reproductor();
		switch(mundo){
		case 1:{
			 try {
					R.AbrirFichero("raw/audio2.mp3");
					R.Play();
					} catch (Exception e) {
				}	
			}
			break;
			case 2: {
				 try {
						R.AbrirFichero("raw/audio3.mp3");
						R.Play();
						} catch (Exception e) {
					}	
			}
			break;
			
			case 3: {
				 try {
						R.AbrirFichero("raw/audio4.mp3");
						R.Play();
						} catch (Exception e) {
					}	
			}
			break;
		}
		
		 
		world = new panelMundo(tamano,tamano,mundo);
		puntos = new panelScore();		
		this.setLayout(new BorderLayout());
		this.setTitle("BOOM BOOM X");
		this.setSize(ANCHO,ALTO);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.orange);
		this.setResizable(false);
		this.setUndecorated(true);
		this.addKeyListener(new teclado());
		this.setFocusable(true);
		this.setLocationRelativeTo(null);
		this.add(world.getPanel(),BorderLayout.CENTER);	
		this.add(puntos.getPanel(),BorderLayout.NORTH);	
		this.setVisible(true);
		
		hilo inicio = new hilo();
		inicio.start();
	}
	
	class hilo extends Thread 
	{
		Random r;
		public hilo(){r = new Random(); }
		public void run()
		{	
			try{
					for(int segundos= tiempoFinal; segundos > -1; segundos--)
					{	
						
						world.enemigoMovimiento(r.nextInt(4)+1);
						puntos.setScore(punto*10);
						puntos.setDisparo(bomba);
						if(world.pjVivo()){
							world.setIcono(13,2);
							puntos.setVida(vida++);
						}
						Thread.sleep(100);
						
						if(world.bombas()){
							Thread.sleep(3000);
							world.fuego();
							bomb = false;
						}
						if(world.palancas()&& boton == false){
							world.abierto(2,5);
							world.abierto(2,6);
							world.abierto(2,7);
							world.abierto(2,8);
							world.abierto(2,9);
							boton=true;
							
						}
						if(world.escalera()&& escalera == false){
							try {
								R.Stop();
								new VentanaJuego(++lvl);
								 dispose();
							} catch (Exception e1){}
							escalera = true;
						}
						if(vida == 6 || lvl == 4)
						{
							System.exit(segundos);
						}
					}
			}catch(Exception e){}
		}
	}	
	
	public class teclado extends KeyAdapter{
		public void keyReleased(KeyEvent e){
				try {
					world.setPjImagen();
					Thread.sleep(100);
					} catch (InterruptedException e1){}
			}
		public void keyPressed(KeyEvent e) {
			boolean mueve = true;
			int key = e.getKeyCode();
			if(key == 32 && bomb == false && bomba >0){
				world.xyBomba();
				bomba--;
				if(!world.bombas()){
					bomb=true;
				}
			}
			//Movimientos
			if(key == KeyEvent.VK_LEFT && mueve){
				
				world.pjMovimiento(2);
				if(bomb){
					world.bomba();
				}
			}
			if(key == KeyEvent.VK_RIGHT && mueve) {
				world.pjMovimiento(1);
				if(bomb){
					world.bomba();
				}
			}
			if(key == KeyEvent.VK_UP && mueve) {
				world.pjMovimiento(4);
				if(bomb){
					world.bomba();
				}
			}
			if(key == KeyEvent.VK_DOWN && mueve) {
				world.pjMovimiento(3);
				if(bomb){
					world.bomba();
				}
			}
			
		}
	}
}


