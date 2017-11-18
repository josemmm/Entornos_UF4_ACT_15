package arraylists;

public class Persona {
	protected String nombre;
	protected byte edad;
	protected char sexo;
	protected String dni;
	protected boolean bCasado;
	
	public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = dni;
		this.bCasado = bCasado;
	}
	
	public Persona() {		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isbCasado() {
		return bCasado;
	}

	public void setbCasado(boolean bCasado) {
		this.bCasado = bCasado;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", dni=" + dni + ", bCasado="
				+ bCasado + "]";
	}

	public void pintar() {
		System.out.println("Los datos de esta persona son: \nNombre: " + nombre +
							"\nEdad: " + edad +
							"\nSexo: " + sexo +
							"\nDni: " + dni +
							"\nCasado: " + bCasado);
	}
		

}
