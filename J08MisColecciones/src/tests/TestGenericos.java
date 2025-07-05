package tests;

import colecciones.genericos.Lista;
import colecciones.genericos.ListaArray;
import colecciones.genericos.ListaEnlazada;

public class TestGenericos {
	public static void main(String[] args) {
		Lista<String> lista = new ListaArray<>();
		
		lista.agregar("hola");
		lista.agregar("hola");
		lista.agregar("hola");
		lista.agregar("hola");
		
		for (String str : lista) {
			System.out.println(str);
		}
		
		Lista<Integer> listaNums = new ListaEnlazada<>();

		listaNums.agregar(148);
		listaNums.agregar(3148);
		listaNums.agregar(48);
		
		for (Integer integer : listaNums) {
			System.out.println(integer);
		}
	}
}
