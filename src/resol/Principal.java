package resol;

import java.util.Scanner;

public class Principal {
	private static String eleccion="";
	private static void mostrarMenu()
	{
		System.out.println("Menu: ");
		System.out.println("1: Registrar cliente");
		System.out.println("2: Listar todos los clientes");
		System.out.println("3: Buscar cliente por documento");
		System.out.println("4: Registrar vehiculo");
		System.out.println("5: Listar todos los vehiculos");
		System.out.println("6: Listar vehiculos por tipo y cobertura segun se especifique");
		System.out.println("7: Cambio de seccion de un empleado de servicio");
		System.out.println("8: Buscar vehiculo por matricula");
		System.out.println("9: Registrar una poliza");
		System.out.println("10: Pagar cuota");
		System.out.println("11: Listar polizar por tipo de cobertura");
		System.out.println("12: Buscar poliza, mostrar informacion y lista de cuotas");
		System.out.println("13: Ver datos estadisticos.");
		
		System.out.println("q: Salir");	
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Opción: ");
		eleccion = scanner.nextLine();
	}
	public static void main(String[] args) {
		Aseguradora ase = new Aseguradora();
			while (!eleccion.equals("q"))
			 {
				mostrarMenu();	
				switch (eleccion){
				case "1":
					ase.agregarPersona();
					break;
				case "2":
					ase.listarPersonas();
					break;
				case "3":
					ase.buscarPorDocumentoYMostrar();
					break;
				case "4":
					
					
					break;
				case "5":
					
					break;
				case "6":
					
					break;
				case "7":
					
					break;
				case "8":
					
					break;
				case "9":
					
					break;
				case "10":
					
					break;
				case "11":
					
					break;
				case "12":
				
					break;
				case "13":
					
					break;
					
				case "q":
					System.out.println("Saliendo del sistema...");
					break;
					default:
						System.out.println("Ingreso opcion incorrecta.");
				}  
			}		
		}
	}

