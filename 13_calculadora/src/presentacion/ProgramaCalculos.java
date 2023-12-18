package presentacion;

import java.util.Scanner;

import service.Calculadora;

public class ProgramaCalculos {

	
	public static void main(String[] args) {
		
		//creamos variables
		Calculadora cal;
		int n1,n2,n3;
		int opcion;
		
		//Declaro variable scanner y ya creo el objeto scanner (para leer del teclado
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce primer número");
		n1=sc.nextInt();
		System.out.println("Introduce segundo número");
		n2=sc.nextInt();

		
		//creamos objeto calculadora y guardamos en variable tipo objeto Calculadora
		cal = new Calculadora(n1,n2);
		
		//mostramos menú
		//mediante un bucle while, vamos mostrando el menú 
		//hasta que seleccione la opción de salir
		
		do {
			System.out.println("1.- SUMAR");
			System.out.println("2.- RESTAR");
			System.out.println("3.- MULTIPLICAR");
			System.out.println("4.- DIVIDIR");
			System.out.println("5.- FACTORIAL (del primer número)");
			System.out.println("6.- SALIR");
			//Recogemos en variable opción lo que nos devuelva el escaner
			opcion = sc.nextInt();
			
			//comprobamos la opción elegida y realizamos la operación correspondiente.
			switch(opcion) {
			case 1:
				//llamamos al método sumar
				System.out.println(cal.sumar());
				break;
			case 2:
				//llamamos al método restar
				System.out.println(cal.restar());
				break;
			case 3:
				//llamamos al método 
				System.out.println(cal.multiplicar());
				break;
			case 4:
				//llamamos al método 
				System.out.println(cal.dividir());
				break;			
			case 5:
				System.out.println("Dame un número");
				n3=sc.nextInt();
				//llamamos al método factorial
				System.out.println("El factorial es: "+cal.factorial(n3));
				break;	
			case 6:
				//llamamos al método 
				System.out.println("Adios");
							
			}			
			
		}while(opcion!=6);
		
		
		
		
	}

}
