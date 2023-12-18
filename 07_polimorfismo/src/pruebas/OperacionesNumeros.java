package pruebas;

//ejemplo polimorfismo

public class OperacionesNumeros {

	public static void main(String[] args) {

		Double a=5.78;
		Integer b=345;
		Byte c=33;
		
		System.out.println(calcularCuadrado(a));
		System.out.println(calcularCuadrado(b));
		System.out.println(calcularCuadrado(c));
		
		//mostramos valor entero del número generado aleatoriamente
		Number n=getRandomNumber();
		System.out.println(n.intValue());
		
	}
	
	


	
	//realizar un método que calcule el cuadrado de cualquier número el resultado se devuelve como entero
	
	
	private static int calcularCuadrado(Number num){
		 
		int n=num.intValue();
		return n*n;
	}
	

	//hacer método que te devuelva, aleatoriamente, un Double, un Integer o un Long
	//el tipo de devolución, como no lo sabemos, ponemos la clase padre Number
	private static Number getRandomNumber() {
		
		//número aleatorio entre 1 y 3
		int numberType=(int)(Math.random()*3+1);
		
		switch(numberType) {
		case 1:
			return Double.valueOf(7.45);			
		case 2:
			return Integer.valueOf(200);
		case 3:
			return Long.valueOf(30);
		default:
			return Long.valueOf(50);
		}
		
	}



}
