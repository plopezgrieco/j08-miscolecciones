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
		return new MiIterator<>();
	}
	
	private class MiIterator<T> implements Iterator<T>{

		int actual = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
