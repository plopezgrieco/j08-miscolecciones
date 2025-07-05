package colecciones.genericos;

import java.util.Iterator;

public class ListaArray<T> implements Lista<T> {

	private Object[] almacen;
	private int cant;
	
	public ListaArray(int cant) {
		almacen = new Object[cant];
	}
	
	public ListaArray() {
		this(10);
	}
	
	@Override
	public void agregar(T dato) {
		if (almacen.length == cant)
			redimensionar();
		almacen[cant++] = dato;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T eliminar(int pos) {
		if (pos < 0 || pos >= cant)
			return null;
		
		T eliminado= (T)almacen[pos];
		for (int i = pos; i < cant - 1; i++) {
			almacen[i] = almacen[i + 1];
		}
		cant--;
		return eliminado;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T buscar(int pos) {
		if (pos >= 0 && pos < cant)
			return (T)almacen[pos];
		return null;
	}

	@Override
	public boolean estaVacia() {
		return cant == 0;
	}

	@Override
	public int largo() {
		return cant;
	}
	
	private void redimensionar() {
		Object[] aux = new Object[almacen.length * 2];
		for (int i = 0; i < almacen.length; i++) {
			aux[i] = almacen[i];
		}
		almacen = aux;
	}

	@Override
	public Iterator<T> iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator<T> {

		private int proximo = 0; 
		
		@Override
		public boolean hasNext() {
			return proximo < cant;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			return (T)almacen[proximo++];
		}
		
	}

}
