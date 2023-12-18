package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> enteros=List.of(8,5,-2,4,1,7,12);
		
		System.out.println("---enteros----");
		//llamando al método print definido en esta clase
		//mostrar los números pares de la lista de enteros
		//los dos parámetros son una Collection de enteros y un método Predicate
		print(enteros, e->e%2==0);

		System.out.println("---negativos--");
		//otra implementación del método que imprima los números negativos
		print(enteros, n->n<0);
		
		
		System.out.println("---raices cuadradas----");
		//llamando al método transform, coger la colección de enteros y obtener
		//una colección con las raices cuadradas de cada entero
		//Devuelve una Collection de Double. Aplicamos una function (transforma el dato en otro)
		Collection<Double> raices=transform(enteros, n->Math.sqrt(n));
		System.out.println(raices);
		
	}
	
	
	
	
	//método que muestra todos los números de la colección recibida
	//como parámetro y que cumplen la condición recibida también como parámetro
	static void print(Collection<Integer> col, Predicate<Integer> criterio ) {
		//recorro la coleccion y pregunto por el método test a cada número
		//si da verdadero, imprimimos
		for(Integer elementoin:col) {
			if(criterio.test(elementoin)) {
				System.out.println(elementoin);
			}
		}
		
	}
	
	
	
	//método que recibe una colección de enteros, y devuelve una colección de double
	//resultante de transformar cada entero de la colección en un double
	//según la operación de transformación recibida como parámetro
	static Collection<Double> transform(Collection<Integer> collec, Function<Integer,Double> fun){
		
		//ArrayList para guardar el resultado
		ArrayList<Double> result=new ArrayList<>();
		
		//recorremos la Collection que nos llega como parámetro
		//Aplicamos la funcion que nos llega como parámetro (fun) con apply 
		//a todos los elementos y guardamos el resultado en result
		for(Integer elemento:collec) {
			result.add(fun.apply(elemento));
		}
		//devolvemos ArrayList (que es hijo de Collection)
		return result;
		
		
	}
	
	
	
	

}
