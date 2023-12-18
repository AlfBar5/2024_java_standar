package pruebas;

//clase padre
public class Base {
	
	//método print
	public void print() {
		System.out.println("Indeterminado");
	
	}
	
}




//subclase hija de base
class Primera extends Base{
	
	private int k;
	
	public Primera(int k) {
		this.k = k;
	}

	@Override
	public void print() {
		System.out.println("Clase Primera con atributo: "+k);
	}
	
	
}





//subclase hija de base
class Segunda extends Base{
	
	private int a;
	private String n;
	

	public Segunda(int a, String n) {
		super();
		this.a = a;
		this.n = n;
	}


	@Override
	public void print() {
		System.out.println("Clase Segunda con atributos: "+a+" y "+n);
	}
	
	
}






