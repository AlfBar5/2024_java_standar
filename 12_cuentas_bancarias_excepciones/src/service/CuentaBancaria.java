package service;

import exceptions.SaldoNegativoException;

public class CuentaBancaria {

	private double saldo;

	
	
	//constructor con parámetro
	public CuentaBancaria(double saldo) {
		
		this.saldo = saldo;
	}
	
	
	
	//método ingresar
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	
	//método extraer dinero
	public void extraer(double cantidad) throws SaldoNegativoException {
		if(cantidad>saldo) {
			//provocamos la excepción
			//creamos un objeto de la clase excption y lo lanzamos con throw
			//excepciones personalizadas son Checkectm hay que capturarlas 
			//o propagarlas en la cabecera del método con throws
			throw new SaldoNegativoException();
		}else {
			saldo-=cantidad;
		}
		
	}


	//getter - leer saldo
	public double getSaldo() {
		return saldo;
	}


	//setter - modificar saldo
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
}
