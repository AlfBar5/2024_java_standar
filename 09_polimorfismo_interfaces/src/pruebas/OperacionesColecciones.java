package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OperacionesColecciones {

	public static void main(String[] args) {

		ArrayList<Integer> listanumeros= new ArrayList<>();
		listanumeros.add(6);
		listanumeros.add(5);
		listanumeros.add(5);
		listanumeros.add(8);
		
		System.out.println(sumaLista(listanumeros));
		
		System.out.println("----------");
		
		//imprime array de pares sin recorrer
		System.out.println(numerosPares(listanumeros));
		System.out.println(numerosPares(listanumeros).size());
		
		
	}
	
	
	//realizar un método que reciba una lista de Integer
	//y devuelva la suma de todos los números de la lista
	//usamos List, que es clase padre de ArrayList, Vector, y así se traga todo
	public static int sumaLista(List<Integer> lista) {
		
		int sumanumeros = 0;
		
		for(Integer elemento:lista) {
			sumanumeros= elemento+sumanumeros;
			
			}
				
		return sumanumeros;
	}
	
	
	
	//realizar un método que reciba una colección de enteros (Integer)
	//y devuelva una lista con los pares que hay en esa colección
	public static List<Integer> numerosPares(Collection<Integer> lista){
		
		ArrayList<Integer> listapares= new ArrayList<>();
		
		for(Integer elemento:lista) {
			//if si es par lo añadimos a la lista
				if(elemento%2==0) {
					listapares.add(elemento);
				}
			
			}
		return listapares;
	}
	

}
