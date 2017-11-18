package arraylists;

public abstract class Empleado extends Persona {
	protected String idpersonal;
	protected float sueldo;

	public Empleado(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal, float sueldo) {
		super(nombre, edad, sexo, dni, bCasado);
		this.idpersonal = idpersonal;
		this.sueldo = sueldo;
	}
	
	public Empleado() {
	}
	
	public abstract float calcularAntiguedadMensual(); // Método abstracto
	
	public abstract float calcularComplementosMensuales(); // Método abstracto
	

	public String getIdpersonal() {
		return idpersonal;
	}

	public void setIdpersonal(String idpersonal) {
		this.idpersonal = idpersonal;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public void pintar() {		
		super.pintar();
		System.out.println("Los datos de esta persona son: \nNombre: " + nombre +
				"\nEdad: " + edad +
				"\nSexo: " + sexo +
				"\nDni: " + dni +
				"\nCasado: " + bCasado + 
				"\nID Personal: " + idpersonal +
				"\nSueldo: " + sueldo);
	}
		
}
