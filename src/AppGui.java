import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AppGui<E> extends JFrame {
	
	private JMenuBar menu;
	private JButton agregar;
	private JLabel nombre,apellidoP,apellidoM,sexo,carrera,edad,noControl;
	private JTextField Nombre,ApellidoP,ApellidoM,Sexo,Carrera,Edad,NoControl;
	private JComboBox<E> combo;
	
	public AppGui(){
		this.setTitle("Mi Aplicacion de Alumnos con HashMap");
		this.setSize(700, 400);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.agregar=new JButton("Agregar");
		this.agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarAlumno agregar=new AgregarAlumno();
				agregar.setVisible(true);
			}
		});
		
		combo=new JComboBox<>();
		
		noControl=new JLabel("N° Control");
		nombre=new JLabel("Nombre");
		apellidoP=new JLabel("Apellido Paterno");
		apellidoM=new JLabel("Apellido Materno");
		sexo=new JLabel("Sexo");
		edad=new JLabel("Edad");
		carrera=new JLabel("Carrera");
		
		NoControl=new JTextField();
		Nombre=new JTextField();
		ApellidoM=new JTextField();
		ApellidoP=new JTextField();
		Sexo=new JTextField();
		Edad=new JTextField();
		Carrera=new JTextField();
		
		agregar.setBounds(10, 10, 100, 30);
		
		combo.setBounds(450, 100, 200, 20);
		
		noControl.setBounds(50,100,100,20);
		nombre.setBounds(50,150,100,20);
		apellidoP.setBounds(170,145,100,30);
		apellidoM.setBounds(300,145,100,30);
		sexo.setBounds(50,250,100,20); 
		edad.setBounds(150,250,100,20);
		carrera.setBounds(250,250,100,20);
		
		
		NoControl.setBounds(50, 120, 100, 20);
		Nombre.setBounds(50, 170, 100, 20);
		ApellidoP.setBounds(165, 170, 100, 20);
		ApellidoM.setBounds(300, 170, 100, 20);
		Sexo.setBounds(50, 270, 100, 20);
		Edad.setBounds(150, 270, 100, 20);
		Carrera.setBounds(250, 270, 100, 20);
		
		this.add(noControl);
		this.add(nombre);
		this.add(apellidoP);
		this.add(apellidoM);
		this.add(sexo);
		this.add(edad);
		this.add(carrera);
		
		this.add(NoControl);
		this.add(Nombre);
		this.add(ApellidoM);		
		this.add(ApellidoP);		
		this.add(Sexo);		
		this.add(Edad);		
		this.add(Carrera);
		
		this.add(agregar);
				
		this.add(combo);
	}
	
	public static void main(String[] arg0){
		AppGui app=new AppGui();
		app.setVisible(true);
	}
	
}
