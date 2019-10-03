public class Prueba {
private String datos = "";
	private String nombCompleto = "";
	private String ciudadNacimiento = "";
	private String localidadActual = "";
	public Prueba() {
		
	}
	public String nombreCompleto(String nombre, String apellido1, String apellido2) {
		concat(nombre, " ", apellido1, " ", apellido2)= nombCompleto;
		return nombCompleto;
	}
	public String ciudadNacim(String ciudad) {
		ciudad = ciudadNacimiento;
		return ciudadNacimiento;
	}
	public String localidadActual(String localidad) {
		localidad = localidadActual;
		return localidadActual;
	}
	public String toString() {
		return nombCompleto + "\n" +  ciudadNacimiento + "\n" +  localidadActual;
	}
}