package geometria;

/*
La clase Figura representa una figura geométrica
Toda figura geométrica, se caracteriza por un atributo "color"
y un método para calcular su superficie. 
 */

public abstract class Figura {

	//atributo
	private String color;

	//constructor con un parámetro
	public Figura(String color) {
		super();
		this.color = color;
	}

	//getter
	public String getColor() {
		return color;
	}

	//setter
	public void setColor(String color) {
		this.color = color;
	}
	
	//no puedo en esta clase calcular la superficie de las figuras geométricas
	//pero puedo hacer un método abstract para que lo hereden las clases hijas y lo implementen
	//obligándolas así a que lo adopten con el mismo nombre y forma (polimorfismo)
	//si hay un método abstracto(sin cuerpo {}), la clase tiene que ser abstract
	
	public abstract double superficie();
	
}
