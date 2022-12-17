
public class Main {

	public static void main(String[] args) {
	
	Cliente c1 = new Cliente("César", 45, "+1547863251", 500);
	System.out.println(c1.toString());
	Trabajador t1 = new Trabajador("Pablo", 30, "+1547892145", 15000);
	System.out.println(t1.toString());
	
	}
}

class Persona{
	String nombre;
	int edad;
	String telefono;
	public Persona(String nombre, int edad, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + "]";
	}
	
	
	
}

class Cliente extends Persona{
	int credito;

	public Cliente(String nombre, int edad, String telefono, int credito) {
		super(nombre, edad, telefono);
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + ", credito" + credito +"]";
	}
	
}
	

class Trabajador extends Persona{
	int salario;

	public Trabajador(String nombre, int edad, String telefono, int salario) {
		super(nombre, edad, telefono);
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono
				+ ", salario" + salario + "]";
	}
		
}
