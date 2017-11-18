package arraylists;

public class Tecnico extends Empleado {
	
	private float complemento;
	private byte quinquenios;
	
	
	public Tecnico(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal, float sueldo,
			float complemento, byte quinquenios) {
		super(nombre, edad, sexo, dni, bCasado, idpersonal, sueldo);
		this.complemento = complemento;
		this.quinquenios = quinquenios;
	}
	
	public Tecnico() {		
	}


	@Override
	public float calcularAntiguedadMensual() {
		float antiguedad_mensual = quinquenios * 0.05f;
		System.out.println("La antigüedad mensual es de " + antiguedad_mensual);
		return antiguedad_mensual;
	}

	@Override
	public float calcularComplementosMensuales() {
		float complemento_mensual = (sueldo * complemento) / 100;
		System.out.println("El complemento mensual es " + complemento_mensual);
		return complemento_mensual;
	}

	@Override
	public String toString() {
		return "Tecnico [complemento=" + complemento + ", quinquenios=" + quinquenios + ", idpersonal=" + idpersonal
				+ ", sueldo=" + sueldo + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", dni=" + dni
				+ ", bCasado=" + bCasado + "]";
	}



}
