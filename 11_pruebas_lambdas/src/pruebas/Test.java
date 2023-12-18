package pruebas;


interface I1{
	void print(int a);
}


interface I2{
	void cal(String s);
}



interface I3{
	String construct(int a, int b);
}


interface I4{
	boolean test(int a, int b);
}


interface I5{
	int get();
}

interface I6{
	void tx(String a, int b);
}




public class Test {

	public static void main(String[] args) {
		// crear una implementación libre de cada interfaz
		
		//recibe un int y no devuelve nada, pero podemos imprimir el parámetro
		I1 i1= a->System.out.println(a);
		
		//recibe un string y devuelve un int
		I2 i2= s->s.length();
		
		//recibe dos int y devuelve un String, 
		//devovemos por ejemplo la concatenación de los dos enteros
		//como son dos hay que poner paréntesis
		I3 i3= (a,b)->a+"-"+b;

		//recibe dos int y devuelve un boolean
		I4 i4= (a,b)->a>b;
		
		//no recibe nada y devuelve un int
		I5 i5 =()->9;
		
		//no devuelve nada y recibe un int y un string, tenemos que usar un método que devuelva void, como system.out.println
		I6 i6 = (x,y)->System.out.println(x+y);
		
	}

	

}
