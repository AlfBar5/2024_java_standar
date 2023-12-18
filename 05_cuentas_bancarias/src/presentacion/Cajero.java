package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaBancariaMovimientos;


//al iniciar el programa, se solicita un saldo inicial y un límite
//A partir de ahí, se mostrará el menú
				
/*
1.- Ingresar
2.- Extraer
3.- Saldo y movimientos
4.- Salir 
*/		


public class Cajero {

	//Creo un objeto CuentaBancariaMovimientos para poder acceder a sus métodos 
	//(sin new, porque no se puede hacer aquí arriba ya que no tengo los datos de saldo y limite
	static CuentaBancariaMovimientos cuentamov;
	 
	public static void main(String[] args) {

			
		Scanner scpedir=new Scanner(System.in);
		//pido  saldo, pido límite y creo objeto CuentaMovimientos
		
		double saldo,limite;
				
		System.out.println("Introduce el saldo inicial:");
		saldo=Double.parseDouble(scpedir.nextLine());
		
		System.out.println("Introduce el límite:");
		limite=Double.parseDouble(scpedir.nextLine());
		
		cuentamov = new CuentaBancariaMovimientos(saldo, limite);
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					ingresar();
					break;
				case 2:
					extraer();
					break;
				case 3:
					mostrarMovimientos();
					break;
							
				case 4:
					System.out.println("---Adios---");
			}
		}while(opcion!=4);
			
	
		}
		
		//generar menú
		static void mostrarMenu() {
			
			System.out.println("1.- Ingresar dinero");
			System.out.println("2.- Extraer dinero");
			System.out.println("3.- Saldo y movimientos");
			System.out.println("4.- Salir");

		}
	
	
		static void ingresar() {
			
			double cantidad;
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce cantidad a ingresar");
			cantidad=Double.parseDouble(sc.nextLine());
			cuentamov.ingresar(cantidad);
			
		}
	
		static void extraer() {
			
			double cantidad;
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce cantidad a sacar");
			cantidad=Double.parseDouble(sc.nextLine());
			cuentamov.extraer(cantidad);
			
		}
		
		static void mostrarMovimientos() {
			
			ArrayList<Movimiento> movs=cuentamov.obtenerMovimientos();
			
			for(Movimiento m:movs) {
				System.out.println("Tipo: "+m.getTipo()+"-Cantidad: "+m.getCantidad()+"-Fecha movimiento: "+m.getFechaHora());
				
			}
			System.out.println("Saldo final: "+cuentamov.getSaldo());
			
		}

}
