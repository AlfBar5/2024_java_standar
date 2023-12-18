package principal;


public class Segunda extends Primera {
	
	//constructor
	public Segunda() {
		//clase invisible que aunque no pongamos está siempre omnipresente
		//super();
		
		super(3); //esto hace que se pinte el contructor de la clase primera con parámetros
		System.out.println("Constructor de clase segunda");
	}

	
	
	
	//se hereda el método print() de la clase primera
	//pero ahora lo sobreescribo
	
	@Override
	public void print() {
		System.out.println("método sobreescrito-imprimiento en clase segunda");
	}
	
}
