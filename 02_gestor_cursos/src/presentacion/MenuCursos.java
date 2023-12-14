package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import model.Curso;
import service.CursosService;

public class MenuCursos {
	
	//crear objeto CursosService para poder llamar a sus métodos
	static CursosService service= new CursosService();

	
	
	public static void main(String[] args) {
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			mostrarMenu();
			opcion=sc.nextInt(); //lee la opción elegida
			
			switch(opcion) { //evaluamos
				case 1:
					nuevoCurso();
					break;
				case 2:
					cursosPrecioMax();
					break;
				case 3:
					eliminarCurso();
					break;
				case 4:
					modificarDuracion();
					break;
				case 5:
					System.out.println("Adios");
			
			}
					
		}while(opcion!=5);
		
	}
	
	
	//Métodos todos static ya que main es static. 
	//Solo pueden llamar a otros miembros de su misma clase que	también sean static
	static void mostrarMenu() {
		
		System.out.println("1.- Nuevo curso");
		System.out.println("2.- Buscar cursos por precio máximo");
		System.out.println("3.- Eliminar curso");
		System.out.println("4.- Modificar duración curso");
		System.out.println("5.- Salir");
		
	}
	
	
	
	static void nuevoCurso(){
		//Declaro variables y variable scanner y ya creo el objeto scanner (para leer del teclado)
		String nombre;
		Integer duracion;
		Double precio;
		Scanner scnc= new Scanner(System.in);
				
		System.out.println("Introduce nombre: ");
		nombre=scnc.nextLine().toString();
		System.out.println("Introduce duración en meses: ");
		duracion=Integer.parseInt(scnc.nextLine());
		System.out.println("Introduce precio del curso: ");
		precio=Double.parseDouble(scnc.nextLine());
		
		if(service.nuevo(nombre, duracion, precio)){
			System.out.println("Curso añadido");
		}else {
			System.out.println("ERROR. Curso ya existente con el mismo nombre.");
		}
	}
	
	
	
	
	
	static void cursosPrecioMax() {
		
		Double preciomax;
		ArrayList<Curso> cursos = new ArrayList<>();
		Scanner sccpm= new Scanner(System.in);
		
		System.out.println("Introduce precio máximo: ");
		preciomax=Double.parseDouble(sccpm.nextLine());
		
		cursos = service.preciosCursoMax(preciomax);
		for(Curso c:cursos) {
			System.out.println(c.getNombre()+"-"+c.getDuracion()+"-"+c.getPrecio());
		}
		
		
	}
	
	
	
	static void eliminarCurso() {
		Scanner sc=new Scanner(System.in);
		String nombre;
		
		System.out.println("Introduce nombre del curso a eliminar: ");
		nombre=sc.nextLine().toString();
		
		service.eliminarCurso(nombre);
		
	}
	
	
	static void modificarDuracion() {
		Scanner sc=new Scanner(System.in);
		String nombre;
		int nuevaDuracion;
		
		System.out.println("Introduce nombre del curso a modificar duración: ");
		nombre=sc.nextLine().toString();
		System.out.println("Introduce nueva duración en meses: ");
		nuevaDuracion=Integer.parseInt(sc.nextLine());
		
		service.modificarDuracion(nombre, nuevaDuracion);
		
		
	}

}
