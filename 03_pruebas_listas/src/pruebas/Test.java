package pruebas;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		//ArrayList<String> dias= new ArrayList<String>();
		ArrayList<String> dias= new ArrayList<>();
		
		//añadimos elementos
		dias.add("Lunes");
		dias.add("Martes");
		dias.add(1,"Miércoles"); // en posición 1
		dias.add("Jueves");
		dias.add("Viernes");
		dias.add("Sábado");
		dias.add("Domingo");
		
		for(int i=0; i<dias.size(); i++) {
			System.out.println(dias.get(i));
		}
		
		System.out.println("----------- otra forma enchanced for -------");
		
		dias.remove(1);
		dias.add(2,"Miércoles");
		for(String s:dias) {
			System.out.println(s);
		}
		

	}

}
