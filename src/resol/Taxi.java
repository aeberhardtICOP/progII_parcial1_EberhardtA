package resol;
import java.util.Scanner;
public class Taxi extends Vehiculo {
	private int nroLicencia;

	public Taxi(String marca, int año, int nro_motor, int nro_chasis, String color, int potenciaCV, String matricula,
			int nroLicencia) {
		super(marca, año, nro_motor, nro_chasis, color, potenciaCV, matricula);
		this.nroLicencia = nroLicencia;
	}
Scanner scanner = new Scanner(System.in);
	public Taxi() {
		super();
		System.out.println("NUEVO TAXI");
		System.out.println("Ingrese nro licencia");
		this.nroLicencia=scanner.nextInt();
	}
	//GETTES Y SETTERS
	public int getNroLicencia() {
		return nroLicencia;
	}
	public void setNroLicencia(int nroLicencia) {
		this.nroLicencia = nroLicencia;
	}
	

	
	
	
}

