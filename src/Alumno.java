
public class Alumno {
	
	private String noControl;
	private String nombre;
	private String pApellido;
	private String sApellido;
	private int edad;
	private char sexo;
	private String carrera;
	
	public Alumno(){
		this.noControl="";
		this.nombre="";
		this.pApellido="";
		this.sApellido="";
		this.edad=0;
		this.sexo=' ';
		this.carrera="";
	}

	public String getNoControl() {
		return noControl;
	}

	public void setNoControl(String noControl) {
		this.noControl = noControl;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getpApellido() {
		return pApellido;
	}

	public void setpApellido(String pApellido) {
		this.pApellido = pApellido;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [noControl=" + noControl + ", nombre=" + nombre
				+ ", pApellido=" + pApellido + ", sApellido=" + sApellido
				+ ", edad=" + edad + ", sexo=" + sexo + ", carrera=" + carrera
				+ "]";
	}
	
	
	
}
