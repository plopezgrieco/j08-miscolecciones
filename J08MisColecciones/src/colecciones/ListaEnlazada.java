package colecciones;

public class ListaEnlazada implements Lista {

	private Nodo primero;
	private Nodo ultimo;
	private int cant;
	
	@Override
	public void agregar(String dato) {
		Nodo nuevo = new Nodo(dato);
		if (primero == null)
			primero = nuevo;
		else
			ultimo.siguiente = nuevo;
		ultimo = nuevo;
		cant++;
	}

	@Override
	public String eliminar(int pos) {
		if(pos < 0 || pos >= cant)
			return null;
		
		String buscado;
		
		//si eliminamos el primero
		if(pos == 0) {
			buscado = primero.dato;
			//si era el único
			if(cant == 1) {
				primero = null;
				ultimo = null;
			} else
				primero = primero.siguiente;
			cant--;
			return buscado;
		}
		
		//La lista tiene n nodos (más de uno)
		Nodo anterior = anterior(pos);
		buscado = anterior.siguiente.dato;
		
		//Si eliminamos el último
		if(pos == cant - 1) {
			anterior.siguiente = null;
			ultimo = anterior;
			cant--;
			return buscado;
		}
		
		Nodo actual = anterior.siguiente;
		anterior.siguiente = actual.siguiente;
		cant--;
		return buscado;
	}

	@Override
	public String buscar(int pos) {
		if(pos < 0 || pos >= cant)
			return null;
		
		if(pos == 0)
			return primero.dato;
		
		if(pos == cant - 1)
			return ultimo.dato;
		
		Nodo anterior = anterior(pos);
		Nodo buscado = anterior.siguiente;
		return buscado.dato;
	}
	
	private Nodo anterior(int pos) {
		Nodo aux = primero;
		for (int i = 0; i < pos - 1; i++) {
			aux = aux.siguiente;
		}
		return aux;
	}

	@Override
	public boolean estaVacia() {
		return cant == 0;
	}

	@Override
	public int largo() {
		return cant;
	}
	
	private class Nodo {
		String dato;
		Nodo siguiente;
		
		Nodo(String dato){
			this.dato = dato;
		}
	}
}
