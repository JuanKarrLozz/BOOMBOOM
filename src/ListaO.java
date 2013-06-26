
public class ListaO {
	private Nodo p;
	private Nodo q;
	private Nodo r;
	private Nodo head;		
	public void crear( int datos[][] ){
		if(this.head == null && datos != null){
			for(int x = 0; x < datos.length; x++){
				for(int y = 0; y < datos[x].length; y++){
					Nodo p = new Nodo(datos[x][y]);
					Nodo q = head;
					if(x == 0 && y == 0)
						 head = p;
					else{
						if( y == 0 ){
							while(q.getAbajo() != null) 
								q = q.getAbajo();
							
							q.setAbajo(p);
							p.setArriba(q);
						}else{
							if( x == 0 ){
								while(q.getSiguiente() != null)
									q = q.getSiguiente();
								
								q.setSiguiente(p);
								p.setAnterior(q);
							}else{
								while(q.getAbajo() != null) { q = q.getAbajo(); }
								while(q.getSiguiente() != null) { q = q.getSiguiente(); }
								q.setSiguiente(p);
								p.setAnterior(q);
								if(q.getArriba() != null && q.getArriba().getSiguiente() != null){
									q = q.getArriba().getSiguiente();
									q.setAbajo(p);
									p.setArriba(q);	
								}
							}
						}
					}
				}
			}
		}
		else{
			System.out.println("Error: no es cuadrada la matriz");
		}
	}
	
	public void imprimir(){
		if(head != null){
			Nodo p = head;
			Nodo q = head;
			if(p.getAbajo() != null){
				while(p.getAbajo() != null){
					q = p;
					while(q.getSiguiente() != null){	
						System.out.print("[ "+q.getDato()+" ]");
						q = q.getSiguiente();
					}	
					System.out.println("[ "+q.getDato()+" ]");
					p = p.getAbajo();
				}
				q = p;
				while(q.getSiguiente() != null){
					
					System.out.print("[ "+q.getDato()+" ]");
					q = q.getSiguiente();
				}
				System.out.println("[ "+q.getDato()+" ]");	
			}else{
				while(q.getSiguiente() != null){
					System.out.print("[ "+q.getDato()+" ]");
					q = q.getSiguiente();
				}
				System.out.println("[ "+q.getDato()+" ]");
			}
		}
		else
			System.out.println("Error: Lista Vacia");
		
	}
	
	public int getDato(){
		if(head != null){
			Nodo p = head;
			Nodo q = head;
			if(p.getAbajo() != null){
				while(p.getAbajo() != null){
					q = p;
					while(q.getSiguiente() != null){	
						q = q.getSiguiente();
						return(q.getDato());	
					}	
					p = p.getAbajo();
					return(q.getDato());	
				}
				q = p;
				while(q.getSiguiente() != null){
					
					System.out.print(q.getDato() + "\t");
					q = q.getSiguiente();
				}
				return(q.getDato());	
			}else{
				while(q.getSiguiente() != null){
					q = q.getSiguiente();
					return(q.getDato());	
				}
				return(q.getDato());	
			}
		}
		else
			System.out.println("Error: Lista Vacia");
		return 0;
		
	}
	 
}
