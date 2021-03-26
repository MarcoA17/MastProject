package org.codigorupestre.ejersicio.model;

public class Voleto {

	private String numVoleto;
	private String aerolinea;
	private String salida;
	private String destino;
	private String horario;
	private String asiento;
	private String precio;
	/**
	 * 
	 */
	public Voleto() {

	}
	/**
	 * @param numVoleto
	 * @param aerolinea
	 * @param salida
	 * @param destino
	 * @param horario
	 * @param asiento
	 * @param precio
	 */
	public Voleto(String numVoleto, String aerolinea, String salida, String destino, String horario, String asiento, String precio) {
		super();
		this.numVoleto = numVoleto;
		this.aerolinea = aerolinea;
		this.salida = salida;
		this.destino = destino;
		this.horario = horario;
		this.asiento = asiento;
		this.precio = precio;
	}
	
	/**
	 * @return the numVoleto
	 */
	public String getNumVoleto() {
		return numVoleto;
	}
	/**
	 * @param numVoleto the numVoleto to set
	 */
	public void setNumVoleto(String numVoleto) {
		this.numVoleto = numVoleto;
	}
	/**
	 * @return the aerolinea
	 */
	public String getAerolinea() {
		return aerolinea;
	}
	/**
	 * @param aerolinea the aerolinea to set
	 */
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	/**
	 * @return the salida
	 */
	public String getSalida() {
		return salida;
	}
	/**
	 * @param salida the salida to set
	 */
	public void setSalida(String salida) {
		this.salida = salida;
	}
	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}
	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
	/**
	 * @return the asiento
	 */
	public String getAsiento() {
		return asiento;
	}
	/**
	 * @param asiento the asiento to set
	 */
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}
		
}
