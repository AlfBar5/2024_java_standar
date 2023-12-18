package geometria;

public class CalculaDatos {

	public static void main(String[] args) {
		//AHORA USAMOS POLIMORFISMO
		//USAMOS LOS MISMOS NOMBRES DE MÉTODO DE DOS CLASES DIFERENTES (CIRCULO Y TRIANGULO)
		//en lugar de una variable círculo o triángulo, usamos una variable Figura que está definida en la clase padre Figura.java
				
		mostrarDatos(new Triangulo("naranja",20,6));
				
		mostrarDatos(new Circulo("verde",10));

	}

	
	
	static void mostrarDatos(Figura fr) {
		
		//sacamos color figura 
		//para sacar info como la clase de los objetos
		//MÉTODO getClass()
		System.out.println("Color del "+fr.getClass().getSimpleName()+": "+fr.getColor());
		//sacamos superficie figura
		System.out.println("Superficie del "+fr.getClass().getSimpleName()+": "+fr.superficie());
		
	}
	
}
