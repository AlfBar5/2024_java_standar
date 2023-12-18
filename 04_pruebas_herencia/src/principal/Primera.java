package principal;


public class Primera {

	private int a;
	
	
	//constructor sin parámetros
	public Primera() {
		super();
		// TODO Auto-generated constructor stub
	}


	//constructor con parámetros
	public Primera(int a) {
		this.a=a;
		System.out.println("Constructor de clase primera: "+a);
	}
	
	
	//método
	public void print() {
		System.out.println("Imprimiendo en clase Primera");
	}
	
}
