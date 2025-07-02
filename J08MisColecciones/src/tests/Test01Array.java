package tests;

import colecciones.Lista;
import colecciones.ListaEnlazada;

public class Test01Array {
	public static void main(String[] args) {
//		Lista l1 = new ListaArray();
		Lista l1 = new ListaEnlazada();
		l1.agregar("hola1");
		l1.agregar("hola2");
		l1.agregar("hola3");
		l1.agregar("hola4");
		l1.agregar("hola5");
		recorre(l1);
		l1.agregar("hola6");
		l1.agregar("hola7");
		l1.agregar("hola8");
		l1.agregar("hola9");
		l1.agregar("hola10");
//		l1.agregar("hola11");
		recorre(l1);
		System.out.println(l1.eliminar(9));
		System.out.println(l1.eliminar(3));
		System.out.println(l1.eliminar(10));
		recorre(l1);
		l1.agregar("ultimo");
		recorre(l1);
	}
	
	public static void recorre(Lista lista) {
		for (int i = 0; i < lista.largo(); i++) {
			System.out.println(lista.buscar(i));
		}
	}
}
