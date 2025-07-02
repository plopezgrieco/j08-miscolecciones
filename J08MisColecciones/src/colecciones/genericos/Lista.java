package colecciones.genericos;

public interface Lista <T> extends Iterable<T>{

	void agregar(T dato);
	
	T eliminar(int pos);
	
	T buscar(int pos);
	
	boolean estaVacia();
	
	int largo();
}
