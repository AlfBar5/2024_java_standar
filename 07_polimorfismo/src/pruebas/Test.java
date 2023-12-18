package pruebas;

public class Test {

	public static void main(String[] args) {
		// crear un objeto de las clases primera y segunda y llamar a print
		Primera prime =new Primera(5);
		prime.print();
		
		Segunda segun= new Segunda(4,"Marca");
		segun.print();
		
		
		//usando polimorfismo
		System.out.println("-------------");
		llamadas(new Primera(5));
		llamadas(new Segunda(4,"Marca"));
		
	}
	
	//métodos donde el parámetro en una clase padre
	//podemos llamar a cualquier método de las subclases de la clase padre
	static void llamadas(Base b) {
		b.print();
	}

}
