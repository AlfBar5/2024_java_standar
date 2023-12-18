package service;


/*
 
clase CuentaBancariaLimite
Clase que hereda CuentaBancaria. Incorporará un atributo "limite",
para limitar la extracción a dicho valor.

Dispondrá de un método ajustarLimite(), para cambiar el límite a la mitad del saldo
 
 */


public class CuentaBancariaLimite extends CuentaBancaria {

	private double limite;
	
	//sobreescribimos el constructor con parámetros, añadiento otro parámetro más
	public CuentaBancariaLimite(double saldo, double limite) {
		super(saldo);
		this.limite=limite;
	}

	

	
	//sobreescribir el método extraer para tener en cuenta el límite
	@Override
	public void extraer(double cantidad) {
		
		//super.extraer(cantidad);
				
		// si no supera el límite, se saca el dinero.
		// si supera el límite solo deja sacar el límite
		if (cantidad<=limite) {
			
			//si no supera el límite, podemos sacar la cantidad que pedimos
			super.extraer(cantidad);
			
		}else {
			//solo se puede sacar el límite
			super.extraer(limite);
			System.out.println("Superado el límite de extracción: "+limite);
			
		}
		
	}


	//método para ajustar el límite a la mitad del saldo
	public void ajustarLimite() {
		limite=getSaldo()/2;
		
	}

	//getter ver el límite
	public double getLimite() {
		return limite;
	}



	//setter cambiar límite
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
	
}
