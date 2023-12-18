package presentacion;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import service.Calculadora;

/*
 * Crear un tipo de ventana, para crear ventanas con fondo amarillo, 
 * tamaño 600x400 y titulo personalizado
 * 
 */

public class MiVentana extends JFrame{

	
	

	
	//añadir  constructor que permita establecer titulo, 
	//posición y tamaño de la ventana
	public MiVentana (String titulo, int posHoriz, int posVert, int ancho, int alto) {
		
		super(titulo);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(posHoriz, posVert, ancho, alto);
		//getContentPane().setBackground(Color.BLUE);
		inicializarComponentes();
		setVisible(true);
	
	
		
	}
	
	void inicializarComponentes(){
		
		//desactivar gestor automático de ventanas
		setLayout(null);
		
		//// TRES PASOS
		//1- Creamos objetos
		JLabel lbl1=new JLabel("NÚMERO 1: ");
		JLabel lbl2=new JLabel("NÚMERO 2: ");
		JTextField txtNumero1= new JTextField();
		JTextField txtNumero2= new JTextField();
		JButton btnSumar = new JButton("SUMAR");
		JButton btnRestar = new JButton("RESTAR");
		JButton btnMultiplicar = new JButton("MULTIPLICAR");
		JButton btnDividir = new JButton("DIVIDIR");
		
		//2-establecer propiedades
		lbl1.setBounds(100, 50, 80, 30);
		lbl2.setBounds(100, 120, 80, 30);
		
		txtNumero1.setBounds(250, 50, 80, 30);
		txtNumero2.setBounds(250, 120, 80, 30);
		
		btnSumar.setBounds(100, 200, 120, 30);
		btnRestar.setBounds(300, 200, 120, 30);
		btnMultiplicar.setBounds(100, 300, 120, 30);
		btnDividir.setBounds(300, 300, 120, 30);
		
		//3-meterlos en el contenedor
		//MiVentana extends JFrame. Polimorfismo 
		//add(Component cmp). Método add() de Container
		//Component es la clase padre de todos los componentes gráficos
		//y tiene el método add, que podemos añadir todos los componentes de las clases hijas
		add(lbl1);
		add(lbl2);
		add(txtNumero1);
		add(txtNumero2);
		add(btnSumar);
		add(btnRestar);
		add(btnMultiplicar);
		add(btnDividir);
		
		//si no existiese polimorfismo, 
		//habría que crear un método add para label, botones, input, etc.
		
		
		
		
		//al botón hay que asociar el método addActionListener (polmorfismo, objeto que implementa una interfaz
		btnSumar.addActionListener(a->{
			JOptionPane.showMessageDialog(MiVentana.this, "La suma es: " +
					new Calculadora(Integer.parseInt(txtNumero1.getText()),
							Integer.parseInt(txtNumero2.getText())).sumar());
					
		});
		
		btnMultiplicar.addActionListener(a->{
			JOptionPane.showMessageDialog(MiVentana.this, "La multiplicación es: "+
					new Calculadora(Integer.parseInt(txtNumero1.getText()),Integer.parseInt(txtNumero2.getText()))
					.multiplicar());
		});
		btnRestar.addActionListener(a->{
			JOptionPane.showMessageDialog(MiVentana.this, "La resta es: "+
					new Calculadora(Integer.parseInt(txtNumero1.getText()),Integer.parseInt(txtNumero2.getText()))
					.restar());
		});
		btnDividir.addActionListener(a->{
			JOptionPane.showMessageDialog(MiVentana.this, "La división  es: "+
					new Calculadora(Integer.parseInt(txtNumero1.getText()),Integer.parseInt(txtNumero2.getText()))
					.dividir());
		});
		
		
	}
	
}
