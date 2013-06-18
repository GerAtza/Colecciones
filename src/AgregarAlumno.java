import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AgregarAlumno extends JFrame {
	
	Map<String,Alumno> Alumnos;
	private JLabel nombre,apellidoP,apellidoM,sexo,carrera,edad,noControl;
	private JTextField Nombre,ApellidoP,ApellidoM,Sexo,Carrera,Edad,NoControl;
	private JButton guardar;
	
	public AgregarAlumno(){
		this.Alumnos=new HashMap<String,Alumno>();
		this.setSize(500, 500);
		this.setTitle("Agregar");
		this.setLayout(null);
		
		Alumno a1=new Alumno();
		
		noControl=new JLabel("N° Control: ");
		nombre=new JLabel("Nombre: ");
		apellidoM=new JLabel("Apellido Materno: ");
		apellidoP=new JLabel("Apellido Paterno: ");
		sexo=new JLabel("Sexo: ");
		edad=new JLabel("Edad: ");
		carrera=new JLabel("Carrera: ");
		
		NoControl=new JTextField("");
		Nombre=new JTextField("");
		ApellidoM=new JTextField("");
		ApellidoP=new JTextField("");
		Sexo=new JTextField("");
		Edad=new JTextField("");
		Carrera=new JTextField("");
		
		guardar=new JButton("Guardar");
		guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				Alumno a1=new Alumno();
				try{
					a1.setNombre(Nombre.getText());
					a1.setpApellido(ApellidoP.getText());
					a1.setsApellido(ApellidoM.getText());
					a1.setNoControl(NoControl.getText());
					a1.setEdad(Integer.parseInt(Edad.getText()));
					a1.setSexo(Sexo.getText().charAt(0));
					a1.setCarrera(Carrera.getText());
					Alumnos.put(a1.getNoControl(),a1);				
				}catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Llena todos los Campos");
				}
			}
		});
		
		this.noControl.setBounds(20, 20, 100, 20);
		this.nombre.setBounds(20, 60, 100, 20);
		this.apellidoM.setBounds(20, 100, 105, 20);
		this.apellidoP.setBounds(20, 140, 100, 20);
		this.sexo.setBounds(20, 180, 100, 20);
		this.edad.setBounds(20, 220, 100, 20);
		this.carrera.setBounds(20, 260, 100, 20);
		
		this.NoControl.setBounds(100, 20, 300, 20);
		this.Nombre.setBounds(100, 60, 300, 20);
		this.ApellidoM.setBounds(120, 100, 300, 20);
		this.ApellidoP.setBounds(120, 140, 300, 20);
		this.Sexo.setBounds(100, 180, 300, 20);
		this.Edad.setBounds(100, 220, 300, 20);
		this.Carrera.setBounds(100, 260, 300, 20);
		
		this.guardar.setBounds(200, 400, 200, 50);
		
		this.add(noControl);
		this.add(nombre);
		this.add(apellidoM);		
		this.add(apellidoP);		
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
		
		this.add(guardar);
		
		/*
		Alumno a1=new Alumno();
		a1.setNombre("Gerardo");
		a1.setpApellido("Paredez");
		a1.setsApellido("Navarro");
		a1.setNoControl("2011094141");
		a1.setEdad(22);
		a1.setSexo('M');
		a1.setCarrera("Lic. Computacion");
		
		Alumnos.put(a1.getNoControl(),a1);
		
		System.out.print(Alumnos);
		*/		
		
	}		
}
