package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Crear un tipo de ventana, para crear ventanas con fondo amarillo, 
 * tamaño 600x400 y titulo personalizado
 * 
 */

public class MiVentana extends JFrame{

	//constructor
	public MiVentana(String titulo) {
		//llamamos al constructor de la superclase con parémetro titulo:
		super(titulo);
		
		//cambiar comportamiento botón de cierre
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//establecer tamaño y posición (horizontal x, vertical y, ancho y alto)
		//LLamamos al constructor de la superclase jFrame que acepta estos parámetrsos
		setBounds(100, 50, 600, 400);
		
		//fondo amarillo
		//LLamamos al constructor de la superclase jFrame que acepta estos parámetrsos 
		getContentPane().setBackground(Color.YELLOW);
		
		//la hacemos visible
		//LLamamos al constructor de la superclase jFrame 
		setVisible(true);
		
	}

	
	//añadir un segundo constructor que permita establecer titulo, 
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
		JLabel lbl1=new JLabel("Usuario: ");
		JLabel lbl2=new JLabel("Contraseña: ");
		JTextField txtUsuario= new JTextField();
		JTextField txtPassword= new JTextField();
		JButton btnEntrar = new JButton("ENTRAR");
		
		//2-establecer propiedades
		lbl1.setBounds(150, 100, 120, 40);
		lbl2.setBounds(150, 170, 120, 40);
		txtUsuario.setBounds(350, 100, 120, 40);
		txtPassword.setBounds(350, 170, 120, 40);
		btnEntrar.setBounds(250, 230, 150, 30);
		
		//3-meterlos en el contenedor
		//MiVentana extends JFrame. Polimorfismo 
		//add(Component cmp). Método add() de Container
		//Component es la clase padre de todos los componentes gráficos
		//y tiene el método add, que podemos añadir todos los componentes de las clases hijas
		add(lbl1);
		add(lbl2);
		add(txtUsuario);
		add(txtPassword);
		add(btnEntrar);
		
		//si no existiese polimorfismo, 
		//habría que crear un método add para label, botones, input, etc.
		
		
		//creamos clase dentro de un método
		//crear una clase anónima que implemente esta interfaz ActionListener
		//una clase anónima permite definir la clase (sin nombre ni class)
		//y crear un objeto de ella
		/*
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// recogo el valor de los campos de texto y veo si es válido
				if(txtUsuario.getText().equals("admin")&&txtPassword.getText().equals("1234")) {
					JOptionPane.showMessageDialog(MiVentana.this, "Usuario válido");
				}else {
					JOptionPane.showMessageDialog(MiVentana.this, "Usuario incorrecto");
				}
				
			}
		}; 
		*/
		//fin de clase anónima
		
		//otra forma con expresiones lambda
		
		ActionListener listener=e->{
			// recogo el valor de los campos de texto y veo si es válido
			if(txtUsuario.getText().equals("admin")&&txtPassword.getText().equals("1234")) {
				JOptionPane.showMessageDialog(MiVentana.this, "Usuario válido");
			}else {
				JOptionPane.showMessageDialog(MiVentana.this, "Usuario incorrecto");
			}
			
		
		}; 
		
		
		//al botón hay que asociar el método addActionListener (polmorfismo, objeto que implementa una interfaz
		btnEntrar.addActionListener(listener);
	}
	
}
