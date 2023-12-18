package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import exceptions.SaldoNegativoException;
import model.Movimiento;

public class CuentaBancariaMovimientos extends CuentaBancariaLimite {
	
	//atributo arraylist para guardar los movimientos
	private ArrayList<Movimiento> movimientos=new ArrayList<>();

	
	
	//Constructor
	public CuentaBancariaMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}
	
	
	//método obtener movimientos
	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}


	//Sobreescribimos los métodos ingresar y extraer para que registren
	//el movimiento producido
	//si yo quiere que cuando saque o meta dinero se registre en los movimientos, 
	//hay que definirlos (sobreescribirlos) otra vez
	
	@Override
	public void extraer(double cantidad) throws SaldoNegativoException {
		
		super.extraer(cantidad);
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),TipoMovimiento.EXTRACCION));
	
	}


	@Override
	public void ingresar(double cantidad) {
		
		super.ingresar(cantidad);
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),TipoMovimiento.INGRESO));
	
	}
	
	
	
	
	
}
