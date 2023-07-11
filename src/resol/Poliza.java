package resol;
import java.util.ArrayList;
import java.util.Scanner;
public class Poliza {
	private static int nro=1000;
	private Vehiculo vehiculo;
	private Cliente cliente;
	private int nroPoliza;
	private String fecha_inicio;
	private String fecha_fin;
	private int cantidadCuotas;
	private formaDePago formaPago;
	private int montoTotalAsegurado;
	private boolean incluyeGranizo;
	private int montoGranizoMaximo;
	private tipoCobertura tipoCobertura;
	private ArrayList<Cuota>cuotas;
	
	Scanner scanner = new Scanner(System.in);
	
	public Poliza(Vehiculo vehiculo, Cliente cliente, String fecha_inicio, String fecha_fin,
			int cantidadCuotas, formaDePago formaPago, int montoTotalAsegurado, boolean incluyeGranizo,
			int montoGranizoMaximo, resol.tipoCobertura tipoCobertura) {
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.nroPoliza = nro++;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.cantidadCuotas = cantidadCuotas;
		this.formaPago = formaPago;
		this.montoTotalAsegurado = montoTotalAsegurado;
		this.incluyeGranizo = incluyeGranizo;
		this.montoGranizoMaximo = montoGranizoMaximo;
		this.tipoCobertura = tipoCobertura;
		this.cuotas = new ArrayList();
		int montoCuota =this.montoTotalAsegurado/this.cantidadCuotas;
		for(int i=0;i<this.cantidadCuotas;i++) {
			this.cuotas.add(new Cuota(i+1,montoCuota,false, null, null));
		}
	}

	public Poliza() {
		System.out.println("NUEVA POLIZA:");
		this.nroPoliza = nro++;
		System.out.println("Ingrese fecha de inicio");
		this.fecha_inicio=scanner.nextLine();
		System.out.println("Ingrese fecha de fin");
		this.fecha_fin=scanner.nextLine();
		System.out.println("Ingrese cantidad de cuotas");
		this.cantidadCuotas=scanner.nextInt();
		System.out.println("Ingrese forma de pago (1)EFECTIVO, 2)TRANSFERENCIA, 3)DEBITO");
		int opcion = scanner.nextInt();
		switch (opcion) {
		case 1: 
			this.formaPago=formaDePago.EFECTIVO;
			break;
		case 2:
			this.formaPago=formaDePago.TRANSFERENCIA;
			break;
		case 3:
			this.formaPago=formaDePago.DEBITO;
			break;
			default:
				System.out.println("OPCION INCORRECTA, PREDETERMINADO EFECTIVO");
				this.formaPago=formaDePago.EFECTIVO;
		}
		System.out.println("Ingrese monto total asegurado");
		this.montoTotalAsegurado=scanner.nextInt();
		System.out.println("Incluye granizo? (1)SI, 2)NO)");
		int o = scanner.nextInt();
		if (o==1) {
			this.incluyeGranizo=true;
		}else if (o==2) {
			this.incluyeGranizo=false;
		}else {
			System.out.println("OPCION NO VALIDA, NO POR DEFECTO");
			this.incluyeGranizo=false;
		}
		System.out.println("Monto maximo graniz (poner 0 si no incluye)");
		this.montoGranizoMaximo=scanner.nextInt();
		System.out.println("Tipo Cobertura: (1)TOTAL, 2) CONTRA TERCEROS, 3)PARCIAL");
		opcion = scanner.nextInt();
		switch (opcion) {
		case 1: 
			this.tipoCobertura=tipoCobertura.TOTAL;
			break;
		case 2:
			this.tipoCobertura=tipoCobertura.TERCEROS;
			break;
		case 3:
			this.tipoCobertura=tipoCobertura.PARCIAL;
			break;
			default:
				System.out.println("OPCION INCORRECTA, PREDETERMINADO CONTRA TERCEROS");
				this.tipoCobertura=tipoCobertura.TERCEROS;
		}
		this.cuotas = new ArrayList();
		int montoCuota =this.montoTotalAsegurado/this.cantidadCuotas;
		for(int i=0;i<this.cantidadCuotas;i++) {
			this.cuotas.add(new Cuota(i+1,montoCuota,false, null, null));
		}
	}
	//getters y setters:

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public int getCantidadCuotas() {
		return cantidadCuotas;
	}

	public void setCantidadCuotas(int cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}

	public formaDePago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(formaDePago formaPago) {
		this.formaPago = formaPago;
	}

	public int getMontoTotalAsegurado() {
		return montoTotalAsegurado;
	}

	public void setMontoTotalAsegurado(int montoTotalAsegurado) {
		this.montoTotalAsegurado = montoTotalAsegurado;
	}

	public boolean isIncluyeGranizo() {
		return incluyeGranizo;
	}

	public void setIncluyeGranizo(boolean incluyeGranizo) {
		this.incluyeGranizo = incluyeGranizo;
	}

	public int getMontoGranizoMaximo() {
		return montoGranizoMaximo;
	}

	public void setMontoGranizoMaximo(int montoGranizoMaximo) {
		this.montoGranizoMaximo = montoGranizoMaximo;
	}

	public tipoCobertura getTipoCobertura() {
		return tipoCobertura;
	}

	public void setTipoCobertura(tipoCobertura tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}
	
	
	
}

