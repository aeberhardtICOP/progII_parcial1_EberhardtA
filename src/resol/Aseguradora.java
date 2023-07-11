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
	public void agregarPersona(Cliente cliete) {
		clientes.add(cliete);
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
	public int buscarPorDocumento(int dni) {
		for(int i=0;i<clientes.size();i++) {
			if(dni==clientes.get(i).getDni()) {
				return i;
			}
		}
		return -1;
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
	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
//listar vehiculos
	public void listarVehiculos() {
		for(int i=0;i<vehiculos.size();i++) {
			vehiculos.get(i).mostrar();
		}
	}
	public void listarVehiculosPor() {
		System.out.println("Ingrese filtro 1)tipo, 2)cobertura");
		int opcion=scanner.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Ingrese filtro: 1)TAXI, 2)AUTOBUS");
				int o=scanner.nextInt();
				if(o==1) {
					for(int i=0;i<vehiculos.size();i++) {
						if(vehiculos.get(i)instanceof Taxi){
							vehiculos.get(i).mostrar();
						}				
					}
				}else if(o==2) {
					for(int i=0;i<vehiculos.size();i++) {
						if(vehiculos.get(i)instanceof Autobus){
							vehiculos.get(i).mostrar();
						}				
					}
				}else {
					System.out.println("Opcion no valida");
				}
			break;
		case 2:
			break;
		}
	}
//buscar vehiculo por matricula
	public void buscarVehiculoPorMatriculaYMostrar() {
		System.out.println("Ingrese matricula");
		String matricula = scanner.nextLine();
		for(int i=0;i<clientes.size();i++) {
			if(matricula.equals(vehiculos.get(i).getMatricula())) {
				clientes.get(i).mostrar();
			}
		}
	}
	public int buscarVehiculoPorMatricula(String matricula) {
		matricula = scanner.nextLine();
		for(int i=0;i<clientes.size();i++) {
			if(matricula.equals(vehiculos.get(i).getMatricula())) {
				return i;
			}
		}
		return -1;
	}
//registrar poliza
	public void registrarPoliza() {
		System.out.println("Ingrese DNI de persona");
		int dni = scanner.nextInt();
		//System.out.println("Ingrese matricula de vehiculo:");
		//String matri = scanner.nextLine();
		Cliente cliente;
		if (buscarPorDocumento(dni)==-1) {
			System.out.println("no se encontro");
			cliente = new Cliente();
			clientes.add(cliente);
			
		}else {
			cliente=clientes.get(buscarPorDocumento(dni));
		}
		System.out.println("Ingrese matricula de vehiculo:");
		String matri = scanner.nextLine();
		Vehiculo vehiculo;
		int indice= buscarVehiculoPorMatricula(matri);
		if (indice==-1) {
			System.out.println("Que desea cargar: 1)Taxi, 2)Autobus");
			int o=scanner.nextInt();
			switch(o) {
			case 1: 
				vehiculo= new Taxi();
				vehiculos.add(vehiculo);
				break;
			case 2: 
				vehiculo=new Autobus();
				vehiculos.add(vehiculo);
				default:
					System.out.println("opcion no valida, por defecto taxi.");
					vehiculo= new Taxi();
					vehiculos.add(vehiculo);
			}
		}else {
			vehiculo=vehiculos.get(indice);
		}
		Poliza poliza = new Poliza(vehiculo,cliente);
		polizas.add(poliza);
		
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

