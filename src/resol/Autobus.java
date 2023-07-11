package resol;
import java.util.Scanner;
public class Autobus extends Vehiculo {
	private int nroPlazas;

	public Autobus(String marca, int año, int nro_motor, int nro_chasis, String color, int potenciaCV, String matricula,
			int nroPlazas) {
		super(marca, año, nro_motor, nro_chasis, color, potenciaCV, matricula);
		this.nroPlazas = nroPlazas;
	}
	Scanner scanner = new Scanner(System.in);

	public Autobus() {
		super();
		this.nroPlazas = scanner.nextInt();
	}
	//getters y setters
	
	public int getNroPlazas() {
		return nroPlazas;
	}

	public void setNroPlazas(int nroPlazas) {
		this.nroPlazas = nroPlazas;
	}

	
}
