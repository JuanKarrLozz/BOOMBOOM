import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class panelMundo{
	
	private JPanel panelBotones;
	private JButton[][] nivel;
	private int xbomba, ybomba;
	private Reproductor r;
	private Reproductor p;
	private int [][] aux = {{5 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 6 },
							{1 , 0 , 0 , 0 , 0 , 0 , 0 , 0,  0 , 0 , 0 , 0 , 0 , 12, 3 },
							{1 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 3 },
							{1 , 10, 0, 0 , 10 , 0 , 10, 0 , 0 , 10, 0 , 0 , 0 , 10, 3 },
							{1 , 14, 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 14, 3 },
							{1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 3 },
							{1 , 0 , 9 , 0 , 9 , 0 , 9 , 10, 9 , 0 , 9 , 0 , 9 , 0 , 3 },
							{1 , 0 , 0 , 0 , 0 , 0 , 0 , 14, 0 , 0 , 0 , 0 , 0 , 0 , 3 },
							{1 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 ,  3},
							{1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 3 },
							{1 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 3 },
							{1 , 10, 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 3 },
							{1 , 4 , 4 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 9 , 0 , 3 },
							{1 , 11, 13, 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 10, 3 },
							{8 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 7 }};
	
	private int [][] aux2 ={{5 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 6 },
							{1 , 0 , 0 , 0 , 0 , 0 , 0 ,  0,  0 , 0 , 0 , 0  , 0 , 12, 3 },
							{1 , 4 , 4 , 4 , 4 , 4 , 4 ,  4 , 4 , 4 , 4 , 4  , 4 , 4 , 3 },
							{1 , 14 , 10, 0 , 0 , 0 , 0 , 10 , 10, 10, 10, 10 , 0 , 14 , 3 },
							{1 , 10, 9 , 0 , 9 , 0 , 9 , 0  , 9 , 10, 9 , 10 , 9 , 0 , 3 },
							{1 , 0 , 10, 10, 0 , 10, 10, 0  , 10, 10, 0 , 10 , 10, 10, 3 },
							{1 , 0 , 9 , 10, 9 , 10, 9 , 10 , 9 , 10, 9 , 10 , 9 , 0 , 3 },
							{1 , 0 , 10, 10, 0 , 10, 10, 10 , 0 , 10, 0 , 10 , 10, 10, 3 },
							{1 , 10, 9 , 10, 9 , 10, 9 , 10 , 9 , 0 , 9 , 10 , 9 , 0 ,  3},
							{1 , 10, 0 , 10, 0 , 10, 10, 10 , 0 , 10, 0 , 10 , 10, 10, 3 },
							{1 , 10, 9 , 10, 9 , 0 , 9 , 10 , 9 , 10, 9 , 10 , 9 , 0 , 3 },
							{1 , 10, 10, 10, 0 , 10, 10, 14 , 0 , 10, 0 , 10 , 10, 10, 3 },
							{1 , 4 , 4 , 0 , 9 , 10, 9 , 10 , 9 , 10, 9 , 10 , 9 , 0 , 3 },
							{1 , 11, 13, 0 , 0 , 10, 0 , 10 , 0 , 10, 0 , 10 , 10, 0 , 3 },
							{8 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 7 }};
	
	private int [][] aux3 ={{5 , 2 , 2 , 2 , 2 , 2 , 2 , 2  , 2 , 2 , 2 , 2  , 2 , 2 , 6 },
							{1 , 0 , 0 , 0 , 0 , 0 , 0 ,  0 ,  0, 0 , 0 , 0  , 0 , 12, 3 },
							{1 , 4 , 4 , 4 , 4 , 4 , 4 ,  4 , 4 , 4 , 4 , 4  , 4 , 4 , 3 },
							{1 , 14 , 10, 0 , 0 , 15 , 15 , 10 , 10, 10, 10, 10 , 0 , 14, 3 },
							{1 , 10, 9 , 0 , 9 , 0 , 9 , 0  , 9 , 10, 9 , 10 , 9 , 0 , 3 },
							{1 , 0 , 10, 10, 0 , 10, 10, 0  , 10, 10, 0 , 10 , 10, 10, 3 },
							{1 , 15 , 9 , 10, 9 , 10, 9 , 10 , 9 , 10, 9 , 10 , 9 , 0 , 3 },
							{1 , 0 , 10, 10, 0 , 10, 10, 10 , 15 , 10, 0 , 10 , 10, 10, 3 },
							{1 , 10, 9 , 10, 9 , 10, 9 , 10 , 9 , 0 , 9 , 10 , 9 , 15 ,  3},
							{1 , 10, 0 , 10, 0 , 10, 10, 10 , 0 , 10, 0 , 10 , 10, 10, 3 },
							{1 , 10, 9 , 10, 9 , 15 , 9 ,14 , 9 , 10, 9 , 10 , 9 , 0 , 3 },
							{1 , 10, 10, 10, 0 , 10, 10, 10 , 0 , 10, 0 , 10 , 10, 10, 3 },
							{1 , 4 , 4 , 0 , 9 , 10, 9 , 10 , 9 , 10, 9 , 10 , 9 , 0 , 3 },
							{1 , 11, 13, 0 , 0 , 10, 0 , 10 , 0 , 10, 0 , 10 , 10, 0 , 3 },
							{8 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 7 }};

	private ImageIcon piso,enemigo,bomba,pilar,fuego;
	private ImageIcon pared1,pared2,pared3,pared4;
	private ImageIcon esquina1,esquina2,esquina3,esquina4;
	private ImageIcon pjArS,pjAbS,pjIzS,pjDeS,pjarriba,pjabajo,pjizquierda,pjderecha;
	private ImageIcon ebajar,esubir,boton1,planta;
	private ImageIcon fArriba,fAbajo,fIzquierda,fDerecha,fCentro;
	private ListaO lo = new ListaO();
			
	panelMundo(int xx, int yy,int mundo){
		nivel = new JButton[xx][yy];
		panelBotones  = new JPanel();
		panelBotones.setLayout( new GridLayout( nivel.length , nivel[0].length));
		panelBotones.setBackground(Color.black);
		//Pared y piso.
		piso = new ImageIcon("img/piso.png");		
		pared1 = new ImageIcon("img/pared1.png");
		pared2 = new ImageIcon("img/pared2.png");
		pared3 = new ImageIcon("img/pared3.png");
		pared4 = new ImageIcon("img/pared4.png");		
		esquina1 = new ImageIcon("img/esquina1.png");
		esquina2 = new ImageIcon("img/esquina2.png");
		esquina3 = new ImageIcon("img/esquina3.png");
		esquina4 = new ImageIcon("img/esquina4.png");
		esubir = new ImageIcon("img/esubir.png");
		ebajar = new ImageIcon("img/ebajar.png");
		boton1 = new ImageIcon("img/boton1.png");
		planta = new ImageIcon("img/planta.png");
		pilar = new ImageIcon("img/pilar.png");
		//FUEGO.
		fAbajo = new ImageIcon("img/fabajo.gif");
		fArriba = new ImageIcon("img/farriba.gif");
		fDerecha = new ImageIcon("img/fderecha.gif");
		fIzquierda = new ImageIcon("img/fizquierda.gif");
		fCentro = new ImageIcon("img/fcentro.gif");
		//GIFS.
		enemigo = new ImageIcon("img/enemy1.png");
		bomba = new ImageIcon("img/bomb.png");
		fuego = new ImageIcon("img/fire.jpg");
		
		//Estatico PJ
		pjAbS = new ImageIcon("img/pjabajo.png");
		pjDeS = new ImageIcon("img/pjderecha.png");
		pjIzS = new ImageIcon("img/pjizquierda.png");
		pjArS = new ImageIcon("img/pjarriba.png");
		//Movimientos PJ
		pjarriba = new ImageIcon("img/skullar.gif");
		pjabajo = new ImageIcon("img/skullab.gif");
		pjizquierda = new ImageIcon("img/skulli.gif");
		pjderecha = new ImageIcon("img/skulld.gif");
		
		// 0.-Piso 1.- Pared 2.- Palanca    3.- Pj     4.- Boss 5.- Ememigo
		switch(mundo){
			case 1:{
				lo.crear(aux);
				lo.imprimir();
				for(int x = 0;x < nivel.length;x++){
					for(int y = 0; y < nivel[0].length;y++){
						
						if(aux[x][y] == 0){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(piso);
							nivel[x][y].setBorder(null);
						}
						
						if(aux[x][y] == 1){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared1);
							nivel[x][y].setBorder(null);
						}
						
						if(aux[x][y] == 2){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared2);
							nivel[x][y].setBorder(null);
						}
						
						if(aux[x][y] == 3){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared3);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 4){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared4);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 5){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina1);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 6){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina2);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 7){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina3);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 8){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina4);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 9){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pilar);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 10){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(enemigo);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 11){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(ebajar);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 12){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esubir);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 13){
							System.out.print("X: "+x+" Y: "+y);
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pjArS);
							nivel[x][y].setBorder(null);
						}
						if(aux[x][y] == 14){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(boton1);
							nivel[x][y].setBorder(null);
						}
					panelBotones.add(nivel[x][y]);
				}
			}
		 	}
			break;
			
			case 2:{
				lo.crear(aux2);
				lo.imprimir();
				for(int x = 0;x < nivel.length;x++){
					for(int y = 0; y < nivel[0].length;y++){
						
						if(aux2[x][y] == 0){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(piso);
							nivel[x][y].setBorder(null);
						}
						
						if(aux2[x][y] == 1){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared1);
							nivel[x][y].setBorder(null);
						}
						
						if(aux2[x][y] == 2){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared2);
							nivel[x][y].setBorder(null);
						}
						
						if(aux2[x][y] == 3){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared3);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 4){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared4);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 5){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina1);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 6){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina2);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 7){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina3);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 8){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina4);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 9){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pilar);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 10){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(planta);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 11){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(ebajar);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 12){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esubir);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 13){
							System.out.print("X: "+x+" Y: "+y);
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pjArS);
							nivel[x][y].setBorder(null);
						}
						if(aux2[x][y] == 14){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(boton1);
							nivel[x][y].setBorder(null);
						}
					panelBotones.add(nivel[x][y]);
				}
			}
			}
			break;
			
			case 3:{
				lo.crear(aux3);
				lo.imprimir();
				for(int x = 0;x < nivel.length;x++){
					for(int y = 0; y < nivel[0].length;y++){
						
						if(aux3[x][y] == 0){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(piso);
							nivel[x][y].setBorder(null);
						}
						
						if(aux3[x][y] == 1){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared1);
							nivel[x][y].setBorder(null);
						}
						
						if(aux3[x][y] == 2){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared2);
							nivel[x][y].setBorder(null);
						}
						
						if(aux3[x][y] == 3){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared3);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 4){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pared4);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 5){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina1);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 6){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina2);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 7){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina3);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 8){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esquina4);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 9){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pilar);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 10){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(planta);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 11){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(ebajar);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 12){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(esubir);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 13){
							System.out.print("X: "+x+" Y: "+y);
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(pjArS);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 14){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(boton1);
							nivel[x][y].setBorder(null);
						}
						if(aux3[x][y] == 15){
							nivel[x][y]=new JButton();
							nivel[x][y].setBackground(Color.black);
							nivel[x][y].setIcon(enemigo);
							nivel[x][y].setBorder(null);
						}
					panelBotones.add(nivel[x][y]);
				}
			}
			}
			break;
		}
}

public void setIcono(int x, int y){
	nivel[x][y].setIcon(pjArS);
}

public void abierto(int x, int y){
	nivel[x][y].setIcon(piso);
}

public boolean palancas(){
	boolean b=true;
	for(int x = 0; x < nivel.length; x++){
		for(int y = 0; y < nivel[0].length; y++){
			if((nivel[x][y].getIcon() == boton1)){
				b = false;
			}
		}
	}
	return b;
}
public boolean bombas(){
	boolean b=false;
	for(int x = 0; x < nivel.length; x++){
		for(int y = 0; y < nivel[0].length; y++){
			if(nivel[x][y].getIcon() == bomba||nivel[x][y].getIcon() == fuego){
				b = true;
			}
		}
	}
	return b;
}
public boolean escalera(){
	boolean b=false;
	for(int x = 0; x < nivel.length; x++){
		for(int y = 0; y < nivel[0].length; y++){
			if((nivel[x][y].getIcon() == esubir && nivel[x][y-1].getIcon() ==pjDeS)){
				b = true;
			}
		}
	}
	return b;
}
	
public JPanel getPanel(){
	return panelBotones;
}	

public int getAux(int x, int y){
	return aux[x][y];
}

public int [][] getAux(){
	return aux;
}

public boolean pjVivo(){
	boolean b=true;
	for(int x = 0; x < nivel.length; x++){
		for(int y = 0; y < nivel[0].length; y++){
			if((nivel[x][y].getIcon()==pjArS||nivel[x][y].getIcon()==pjarriba||nivel[x][y].getIcon()==pjAbS ||nivel[x][y].getIcon()==pjabajo||nivel[x][y].getIcon()==pjIzS||nivel[x][y].getIcon()==pjizquierda||nivel[x][y].getIcon()==pjDeS||nivel[x][y].getIcon()==pjderecha)){
				b = false;
			}
		}
	}
	return b;
}

public void setPjImagen(){
	for(int x = 0; x < nivel.length;x++){
		for(int y = 0;y < nivel[0].length;y++){
			if(nivel[x][y].getIcon()==pjderecha)
			{
				nivel[x][y].setIcon(pjDeS);
			}
			if(nivel[x][y].getIcon()==pjizquierda)
			{
				nivel[x][y].setIcon(pjIzS);
			}
			if(nivel[x][y].getIcon()==pjabajo)
			{
				nivel[x][y].setIcon(pjAbS);
			}
			if(nivel[x][y].getIcon()==pjarriba)
			{
				nivel[x][y].setIcon(pjArS);
			}
		}
	}
}	

public void pjMovimiento(int pos){
	p= new Reproductor();
	try {
		p.AbrirFichero("raw/pasos.wav");
		p.Play();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	switch(pos){
		case 1:{
		boolean b=true;
		for(int x = 0; x < nivel.length; x++){
			for(int y = 0; y < nivel[0].length; y++){
				if((nivel[x][y].getIcon()==pjArS||nivel[x][y].getIcon()==pjAbS||nivel[x][y].getIcon()==pjIzS||nivel[x][y].getIcon()==pjDeS)&&nivel[x][y+1].getIcon()==piso&& b==true){
					nivel[x][y+1].setIcon(pjderecha);
					nivel[x][y].setIcon(piso);	
					b = false;
				}
			}
		}	
		break;	
		}			
		case 2:{
		boolean b=true;
		for(int x = 0; x < nivel.length; x++){
			for(int y = 0; y < nivel[0].length; y++){
				if((nivel[x][y].getIcon()==pjArS||nivel[x][y].getIcon()==pjAbS||nivel[x][y].getIcon()==pjIzS||nivel[x][y].getIcon()==pjDeS)&&nivel[x][y-1].getIcon()==piso&&b==true){
					nivel[x][y-1].setIcon(pjizquierda);
					nivel[x][y].setIcon(piso);	
					b = false;				
				}
			}
		}	
		break;	
		}
		
		case 3:{
		boolean b=true;
		for(int x = 0; x < nivel.length; x++){
			for(int y = 0; y < nivel[0].length; y++){
				if((nivel[x][y].getIcon()==pjArS||nivel[x][y].getIcon()==pjAbS||nivel[x][y].getIcon()==pjIzS||nivel[x][y].getIcon()==pjDeS)&&nivel[x+1][y].getIcon()==piso&&b==true){
					nivel[x+1][y].setIcon(pjabajo);
					nivel[x][y].setIcon(piso);	
					b = false;
				}
			}
		}	
		break;	
		}
		case 4:{
		boolean b=true;
		for(int x = 0; x < nivel.length; x++){
			for(int y = 0; y < nivel[0].length; y++){
				if((nivel[x][y].getIcon()==pjArS||nivel[x][y].getIcon()==pjAbS||nivel[x][y].getIcon()==pjIzS||nivel[x][y].getIcon()==pjDeS)&&b==true&&nivel[x-1][y].getIcon()==piso){
					nivel[x-1][y].setIcon(pjarriba);
					nivel[x][y].setIcon(piso);	
					b = false;
				}
			}
		}	
		break;	
		}
	}
}

public void enemigoMovimiento(int pos){
		switch(pos){
		case 1:{
			boolean b=true;
			for(int x = 0; x < nivel.length; x++){
				for(int y = 0; y < nivel[0].length; y++){
					if(nivel[x][y].getIcon()==enemigo && b==true&&nivel[x][y+1].getIcon()!=pared1&&nivel[x][y+1].getIcon()!=pared2&&nivel[x][y+1].getIcon()!=pared3&&nivel[x][y+1].getIcon()!=pared4&&nivel[x][y+1].getIcon()!=pilar&&nivel[x][y+1].getIcon()!=boton1&&nivel[x][y+1].getIcon()!=enemigo&&nivel[x][y+1].getIcon()!=esubir&&nivel[x][y+1].getIcon()!=ebajar){
						nivel[x][y+1].setIcon(enemigo);
						nivel[x][y].setIcon(piso);	
						b = false;
					}
				}
			}
			break;
		}		
		case 2:{
			boolean b=true;
			for(int x = 0; x < nivel.length; x++){
				for(int y = 0; y < nivel[0].length; y++){
					if(nivel[x][y].getIcon()==enemigo && b==true&&nivel[x][y-1].getIcon()!=pared1&&nivel[x][y-1].getIcon()!=pared2&&nivel[x][y-1].getIcon()!=pared3&&nivel[x][y-1].getIcon()!=pared4&&nivel[x][y-1].getIcon()!=pilar&&nivel[x][y-1].getIcon()!=boton1&&nivel[x][y-1].getIcon()!=enemigo&&nivel[x][y-1].getIcon()!=esubir&&nivel[x][y-1].getIcon()!=ebajar){
						nivel[x][y-1].setIcon(enemigo);
						nivel[x][y].setIcon(piso);	
						b = false;
						}
				}
			}
			break;
		}
		case 3:{
			boolean b=true;
			for(int x = 0; x < nivel.length; x++){
				for(int y = 0; y < nivel[0].length; y++){
					if(nivel[x][y].getIcon()==enemigo&&b==true&&nivel[x+1][y].getIcon()!=pared1&&nivel[x+1][y].getIcon()!=pared2&&nivel[x+1][y].getIcon()!=pared3&&nivel[x+1][y].getIcon()!=pared4&&nivel[x+1][y].getIcon()!=pilar&&nivel[x+1][y].getIcon()!=boton1&&nivel[x+1][y].getIcon()!=enemigo&&nivel[x+1][y].getIcon()!=esubir&&nivel[x+1][y].getIcon()!=ebajar){
						nivel[x+1][y].setIcon(enemigo);
						nivel[x][y].setIcon(piso);	
						b = false;
					}
				}
			}
			break;
		}
		case 4:{
			boolean b=true;
			for(int x = 0; x < nivel.length; x++){
				for(int y = 0; y < nivel[0].length; y++){
					if(nivel[x][y].getIcon() == enemigo && b==true && nivel[x-1][y].getIcon()==piso&&nivel[x-1][y].getIcon()!=pared2&&nivel[x-1][y].getIcon()!=pared3&&nivel[x-1][y].getIcon()!=pared4&&nivel[x-1][y].getIcon()!=pilar&&nivel[x-1][y].getIcon()!=boton1&&nivel[x-1][y].getIcon()!=enemigo&&nivel[x-1][y].getIcon()!=esubir&&nivel[x-1][y].getIcon()!=ebajar){
						nivel[x-1][y].setIcon(enemigo);
						nivel[x][y].setIcon(piso);	
						b = false;
					}
				}
			}
			break;
		}
		}
	}

public void bomba(){
		if(nivel[xbomba][ybomba].getIcon() == piso){
			nivel[xbomba][ybomba].setIcon(bomba);
		}			
	}

public void xyBomba(){
	boolean b=true;
	for(int x = 0; x < nivel.length; x++){
		for(int y = 0; y < nivel[0].length; y++){
			if((nivel[x][y].getIcon()==pjArS||nivel[x][y].getIcon()==pjAbS||nivel[x][y].getIcon()==pjIzS||nivel[x][y].getIcon()==pjDeS)&&b==true){
				xbomba = x;
				ybomba = y;
				b = false;
			}
		}
	}
}
	
public void fuego(){
	 int x = xbomba;
	 int y = ybomba;
	 r = new Reproductor();
	try {
		r.AbrirFichero("raw/exp.wav");
		r.Play();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	 
	 boolean a=false,b=false,c=false,d=false,e=false;
			if(nivel[x][y].getIcon() == bomba && nivel[x][y+1].getIcon()
					==piso||nivel[x][y+1].getIcon()==boton1||nivel[x][y+1].getIcon()
					==planta||nivel[x][y+1].getIcon()==pjAbS||nivel[x][y+1].getIcon()
							==pjabajo||nivel[x][y+1].getIcon()==pjarriba||nivel[x][y+1].getIcon()
							==pjarriba||nivel[x][y+1].getIcon()==pjArS||nivel[x][y+1].getIcon()
							==pjderecha||nivel[x][y+1].getIcon()==pjDeS||nivel[x][y+1].getIcon()
							==pjizquierda||nivel[x][y+1].getIcon()==pjIzS){
				nivel[x][y+1].setIcon(fDerecha);
				a=true;
			}
			if(nivel[x][y].getIcon() == bomba && nivel[x][y-1].getIcon()
					==piso||nivel[x][y-1].getIcon()==boton1||nivel[x][y-1].getIcon()
					==planta||nivel[x][y-1].getIcon()==pjAbS||nivel[x][y-1].getIcon()
					==pjabajo||nivel[x][y-1].getIcon()==pjarriba||nivel[x][y-1].getIcon()
					==pjarriba||nivel[x][y-1].getIcon()==pjArS||nivel[x][y-1].getIcon()
					==pjderecha||nivel[x][y-1].getIcon()==pjDeS||nivel[x][y-1].getIcon()
					==pjizquierda||nivel[x][y-1].getIcon()==pjIzS){
				nivel[x][y-1].setIcon(fIzquierda);
				b=true;
			}
			if(nivel[x][y].getIcon() == bomba && nivel[x+1][y].getIcon()
					==piso||nivel[x+1][y].getIcon()==boton1||nivel[x+1][y].getIcon()
					==planta||nivel[x+1][y].getIcon()==pjAbS||nivel[x+1][y].getIcon()
					==pjabajo||nivel[x+1][y].getIcon()==pjarriba||nivel[x+1][y].getIcon()
					==pjarriba||nivel[x+1][y].getIcon()==pjArS||nivel[x+1][y].getIcon()
					==pjderecha||nivel[x+1][y].getIcon()==pjDeS||nivel[x+1][y].getIcon()
					==pjizquierda||nivel[x+1][y].getIcon()==pjIzS){
				nivel[x+1][y].setIcon(fAbajo);
				c=true;
			}
			if(nivel[x][y].getIcon() == bomba && nivel[x-1][y].getIcon()
					==piso||nivel[x-1][y].getIcon()==boton1||nivel[x-1][y].getIcon()
					==planta||nivel[x-1][y].getIcon()==pjAbS||nivel[x-1][y].getIcon()
					==pjabajo||nivel[x-1][y].getIcon()==pjarriba||nivel[x-1][y].getIcon()
					==pjarriba||nivel[x-1][y].getIcon()==pjArS||nivel[x-1][y].getIcon()
					==pjderecha||nivel[x-1][y].getIcon()==pjDeS||nivel[x-1][y].getIcon()
					==pjizquierda||nivel[x-1][y].getIcon()==pjIzS){
				nivel[x-1][y].setIcon(fArriba);
				d=true;
			}
			if(nivel[x][y].getIcon() == bomba){
				nivel[x][y].setIcon(fCentro);
				e=true;
			}			
			try {
				Thread.sleep(1000);
				if(a){
				nivel[x][y+1].setIcon(piso);
				}
				if(b){
				nivel[x][y-1].setIcon(piso);
				}
				if(c){
				nivel[x+1][y].setIcon(piso);
				}
				if(d){
				nivel[x-1][y].setIcon(piso);
				}
				if(e){
				nivel[x][y].setIcon(piso);
				}
				
			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
		}
}
	
