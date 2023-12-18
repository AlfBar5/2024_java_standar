package exceptions;

//Herencia de Exception
public class SaldoNegativoException extends Exception {
	
	//mensaje personalizado
	public SaldoNegativoException() {
		super("MENSAJE: El saldo va a quedar en negativo!!");
	}
	
	
}
