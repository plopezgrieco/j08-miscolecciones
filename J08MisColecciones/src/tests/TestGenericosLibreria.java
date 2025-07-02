package tests;

import java.util.ArrayList;

public class TestGenericosLibreria {
	public static void main(String[] args) {
//		ArrayList miLista = new ArrayList();
//		
//		miLista.add("hola que tal");
//		miLista.add(158);
		
//		String miDato = miLista.get(0);
		
		ArrayList<String> listaCad = new ArrayList<>();
		listaCad.add("hola");
//		listaCad.add(158);
		String miDato = listaCad.get(0);
		System.out.println(miDato);
	}
}
