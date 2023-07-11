package resol;

public class Cuota {
	private int nroCuota;
	private int montoTotalCuota;
	private boolean estaPaga;
	private String fecha_vencimiento;
	private formaDePago formaPago;
	public Cuota(int nroCuota, int montoTotalCuota, boolean estaPaga, String fecha_vencimiento, formaDePago formaPago) {
		super();
		this.nroCuota = nroCuota;
		this.montoTotalCuota = montoTotalCuota;
		this.estaPaga = estaPaga;
		this.fecha_vencimiento = fecha_vencimiento;
		this.formaPago = formaPago;
	}
	public Cuota() {
		
	}
	//gettes y setters
	public int getNroCuota() {
		return nroCuota;
	}
	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}
	public int getMontoTotalCuota() {
		return montoTotalCuota;
	}
	public void setMontoTotalCuota(int montoTotalCuota) {
		this.montoTotalCuota = montoTotalCuota;
	}
	public boolean isEstaPaga() {
		return estaPaga;
	}
	public void setEstaPaga(boolean estaPaga) {
		this.estaPaga = estaPaga;
	}
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public formaDePago getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(formaDePago formaPago) {
		this.formaPago = formaPago;
	}
	
}
