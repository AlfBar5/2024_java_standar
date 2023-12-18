package service;

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
	public void extraer(double cantidad) {
		saldo-=cantidad;
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
