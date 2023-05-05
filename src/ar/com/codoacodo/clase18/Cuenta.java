package ar.com.codoacodo.clase18;

import java.time.LocalDate;

public class Cuenta implements Comparable<Cuenta> {

	private Long id;
	private LocalDate fechaAlta;
	private Integer sucursal;
	private TipoCuentaEnum tipoCuenta;
	private String numero;
	private Double saldo;
	

	public Cuenta(Long id, LocalDate fechaAlta, Integer sucursal, TipoCuentaEnum tipoCuenta, String numero,Double saldo) {
		super();
		this.id = id;
		this.fechaAlta = fechaAlta;
		this.sucursal = sucursal;
		this.tipoCuenta = tipoCuenta;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int compareTo(Cuenta o) {
		return o.getId().compareTo(this.getId());
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public Integer getSucursal() {
		return sucursal;
	}

	public TipoCuentaEnum getTipoCuenta() {
		return tipoCuenta;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", fechaAlta=" + fechaAlta + ", sucursal=" + sucursal + ", tipoCuenta=" + tipoCuenta
				+ ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	
}
