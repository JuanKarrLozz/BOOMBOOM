public class Nodo{
		private int dato;
				
		private Nodo Arriba;
		private Nodo Abajo;
		private Nodo Siguiente;
		private Nodo Anterior;
							
		public Nodo(int dato){
			this.dato = dato;
			Arriba = null;
			Abajo = null;
			Siguiente=null;
			Anterior = null;			
		}

		public int getDato(){return dato;}
		public void setDato(int dato){this.dato = dato;}
		public Nodo getArriba() {
			return Arriba;
		}
		public void setArriba(Nodo arriba) {
			Arriba = arriba;
		}
		public Nodo getAbajo() {
			return Abajo;
		}
		public void setAbajo(Nodo abajo) {
			Abajo = abajo;
		}
		public Nodo getSiguiente() {
			return Siguiente;
		}
		public void setSiguiente(Nodo siguiente) {
			Siguiente = siguiente;
		}
		public Nodo getAnterior() {
			return Anterior;
		}
		public void setAnterior(Nodo anterior) {
			Anterior = anterior;
		}

		
	}


