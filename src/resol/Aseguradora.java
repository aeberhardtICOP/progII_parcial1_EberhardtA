package resol;
import java.util.Scanner;
import java.util.ArrayList;
public class Aseguradora {
	private String nombre;
	private String domicilio;
	private ArrayList<Cliente>clientes;
	private ArrayList<Vehiculo>vehiculos;
	private ArrayList<Poliza>polizas;
	
	Scanner scanner = new Scanner(System.in);
	
	public Aseguradora(String nombre, String domicilio) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.clientes=new ArrayList();
		this.polizas=new ArrayList();
		this.vehiculos=new ArrayList();
	}
	public Aseguradora() {
		System.out.println("NUEVA ASEGURADORA");
		System.out.println("Ingrese nombre:");
		this.nombre=scanner.nextLine();
		System.out.println("Ingrese domicilio");
		this.domicilio=scanner.nextLine();
		this.clientes=new ArrayList();
		this.polizas=new ArrayList();
		this.vehiculos=new ArrayList();
	}
//agregar persona:
	public void agregarPersona() {
		clientes.add(new Cliente());
	}
//listar clientes
	public void listarPersonas() {
		for (int i = 0; i<clientes.size();i++) {
			clientes.get(i).mostrar();
		}
	}
//Buscar cliente por documento:
	public void buscarPorDocumentoYMostrar() {
		System.out.println("Ingrese dni");
		int dni = scanner.nextInt();
		for(int i=0;i<clientes.size();i++) {
			if(dni==clientes.get(i).getDni()) {
				clientes.get(i).mostrar();
			}
		}
	}
//registrar vehiculo
	public void registrarVehiculo() {
		System.out.println("Que desea registrar 1)taxi, 2)autobus");
		int opcion = scanner.nextInt();
		switch(opcion) {
		case 1: 
			vehiculos.add(new Taxi());
			break;
		case 2:
			vehiculos.add(new Autobus());
			break;
		default:
			System.out.println("No ingreso opcion valida");
		}

	}
//getters && setters.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
}

