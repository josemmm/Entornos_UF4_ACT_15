package arraylists;

public class Obrero extends Empleado {
	
	private byte trienios;
	private char turno;

		
	public Obrero(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal, float sueldo,
			byte trienios, char turno) {
		super(nombre, edad, sexo, dni, bCasado, idpersonal, sueldo);
		this.trienios = trienios;
		this.turno = turno;
	}
	
	public Obrero() {
	}

	@Override
	public float calcularAntiguedadMensual() {
		float antiguedad_mensual = trienios * 0.03f;
		System.out.println("La antigüedad mensual es de " + antiguedad_mensual);
		return antiguedad_mensual;
	}

	@Override
	public float calcularComplementosMensuales() {
		if (turno == 'N') {
			float complemento_mensual = (sueldo * 3) / 100;
			System.out.println("El complemento mensual es de " + complemento_mensual);
			return complemento_mensual; 
		} else {
		System.out.println("No trabaja de turno de noche, por lo que no tiene complemento");
		return 0f;
	}

	}

	@Override
	public String toString() {
		return "Obrero [trienios=" + trienios + ", turno=" + turno + ", idpersonal=" + idpersonal + ", sueldo=" + sueldo
				+ ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", dni=" + dni + ", bCasado=" + bCasado
				+ "]";
	}


}